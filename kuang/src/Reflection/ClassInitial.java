package Reflection;

/**
 * 类的加载被分为 主动加载 + 被动加载
 */
public class ClassInitial {
    static {
        System.out.println("main方法");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 主动调用
        // Son son = new Son();

        // 反射也会产生主动加载
        // Class.forName("Reflection.Son");


        // 被动加载 - 不会产生类引用(父类被加载)
        // System.out.println(Son.name);
        // System.out.println(Son.class);

        // 数组也是被动加载
        Son[] arr = new Son[5];
    }
}

class Father {
    static {
        System.out.println("父类被加载");
    }

    static String name = "Father的name";
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
    }


}
