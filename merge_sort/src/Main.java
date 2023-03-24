import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(CounterThread.count.get());
    }
}

class CounterThread extends Thread {
    public static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        IntStream.range(0, 100_000).forEach(i -> {
           count.incrementAndGet();
        });
    }
}