package oop;
interface IMember {
    void read();
}

/**
 * 像Js一样，java也有匿名对象，可以直接new 接口，只要实现了它定义的方法即可
 */
public class Anonymity {
    public static void main(String[] args) {
        IMember Tom = new IMember() {
            @Override
            public void read() {
                System.out.println("我是匿名对象中的方法");
            }
        };
    }
}
