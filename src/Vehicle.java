import java.util.Scanner;

class Vehicle {

    private String typeOfVehicle;
    private String brand;
    private String model;
    private int yearOfProduction;
    private double mileage;
    private String vehicleIdNumber;

    Vehicle(String typeOfVehicle, String brand, String model, int yearOfProduction,
            double mileage, String vehicleIdNumber) {
        this.typeOfVehicle = typeOfVehicle;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.vehicleIdNumber = vehicleIdNumber;
    }

    String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    int getYearOfProduction() {
        return yearOfProduction;
    }

    void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    double getMileage() {
        return mileage;
    }

    void setMileage(double mileage) {
        this.mileage = mileage;
    }

    String getVehicleIdNumber() {
        return vehicleIdNumber;
    }

    void setVehicleIdNumber(String vehicleIdNumber) {
        this.vehicleIdNumber = vehicleIdNumber;
    }


}
