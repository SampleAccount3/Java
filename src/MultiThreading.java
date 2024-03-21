public class MultiThreading implements Runnable {
    int threadCount;
    public MultiThreading (int threadCount){
        this.threadCount = threadCount;
    }
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(i+ ": This is Thread " + threadCount);
            try {
                // delays for 1 sec
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
