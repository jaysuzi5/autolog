package com.autolog.vehicleservice.controller;

import com.autolog.vehicleservice.dto.VehicleRequestDTO;
import com.autolog.vehicleservice.dto.VehicleResponseDTO;
import com.autolog.vehicleservice.service.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicles")
@Tag(name = "Vehicle", description = "API for managing Vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    @Operation(summary = "Get Vehicles")
    public ResponseEntity<List<VehicleResponseDTO>> getVehicles() {
        List<VehicleResponseDTO> vehicles = vehicleService.getVehicles();
        return ResponseEntity.ok().body(vehicles);
    }

    @PostMapping
    @Operation(summary = "Create a new Vehicle")
    public ResponseEntity<VehicleResponseDTO> createVehicle(
            @Valid @RequestBody VehicleRequestDTO vehicleRequestDTO) {
        VehicleResponseDTO vehicleResponseDTO = vehicleService.createVehicle(vehicleRequestDTO);
        return ResponseEntity.ok().body(vehicleResponseDTO);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing Vehicle")
    public ResponseEntity<VehicleResponseDTO> updateVehicle(@PathVariable UUID id,
                                                            @Valid @RequestBody VehicleRequestDTO vehicleRequestDTO) {
        VehicleResponseDTO vehicleResponseDTO = vehicleService.updateVehicle(id, vehicleRequestDTO);
        return ResponseEntity.ok().body(vehicleResponseDTO);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a Vehicle")
    public ResponseEntity<Void> deleteVehicle(@PathVariable UUID id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.noContent().build();
    }

}
