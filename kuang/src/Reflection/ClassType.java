package Reflection;

import java.lang.annotation.ElementType;

/**
 * 那些类型有Class对象呢
 * 1. class : 外部类，成员(成员内部类，静态内部类)， 局部内部类，匿名内部类
 * 2. interface: 接口
 * 3. []: 数组
 * 4. enum: 枚举
 * 5. annotation： 注解
 * 6. primitive type: 基本类型
 * 7. void
 */
public class ClassType {
    public static void main(String[] args) {
        Class c1 = Object.class;  // 类
        Class c2 = Comparable.class; // 接口
        Class c3 = int[].class;// 数组
        Class c4 = Override.class; // 注解
        Class c5 = ElementType.class;// 枚举
        Class c6 = Integer.class;// 基本类型
        Class c7 = void.class;// void
        Class c8 = Class.class;// Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
    }
}
