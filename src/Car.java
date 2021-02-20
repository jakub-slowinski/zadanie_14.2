class Car extends Vehicle {

    private int seatsInCar;

    Car(String brand, String model, int yearOfProduction,
        double mileage, String vehicleIdNumber, String typeOfVehicle, int seatsInCar) {
        super(brand, model, yearOfProduction, mileage, vehicleIdNumber, typeOfVehicle);
        this.seatsInCar = seatsInCar;
    }

    int getSeatsInCar() {
        return seatsInCar;
    }

    void setSeatsInCar(int seatsInCar) {
        this.seatsInCar = seatsInCar;
    }
}
