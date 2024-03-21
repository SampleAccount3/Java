public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("This Thread is running");
        System.out.println(Thread.activeCount());//4
        // Threads sleep delays the process by xxxx milisecs
        for (int i = 1; i <= 5; i ++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("Thread Exit");

    }
}
