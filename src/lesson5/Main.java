package lesson5;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("java");
//        ThreadFactory factory = new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread t = new Thread(r);
//                t.setDaemon(true);
//                t.setName("qweqw");
//                return t;
//            }
//        };
//        ExecutorService service = Executors.newFixedThreadPool(4,factory);
//
//        service.execute(()->{
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        service.shutdown();


        List<Callable<String>> tasks = new ArrayList<>(Arrays.asList(
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.println("java");
                        System.out.println("1");
                        Thread.sleep(1000);
                        System.out.println("1 end");
                        return "java 1";
                    }
                },
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.println("2");
                        Thread.sleep(2000);
                        System.out.println("2 end");
                        return "java 2";
                    }
                },
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.println("3");
                        Thread.sleep(3000);
                        System.out.println("3 end");
                        return "java 3";
                    }
                }
        ));

        ExecutorService service = Executors.newFixedThreadPool(4);

        try {
            List<Future<String>> result = service.invokeAll(tasks);
//            for (int i = 0; i < result.size(); i++) {
//                System.out.println(result.get(i).get());
//            }
//            String res = service.invokeAny(tasks);
//            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
            } finally {

        }

        service.shutdown();


//        FutureTask<String> ft = new FutureTask<>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "java";
//            }
//        });
//
//        new Thread(ft).start();
//
//        try {
//            System.out.println(ft.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


//        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
//        List<String> list = new Vector<>();
//        List<String> list = new CopyOnWriteArrayList<>();

//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        Map<String, Integer> map = new Hashtable<>();
//        Map<String, Integer> map1 = Collections.synchronizedMap(map);
//        Map<String, Integer> map = new ConcurrentHashMap<>();


//        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(4);
//
//        Thread baker = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(2000);
//                    System.out.println("Хлеб испечен");
//                    abq.put("Хлеб");
//                    System.out.println("Хлеб добавлен в полку");
//                    System.out.println(abq);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread buyers = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(3000);
//                    System.out.println("Покупатель подошел к полке");
//                    abq.take();
//                    System.out.println("Хлеб куплен");
//                    System.out.println(abq);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        baker.start();
//        buyers.start();

//        Semaphore smp = new Semaphore(4);
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++) {
//            final int w = i;
//            service.execute(() -> {
//                try {
//                    smp.acquire();
//                    System.out.println(w + " start");
//                    Thread.sleep(2000);
//                    System.out.println(w + " end");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    smp.release();
//                }
//            });
//        }
//
//        service.shutdown();
//
//        System.out.println("END");


//        CountDownLatch cdl = new CountDownLatch(5);
//
//        for (int i = 0; i < 5; i++) {
//            final int w = i;
//            new Thread(() -> {
//                try {
//                    System.out.println(w + " start");
//                    Thread.sleep(2000 + w * 1000);
//                    System.out.println(w + " end");
//                    cdl.countDown();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
//
//        try {
//            cdl.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("END");


//        CyclicBarrier cb = new CyclicBarrier(3);
//
//        for (int i = 0; i < 3; i++) {
//            final int w = i;
//            new Thread(() -> {
//                try {
//                    System.out.println(w + " start");
//                    Thread.sleep(2000 + w * 2000);
//                    System.out.println(w + " ready");
//                    cb.await();
//                    System.out.println(w + " go go go");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
//
//        System.out.println("END");


//        final Object mon = new Object();
//        new Thread(() -> {
//            synchronized (mon) {
//
//            }
//        }).start();
//
//        new Thread(() -> {
//            synchronized (mon) {
//
//            }
//        }).start();


//        Lock lock = new ReentrantLock();

//        new Thread(() -> {
//            System.out.println(1);
//
//            lock.lock();
//            System.out.println(11);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            lock.unlock();
//
//            System.out.println(111);
//        }).start();
//
//        new Thread(() -> {
//            System.out.println(2);
//
//            lock.lock();
//            System.out.println(22);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            lock.unlock();
//
//            System.out.println(222);
//        }).start();


//        new Thread(() -> {
//            System.out.println(1);
//
//            if (lock.tryLock()) {
//                System.out.println(11);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                lock.unlock();
//            }
//
//            System.out.println(111);
//        }).start();
//
//        new Thread(() -> {
//            System.out.println(2);
//
//            if (lock.tryLock()) {
//                System.out.println(22);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                lock.unlock();
//            }
//
//            System.out.println(222);
//        }).start();


//        new Thread(() -> {
//            System.out.println(1);
//
//            try {
//                if (lock.tryLock(3, TimeUnit.SECONDS)) {
//                    System.out.println(11);
//                    Thread.sleep(4000);
//                    lock.unlock();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(111);
//        }).start();
//
//        new Thread(() -> {
//            System.out.println(2);
//
//            try {
//                if (lock.tryLock(3, TimeUnit.SECONDS)) {
//                    System.out.println(22);
//                    Thread.sleep(4000);
//                    lock.unlock();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(222);
//        }).start();


//        ReadWriteLock rwl = new ReentrantReadWriteLock();
//        rwl.readLock().lock();
//        rwl.readLock().unlock();
//
//        rwl.writeLock().lock();
//        rwl.writeLock().unlock();


//        AtomicInteger ai = new AtomicInteger(10);
//
//        System.out.println(ai.get());
////        System.out.println(ai.getAndAdd(5));
////        System.out.println(ai.addAndGet(5));
////        System.out.println(ai.decrementAndGet());
////        System.out.println(ai.compareAndSet(12, 20));
//
////        ai.updateAndGet(x -> x * x);
////        ai.accumulateAndGet(3, (a, b) -> a - b);
//
//        System.out.println(ai.get());



    }
}
