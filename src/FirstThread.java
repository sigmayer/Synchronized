public class FirstThread implements Runnable{

    private Integer num1;
    private Integer num2;

    public FirstThread(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        synchronized (num1) {
            System.out.println("Thread1 is holding num1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException a) {}
            System.out.println("Thread1 is waiting for num2");
            synchronized (num2) {
                System.out.println("Thread1 is holding num1 & num2");
            }
        }
    }
}
