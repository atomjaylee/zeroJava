package Reflection;

import jdk.nashorn.internal.scripts.JD;

/**
 * 自定义加载器 ---- 系统类加载器 ----- 扩展类加载器 ------ 根加载器(不能直接获取)
 *
 * 双亲委派机制：你重写了一个和基础类一样的类，这个类并不会被加载，起到保护的作用
 */
public class Classloader {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取扩展类加载器
        ClassLoader ExtensionClassLoader = systemClassLoader.getParent();
        System.out.println(ExtensionClassLoader);

        // 获取根加载器(不能直接获取，C++开发)
        ClassLoader RootClassLoader = ExtensionClassLoader.getParent();
        System.out.println(RootClassLoader);


        System.out.println("============================");

        // 当前类的加载器
        ClassLoader CurrentClassLoader = Class.forName("Reflection.Classloader").getClassLoader();
        System.out.println(CurrentClassLoader);

        // JDK内置类谁加载的
        ClassLoader JDKLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(JDKLoader);

        // 系统类的加载路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
