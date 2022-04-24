package 多线程;

/**
 * 是线程操作的核心类，
 */

class newThread extends java.lang.Thread {
    private String title;

    public newThread(String title) {
        this.title = title;
    }

    //  线程的主方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("title" + this.title + ";" + i);
        }
    }
}

public class Thread {
    public static void main(String[] args) throws Exception {
        newThread thread1 = new newThread("第一个线程");
        newThread thread2 = new newThread("第二个线程");
        newThread thread3 = new newThread("第三个线程");

        thread1.start();
        thread2.start();
        thread3.start();

        java.lang.Thread.sleep(200);
    }
}
