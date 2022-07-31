package lesson4;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(4);
////        ExecutorService service = Executors.newSingleThreadExecutor();
////        ExecutorService service = Executors.newCachedThreadPool();
//
//        for (int i = 0; i < 10; i++) {
//            final int w = i;
//            service.execute(() -> {
//                System.out.println(w + " start");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(w + " end");
//            });
//        }
//
//        service.shutdown();
//        System.out.println("END");


//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
////        service.schedule(() -> {
////            System.out.println(1);
////        }, 3, TimeUnit.SECONDS);
//
//        service.scheduleAtFixedRate(()-> System.out.println(1), 2, 3, TimeUnit.SECONDS);
//        service.scheduleWithFixedDelay(()-> System.out.println(1), 2, 3, TimeUnit.SECONDS);
//
////        service.shutdown();


//        ExecutorService service = Executors.newFixedThreadPool(4);
//
//        for (int i = 0; i < 10; i++) {
//            final int w = i;
//            service.execute(() -> {
//                System.out.println(w + " start");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(w + " end");
//            });
//        }
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        List<Runnable> tasks = service.shutdownNow();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(tasks.size());
//
//        new Thread(tasks.get(0)).start();
//        new Thread(tasks.get(1)).start();


//        Thread t = new Thread(()->{
//            while (!Thread.currentThread().isInterrupted()){
//                System.out.println(1);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
////                    Thread.currentThread().interrupt();
//                    break;
//                }
//            }
//        });
//
//        t.start();
//
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        t.interrupt();



        ExecutorService service = Executors.newFixedThreadPool(4);

//        Future future = service.submit(() -> System.out.println(1));

        Future<String> future = service.submit(() -> {
            Thread.sleep(5000);
            return "java";
        });

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(future.isDone());
        try {
            System.out.println(future.get(3, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        service.shutdown();

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
