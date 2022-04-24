package oop;

interface IUser {
    void add(String name);
}

interface ITime {
    public static String age = "atom"; // 可以定义属性，但是一般不会这么用
    public abstract void look();
}

class User implements IUser, ITime {
    @Override
    public void add(String name) {
        System.out.println("接口中add方法的实现");
    }

    @Override
    public void look() {
        System.out.println("接口中look的方法实现");
    }
}

/**
 * Java的接口和Typescript的接口时一致的，接口就是用来约束的，不会有实现，这样才能实现和约束分离，才能面向接口编程
 * Java可以使用接口来实现多继承，而这一点抽象类是不行的
 */
public class Interface {
    public static void main(String[] args) {
        User tom = new User();
    }
}
