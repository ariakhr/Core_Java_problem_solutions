package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample implements Runnable {

    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            new ExecutorServiceExample();
        });
    }

    @Override
    public void run() {
        System.out.println("Running task...!");
    }
}
