package 多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Thread;

public class ThreadlPool {
    public static void main(String[] args) throws Exception{
        // 创建无限线程池
        ExecutorService pool = Executors.newCachedThreadPool();
        // 创建单个线程
        ExecutorService poolSingle = Executors.newSingleThreadScheduledExecutor();
        // 创建指定数量的线程
        ExecutorService poolFix = Executors.newFixedThreadPool(3);

        for(int item = 0; item < 10; item++){
            int index = item;
            pool.submit(() ->{
                System.out.println("线程的名字：" + Thread.currentThread().getName() + ";item的值为:" + index);
            });
        }

        pool.shutdown();
    }
}
