package com.autolog.vehicleservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class VehicleRequestDTO {
    @NotBlank(message = "Year is required")
    @Size(min = 4, max = 4, message = "Year must be 4 digit")
    private String year;

    @NotBlank(message = "Make is required")
    @Size(max = 100, message = "Make cannot exceed 100 characters")
    private String make;

    @NotBlank(message = "Model is required")
    @Size(max = 100, message = "Model cannot exceed 100 characters")
    private String model;

    @NotBlank(message = "Color is required")
    @Size(max = 100, message = "Color cannot exceed 100 characters")
    private String color;

    @Size(max = 100, message = "VIN cannot exceed 100 characters")
    private String vin;

    @Size(max=20, message = "Plate cannot exceed 20 characters")
    private String plate;

    @Size(max = 100, message = "Registration cannot exceed 100 characters")
    private String registration;

    @Size(max = 2, message = "Registration State cannot exceed 2 characters")
    private String registrationState;

    @NotBlank(message = "Purchase Date is required")
    @Size(max = 10, message = "Purchase Date cannot exceed 10 characters")
    private String purchaseDate;

    @NotBlank(message = "Purchase Price is required")
    @Size(max = 10, message = "Purchase Price cannot exceed 10 characters")
    private String purchasePrice;

    @NotBlank(message = "Purchase Odometer is required")
    @Size(max = 10, message = "Purchase Odometer cannot exceed 10 characters")
    private String purchaseOdometer;

    @NotBlank(message = "Dealer is required")
    @Size(max = 100, message = "Dealer Name cannot exceed 100 characters")
    private String dealerName;

    @Size(max = 10, message = "Sold Date cannot exceed 10 characters")
    private String soldDate;

    @Size(max = 10, message = "Sold Price cannot exceed 10 characters")
    private String soldPrice;

    @Size(max = 10, message = "Sold Odometer cannot exceed 10 characters")
    private String soldOdometer;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
        return registrationState;
    }

    public void setRegistrationState(String registrationState) {
        this.registrationState = registrationState;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseOdometer() {
        return purchaseOdometer;
    }

    public void setPurchaseOdometer(String purchaseOdometer) {
        this.purchaseOdometer = purchaseOdometer;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(String soldDate) {
        this.soldDate = soldDate;
    }

    public String getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(String soldPrice) {
        this.soldPrice = soldPrice;
    }

    public String getSoldOdometer() {
        return soldOdometer;
    }

    public void setSoldOdometer(String soldOdometer) {
        this.soldOdometer = soldOdometer;
    }
}
