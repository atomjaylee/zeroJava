package 多线程;

import java.lang.Thread;

class MyThread implements Runnable {
    private int ticket = 20;

    // 处理线程同步的问题
    // 第一种： 方法内使用
//    public void run(){
//        for(int item = 0; item< 30; item++){
//            synchronized (this){
//                if(ticket>0){
//                    System.out.println("我的名字是" + Thread.currentThread().getName() + "现在还剩票数:" + ticket--);
//                }
//            }
//        }
//    }


    //    第二种，在方法中使用
    @Override
    public void run() {
        for (int item = 0; item < 30; item++) {
            this.sale();
        }
    }

    public synchronized void sale() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我的名字是" + Thread.currentThread().getName() + "现在还剩票数:" + ticket--);
        }
    }
}

public class Async {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt, "线程A").start();
        new Thread(mt, "线程B").start();
        new Thread(mt, "线程C").start();
    }
}
