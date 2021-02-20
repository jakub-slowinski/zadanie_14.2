import java.util.Queue;

class Inspection {

    void send(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println("Brak pojazdów w kolejce. Fajrant.");
        } else {
            Vehicle inspectedVehicle = (Vehicle) queue.poll();
            System.out.println(inspectedVehicle);
        }
    }

}
