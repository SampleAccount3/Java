
public class Main {
    public static void main(String[] args) {
        System.out.println("HEllo WOrld");
        // shows the Number of Threads Currently Running
        System.out.println(Thread.activeCount());
        // sets the Name of the current Thread
        // default name is main
        Thread.currentThread().setName("CustomName");
        // gets the Name of the current Thread
        System.out.println(Thread.currentThread().getName());

        // Thread Priority Scaling 1-10 (1 = Lowest|10 = Highest)
        // sets the Priorityoof this Thread
        Thread.currentThread().setPriority(10);
        // check the Priority of this Thread
        System.out.println(Thread.currentThread().getPriority());

        // checks the current Thread if its running
        System.out.println("Is this Thread Alive?: "+Thread.currentThread().isAlive());

        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        System.out.println(myThread.getName());// MyThread
        myThread.start(); // This Thread is running


        MyThread myThread1 = new MyThread();
        myThread1.setName("MyThread1");
        System.out.println(myThread1.getName());// MyThread1
        myThread1.start(); // This Thread is running



    }
}
