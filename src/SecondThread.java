public class SecondThread implements Runnable{

    private Integer num1;
    private Integer num2;

    public SecondThread(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        synchronized (num2) {
            System.out.println("Thread2 is holding num2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException a) {}
            System.out.println("Thread2 is waiting for num1");
            synchronized (num1) {
                System.out.println("Thread2 is holding num2 & num1");
            }
        }
    }
}
