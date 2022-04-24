package 抽象类;

public class SmartPhone extends TelPhone {
    @Override
    public void message() {
        System.out.println("我是通过虚拟按键来发短信的");
    }

    @Override
    public void call() {
        System.out.println("我是通过虚拟按键来打电话的");
    }
}
