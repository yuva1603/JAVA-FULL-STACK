package classjava7_ThreadImplementation;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Thread_Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
