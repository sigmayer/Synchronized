public class Main {

    public static void main(String[] args) {
    Integer a = 5;
    Integer b = 10;
	FirstThread thread1 = new FirstThread(a, b);
	SecondThread thread2 = new SecondThread(a, b);

	Thread thrd1 = new Thread(thread1);
	Thread thrd2 = new Thread(thread2);

	thrd1.start();
	thrd2.start();
    }
}
