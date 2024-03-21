
public class Main {
    public static void main(String[] args) {
        System.out.println("HEllo WOrld");
        // creates 5 new instance of multiThreading
        for (int i = 1; i <= 5; i++) {
            MultiThreading multiThreading = new MultiThreading(i);
            // implementing the Runnable has more advantage than extending the Thread
            // call the Thread class then pass the ultiThreading class as a target
            Thread myThread = new Thread(multiThreading);
            // Starts the Thread
            myThread.start();
            try {
                // w8s for the Thread to die then continue the next Thread
                // Try Catch is Required
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
