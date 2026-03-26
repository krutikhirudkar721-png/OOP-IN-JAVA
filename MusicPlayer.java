// Create thread using Thread class and show progress

class MusicPlayer extends Thread {
    public void run() {
        try {
            System.out.println("Playing song...");
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000);
                System.out.println("Progress " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        new MusicPlayer().start();
    }
}
