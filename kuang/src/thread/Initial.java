package thread;

/**
 * 多线程概念:
 * 我们的生活中充满了多线程的例子，比如一边吃饭一边看手机, 我们看电影，有图像，声音，字幕不同的线程共同组成了电影效果
 * <p>
 * Process和 Thread
 * 进程是动态的概念，是系统资源分配的单位， 进程中至少有一个线程
 * <p>
 * 注意: 很多多线程是模拟出来的，真正的多线程是指多核CPU，即多核，如服务器。
 * 模拟出来的多线程就是在一个cpu下，同一时间点只能执行一个代码，但是因为切换的很快，看起来像多线程而已，如node
 */

public class Initial {
    public static void main(String[] args) {
        // 线程的多种创建方式:
        // 1. Thread class ====> 继承Thread类
        // 2. Runnable接口 =====> 实现Runnable接口
        // 3. Callable接口 =====> 实现Callable接口

        thread_one one = new thread_one();
        thread_two two = new thread_two();
        one.start();
        new Thread(two).start();
    }
}

// 方式1 thread => 不推荐使用，避免OOP单继承的局限性
class thread_one extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("方式1");
        }
    }
}

// 方式二: 重写run方法，然后通过线程对象Thread来代理启用线程 => 推荐使用，灵活方便，同一个对象能被多个线程启用
class thread_two implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("方式2");
        }
    }
}