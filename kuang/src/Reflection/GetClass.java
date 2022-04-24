    package Reflection;

/**
 * 获取Class的方式
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一: 通过类名
        Class c1 = Coder.class;

        // 方式二：通过getClass()
        Class c2 = new Coder().getClass();

        // 方式三：通过Class的forName
        Class c3 = Class.forName("Reflection.Coder");

        // 方式四: 基本内置的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        // 获取父类
        Class parent = c1.getSuperclass();
        System.out.println(parent);
    }
}


class Person {
    String name;
}

class Coder extends Person {
    public Coder() {
        this.name = "码农";
    }
}