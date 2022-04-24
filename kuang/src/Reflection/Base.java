package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Java是静态语言，但是Java可以被称为'准动态语言', 因为Java有反射机制， 所以它的动态性让编程的时候更加的灵活
 * 但是也是会丢失安全性 + 性能(可能岔开十几倍)
 * 1. 反射能在程序的运行时借助Reflection API来获取任何类中的属性和方法，并且能直接修改，--- 外挂
 * 2. JVM加载完类之后，会在堆内存中产生一个Class类型的对象(一个类只有一个class对象)，而这个对象包含了这个类的结构信息
 * 我们可以通过这个对象获取这个类的结构，就像是一面镜子，所以称之为反射
 * 3. 正常方式：   引入包 -> 通过new实例化 -> 获取实例化对象
 * 反射方式:   实例化对象 -> getClass()方法 -> 得到整个包类的结构
 */
public class Base {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 通过反射获取类的class对象
        Class c1 = Class.forName("Reflection.User");
        System.out.println(c1);

        // 一个类在内存你中只有一个class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        Class c2 = Class.forName("Reflection.User");
        Class c3 = Class.forName("Reflection.User");
        Class c4 = Class.forName("Reflection.User");

        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());


        System.out.println("============ 属性 =============");
        // 获取类名字
        System.out.println(c1.getName()); // 包名 + 类名
        System.out.println(c1.getSimpleName()); // 仅类名

        // 获取类属性
        Field[] fieldArr = c1.getFields(); // 仅获取public的属性
        Field[] fieldAllArr = c1.getDeclaredFields(); // 获取全部的属性
        for (Field item : fieldAllArr) {
            System.out.println(item);
        }

        System.out.println("============ 方法 =============");
        // 获取类方法
        Method[] methods = c1.getMethods();  // 仅public方法 + 其父类的方法
        Method[] methodsAll = c1.getDeclaredMethods(); // 全部的本类方法
        for (Method item : methodsAll) {
            System.out.println(item);
        }

        // 获取指定方法
        // 添加参数是因为方法重载，我们要用参数去区分
        Method operateAge = c1.getDeclaredMethod("operateAge", int.class);
        System.out.println(operateAge);

        System.out.println("============ 构造器 =============");
        Constructor con = c1.getDeclaredConstructor();
        System.out.println(con);
    }
}


// 定义一个目标类
class User {
    private String name;
    public int age;
    protected int id;

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void operateAge(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}