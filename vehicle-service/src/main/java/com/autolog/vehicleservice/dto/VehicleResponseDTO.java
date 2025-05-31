package com.autolog.vehicleservice.dto;

public class VehicleResponseDTO {
    private String id;
    private String vehicleYear;
    private String model;
    private String make;
    private String color;
    private String vin;
    private String plate;
    private String registration;
    private String registrationState;
    private String purchaseDate;
    private String purchaseOdometer;
    private String purchasePrice;
    private String dealerName;
    private String soldDate;
    private String soldOdometer;
    private String soldPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return vehicleYear;
    }

    public void setYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public String getPurchaseOdometer() {
        return purchaseOdometer;
    }

    public void setPurchaseOdometer(String purchaseOdometer) {
        this.purchaseOdometer = purchaseOdometer;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
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

    public String getSoldOdometer() {
        return soldOdometer;
    }

    public void setSoldOdometer(String soldOdometer) {
        this.soldOdometer = soldOdometer;
    }

    public String getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(String soldPrice) {
        this.soldPrice = soldPrice;
    }
}
