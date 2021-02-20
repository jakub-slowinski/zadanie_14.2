import java.util.Queue;

class Inspection {

    Vehicle send(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println("Brak pojazdów w kolejce. Fajrant.");
            return
        } else {
            Vehicle inspectedVehicle = (Vehicle) queue.poll();
            System.out.println(inspectedVehicle);
            return inspectedVehicle;
        }
    }

}
