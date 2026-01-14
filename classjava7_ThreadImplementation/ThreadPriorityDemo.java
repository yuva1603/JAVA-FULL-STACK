package classjava7_ThreadImplementation;

class PriorityTask extends Thread {

    PriorityTask(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                getName() + " running with priority " + getPriority()
            );
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityTask t1 = new PriorityTask("Low Priority Thread", Thread.MIN_PRIORITY);
        PriorityTask t2 = new PriorityTask("Normal Priority Thread", Thread.NORM_PRIORITY);
        PriorityTask t3 = new PriorityTask("High Priority Thread", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}