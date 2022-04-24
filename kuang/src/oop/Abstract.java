package oop;
// 抽象类不是重点，但是还是需要了解

/**
 * 1. 抽象类是约束，不能new出来
 * 2. 抽象方法必须放在抽象类中，并且不能有方法体
 * 3. 抽象类中可以有普通方法
 */
abstract class APerson {
    public abstract void run();

    public void eat() {
        System.out.println("我是抽象类的普通方法");
    }
}

class Coder extends APerson {
    @Override
    public void run() {
        System.out.println("实现抽象类的方法");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Coder tom = new Coder();
        tom.run();
        tom.eat();
    }
}
