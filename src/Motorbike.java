class Motorbike extends Vehicle {

    private boolean sidecar;

    Motorbike(String brand, String model, int yearOfProduction,
              double mileage, String vehicleIdNumber, String typeOfVehicle, boolean sidecar) {
        super(brand, model, yearOfProduction, mileage, vehicleIdNumber, typeOfVehicle);
        this.sidecar = sidecar;
    }

    boolean isSidecar() {
        return sidecar;
    }

    void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}
