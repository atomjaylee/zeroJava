package 多线程;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) throws Exception{
        // 创建一个具备三个线程大小的定时调度线程池
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        for(int item = 0; item< 10; item++){
            Thread.sleep(200);
            int index = item;
            // 创建一个可调度线程，以秒为单位， 3秒后开始，而后每2秒执行一次
            executorService.scheduleAtFixedRate(() ->{
                System.out.println(Thread.currentThread().getName() + ",x =" + index);
            },3,2, TimeUnit.SECONDS);
        }

        // executorService.shutdown(); 关闭线程池
    }
}
