package com.autolog.vehicleservice.service;

import com.autolog.vehicleservice.dto.VehicleRequestDTO;
import com.autolog.vehicleservice.dto.VehicleResponseDTO;
import com.autolog.vehicleservice.exception.ColorAlreadyExistException;
import com.autolog.vehicleservice.exception.VehicleNotFoundException;
import com.autolog.vehicleservice.mapper.VehicleMapper;
import com.autolog.vehicleservice.model.Vehicle;
import com.autolog.vehicleservice.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<VehicleResponseDTO> getVehicles(){
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles.stream().map(VehicleMapper::toDTO).toList();
    }

    public VehicleResponseDTO createVehicle(VehicleRequestDTO vehicleRequestDTO) {
        // Simple example of testing a custom exception, but this one doesn't really make sense so will
        // will be commenting it out
        /* if(vehicleRepository.existsVehicleByColor(vehicleRequestDTO.getColor())){
            throw new ColorAlreadyExistException("A vehicle of this color already exists: "
                    + vehicleRequestDTO.getColor());
        }
         */
        Vehicle vehicle = vehicleRepository.save(VehicleMapper.toModel(vehicleRequestDTO));
        return VehicleMapper.toDTO(vehicle);
    }

    public VehicleResponseDTO updateVehicle(UUID id, VehicleRequestDTO vehicleRequestDTO) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow(() ->
                new VehicleNotFoundException("Vehicle not found with ID: " + id));
        VehicleMapper.setVehicle(vehicleRequestDTO, vehicle);
        Vehicle updatedVehicle = vehicleRepository.save(vehicle);
        return VehicleMapper.toDTO(updatedVehicle);
    }

    public void deleteVehicle(UUID id) {
        vehicleRepository.deleteById(id);
    }
}
