package classjava7_ThreadImplementation;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main_Extends {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // starts a new thread
    }
}

