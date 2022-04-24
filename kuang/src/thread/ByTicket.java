package thread;

/**
 * 我们通过Runnable实例的线程对象，可以被Thread类多次代理启用，这样就容易出现问题了
 */
public class ByTicket {
    public static void main(String[] args) {
        thread ticket = new thread();

        new Thread(ticket, "Vue").start();
        new Thread(ticket, "React").start();
        new Thread(ticket, "Angular").start();
    }
}

// 抢票例子
// 这个时候就会存在不同人拿到同一车票的问题
class thread implements Runnable {
    private int ticketNum = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-------> 拿到了第" + ticketNum-- + "张票");
        }
    }
}