package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试各种方式的速度
 */
public class Demo2 {
    // 普通的方式
    public static void test1() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法调用10亿次总共花费" + (endTime - startTime) + "ms");
    }

    // 反射的方式 - 开启校验
    public static void test2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User instance = new User();
        Class user = instance.getClass();
        Method reflectionMethod = user.getDeclaredMethod("getName");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            reflectionMethod.invoke(instance);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法 - 开启校验调用10亿次总共花费" + (endTime - startTime) + "ms");
    }

    // 反射的方式 - 关闭校验
    public static void test3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User instance = new User();
        Class user = instance.getClass();
        Method getName = user.getDeclaredMethod("getName");
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(instance);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法 - 关闭校验调用10亿次总共花费" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        test1();
        test2();
        test3();

    }
}
