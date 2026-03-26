// Multiple threads using Runnable

class DownloadTask implements Runnable {
    String file;

    DownloadTask(String file) {
        this.file = file;
    }

    public void run() {
        System.out.println("Downloading " + file);
    }
}

class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadTask("File1"));
        Thread t2 = new Thread(new DownloadTask("File2"));

        t1.start();
        t2.start();
    }
}
