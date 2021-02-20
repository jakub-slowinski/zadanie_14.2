import java.lang.reflect.Array;
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

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Motorbike("Kawasaki", "Z 750R", 2015, 11400,
                "ER23049ew209", "motorbike", false);
        vehicles[1] = new Car("Opel", "Meriva B", 2017, 77500,
                "WOL2304921343", "car", 5);
        vehicles[2] = new Car("Renault", "Megane 2", 2011, 177500,
                "WOL098234983", "car", 5);
        vehicles[3] = new Truck("Mercedes", "Actross 4148 8x6", 2010, 51300,
                "XCNXN230984xcm", "truck", 16400);


        Queue<Vehicle> serviceQueue = new LinkedList<>();

        while (option != exit) {
            System.out.println("Wybierz co ma robić program");
        }
        System.out.println("0 - program zakończy działanie");
        System.out.println("1 - program pobiera informację i zapisuje pojazd w kolejce");
        System.out.println("2 - program pobiera pojazd z kolejki i wykonuje przegląd");

        option = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;

        switch (option) {
            case takeToQueue:
                serviceQueue.offer(vehicles[counter]);
                break;
            case makeInspection:



                
        }


        Queue<Vehicle> vehicles = new LinkedList<>();

    }

}

