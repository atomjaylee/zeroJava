package 多线程;

import java.lang.Thread;

class myThread implements Runnable {
    @Override
    public void run() {
        System.out.println("我是常规的Runnable方式");
    }
}

public class Runable {
    public static void main(String[] args) {
        // 常规的Runnable方式
        myThread thread1 = new myThread();
        new Thread(thread1).start();

        // 匿名内部类的方式
        new Thread(){
            @Override
            public void run(){
                System.out.println("我是匿名内部类的方式");
            }
        }.start();

        // 使用lambda表达式
        new Thread(() -> System.out.println("我是Lambda表达式的方式")).start();
    }
}
