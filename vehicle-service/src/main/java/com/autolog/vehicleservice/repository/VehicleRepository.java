package com.autolog.vehicleservice.repository;

import com.autolog.vehicleservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    // Simple example to test validation - For now, you can not register a car of the same color
    boolean existsVehicleByColor(String color);
}
