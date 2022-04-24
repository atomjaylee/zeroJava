package 接口加强;

/**
 * 程序设计前期，假如我们定义的接口，被实现了2万次，后续需求中，需要我们更改这个接口，那么就需要我们更改2万个子类，
 * 这就导致了他们程序设计时候直接用了抽象类，而不是接口。为了解决这个问题，在jdk1.8之后，接口功能加强，
 * 1. public default 来定义普通方法
 * 2. public static 来定义静态方法
 *
 * 这样接口就更像是抽象类了，但是我们还是可以用接口来实现多继承，抽象类却不可以
 */

interface Imessage{
    void print();
    public default void say(){
        System.out.println("say Hello");
    }

    public static Imessage getIntercence(){
        return new Hello();
    }
}

class vbHello implements Imessage{
    @Override
    public void print() {
        System.out.println("我是重写后的print方法");
    }
}
public class NewInterface {
    public static void main(String[] args){
        Imessage word = new Hello();
        Imessage.getIntercence().print();
    }
}
