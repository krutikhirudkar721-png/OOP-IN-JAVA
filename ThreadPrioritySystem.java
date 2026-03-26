// Create threads with different priorities

class ThreadPrioritySystem {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> System.out.println("Low Priority"));
        Thread t2 = new Thread(() -> System.out.println("High Priority"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
