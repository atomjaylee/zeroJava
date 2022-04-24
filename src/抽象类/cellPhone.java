package 抽象类;

public class cellPhone extends TelPhone {
    // 类中必须包含继承的抽象类中的全部方法

    @Override
    public void call() {
        System.out.println("我是通过实体键来打电话的");
    }

    @Override
    public void message() {
        System.out.println("我是通过实体键来发短信的");
    }
}
