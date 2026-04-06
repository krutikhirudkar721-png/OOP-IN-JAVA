// Synchronization to avoid double booking
class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        Runnable task = () -> obj.bookTicket();

        new Thread(task).start();
        new Thread(task).start();
    }
}
