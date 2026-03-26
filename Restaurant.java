// Producer-Consumer using wait() and notify()

class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() throws InterruptedException {
        System.out.println("Chef preparing food...");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() throws InterruptedException {
        while (!foodReady) {
            wait();
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> {
            try { r.prepareFood(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { r.serveFood(); } catch (Exception e) {}
        }).start();
    }
}
