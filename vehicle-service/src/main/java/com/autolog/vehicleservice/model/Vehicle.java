package com.autolog.vehicleservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private Integer vehicleYear;

    @NotNull
    private String make;

    @NotNull
    private String model;

    @NotNull
    private String color;

    @NotNull
    private String vin;

    @NotNull
    private String plate;

    @NotNull
    private String registration;

    @NotNull
    private String registration_state;

    @NotNull
    private LocalDate purchaseDate;

    @NotNull
    private Double purchasePrice;

    @NotNull
    private Integer purchaseOdometer;

    @NotNull
    private String dealerName;

    @NotNull
    private LocalDate soldDate;

    @NotNull
    private Double soldPrice;

    @NotNull
    private Integer soldOdometer;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getYear() {
        return vehicleYear;
    }

    public void setYear(Integer year) {
        this.vehicleYear = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getRegistrationState() {
        return registration_state;
    }

    public void setRegistrationState(String state) {
        this.registration_state = state;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getPurchaseOdometer() {
        return purchaseOdometer;
    }

    public void setPurchaseOdometer(Integer purchaseOdometer) {
        this.purchaseOdometer = purchaseOdometer;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public LocalDate getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(LocalDate soldDate) {
        this.soldDate = soldDate;
    }

    public Double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public Integer getSoldOdometer() {
        return soldOdometer;
    }

    public void setSoldOdometer(Integer soldOdometer) {
        this.soldOdometer = soldOdometer;
    }
}
