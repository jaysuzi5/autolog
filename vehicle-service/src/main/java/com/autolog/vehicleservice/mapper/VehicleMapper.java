package com.autolog.vehicleservice.mapper;

import com.autolog.vehicleservice.dto.VehicleRequestDTO;
import com.autolog.vehicleservice.dto.VehicleResponseDTO;
import com.autolog.vehicleservice.model.Vehicle;

import java.time.LocalDate;
import java.util.Date;

public class VehicleMapper {
    public static VehicleResponseDTO toDTO(Vehicle vehicle) {
        VehicleResponseDTO vehicleResponseDTO = new VehicleResponseDTO();
        vehicleResponseDTO.setId(vehicle.getId().toString());
        vehicleResponseDTO.setYear(vehicle.getYear().toString());
        vehicleResponseDTO.setMake(vehicle.getMake());
        vehicleResponseDTO.setModel(vehicle.getModel());
        vehicleResponseDTO.setColor(vehicle.getColor());
        vehicleResponseDTO.setVin(vehicle.getVin());
        vehicleResponseDTO.setRegistration(vehicle.getRegistration());
        vehicleResponseDTO.setRegistrationState(vehicle.getRegistrationState());
        vehicleResponseDTO.setPlate(vehicle.getPlate());
        vehicleResponseDTO.setPurchaseDate(vehicle.getPurchaseDate().toString());
        vehicleResponseDTO.setPurchaseOdometer(vehicle.getPurchaseOdometer().toString());
        vehicleResponseDTO.setPurchasePrice(vehicle.getPurchasePrice().toString());
        vehicleResponseDTO.setDealerName(vehicle.getDealerName());
        vehicleResponseDTO.setSoldDate(vehicle.getSoldDate().toString());
        vehicleResponseDTO.setSoldOdometer(vehicle.getSoldOdometer().toString());
        vehicleResponseDTO.setSoldPrice(vehicle.getSoldPrice().toString());
        return vehicleResponseDTO;
    }


    public static Vehicle toModel(VehicleRequestDTO vehicleRequestDTO) {
        Vehicle vehicle = new Vehicle();
        setVehicle(vehicleRequestDTO, vehicle);
        return vehicle;
    }

    public static void setVehicle(VehicleRequestDTO vehicleRequestDTO, Vehicle vehicle) {
        vehicle.setYear(Integer.valueOf(vehicleRequestDTO.getYear()));
        vehicle.setMake(vehicleRequestDTO.getMake());
        vehicle.setModel(vehicleRequestDTO.getModel());
        vehicle.setColor(vehicleRequestDTO.getColor());
        vehicle.setVin(vehicleRequestDTO.getVin());
        vehicle.setRegistration(vehicleRequestDTO.getRegistration());
        vehicle.setRegistrationState(vehicleRequestDTO.getRegistrationState());
        vehicle.setPlate(vehicleRequestDTO.getPlate());
        vehicle.setPurchaseDate(LocalDate.parse(vehicleRequestDTO.getPurchaseDate()));
        vehicle.setPurchaseOdometer(Integer.valueOf(vehicleRequestDTO.getPurchaseOdometer()));
        vehicle.setPurchasePrice(Double.valueOf(vehicleRequestDTO.getPurchasePrice()));
        vehicle.setDealerName(vehicleRequestDTO.getDealerName());
        vehicle.setSoldDate(LocalDate.parse(vehicleRequestDTO.getSoldDate()));
        vehicle.setSoldOdometer(Integer.valueOf(vehicleRequestDTO.getSoldOdometer()));
        vehicle.setSoldPrice(Double.valueOf(vehicleRequestDTO.getSoldPrice()));
    }
}
