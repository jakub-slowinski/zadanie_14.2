import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Main {

    public static void main(String[] args) {

        final int exit = 0;
        final int takeToQueue = 1;
        final int makeInspection = 2;
        int option = -1;

        Scanner scanner = new Scanner(System.in);

        Queue<Vehicle> vehicles = new LinkedList<>();

        while (option != exit) {
            System.out.println("Wybierz co ma robić program");
            System.out.println("0 - program zakończy działanie");
            System.out.println("1 - program pobiera informację i zapisuje pojazd w kolejce");
            System.out.println("2 - program pobiera pojazd z kolejki i wykonuje przegląd");

            option = scanner.nextInt();
            scanner.nextLine();
            VehicleCreator vehicleCreator = new VehicleCreator();
            Inspection inspection = new Inspection();

            switch (option) {
                case takeToQueue -> {
                    vehicles.offer(vehicleCreator.create(scanner));
                    System.out.println("Pojazd zakolejkowany");
                    System.out.println(vehicles.peek());
                }
                case makeInspection -> {
                    inspection.send(vehicles);
                    System.out.println("Pojazd wysłany do przeglądu");
                }
                case exit -> System.out.println("Koniec programu");
                default -> System.out.println("Niewłaściwa operacja.");
            }
        }
    }

}

