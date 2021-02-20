class Truck extends Vehicle {

    private double loadWeight;

    Truck(String brand, String model, int yearOfProduction,
          double mileage, String vehicleIdNumber, String typeOfVehicle, double loadWeight) {
        super(brand, model, yearOfProduction, mileage, vehicleIdNumber, typeOfVehicle);
        this.loadWeight = loadWeight;
    }

    double getLoadWeight() {
        return loadWeight;
    }

    void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}
