package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.lang.Thread;

class threadOne implements Callable<String>{
    @Override
    public String call() throws Exception{
        for(int item = 0; item< 20; item++){
            System.out.println("x:" + item);
        }
        return "线程执行结束了";
    }
}

public class Callback {
    public static void main(String[] args) throws Exception{
        FutureTask<String> task = new FutureTask<String>(new threadOne());
        new Thread(task).start();
        System.out.println(task.get());
    }
}
