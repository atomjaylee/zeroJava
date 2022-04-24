package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 通过反射动态创建对象
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.User");

        // 创建一个对象
        // User user = (User) c1.newInstance(); 默认调用无参构造，如果类没有无参构造就报错了，为了避免报错，我们通过获取构造器创建
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user = (User) constructor.newInstance("atom", 12, 33);

        // 获取方法并调用
        Method reflectMethod = c1.getDeclaredMethod("setAge", int.class);
        // 调用方法使用invoke，接受要作用的对象和值, 注意这个作用的是对象，不是反射类
        reflectMethod.invoke(user, 100);
        System.out.println(user.getAge());

        // 获取属性并修改
        Field name = c1.getDeclaredField("name");
        // 因为name是私有的，我们需要进行设置，让其跳过安全检查，否则会报错
        name.setAccessible(true);
        name.set(user, "React");
        System.out.println(user.getName());
    }
}
