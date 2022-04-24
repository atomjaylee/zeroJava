package anotation;

import java.lang.annotation.*;

/**
 * 元注解(Meta)比较重要，是注解其他注解的。Java中定义了4个标准的meta-annotation类型，来对其他注解进行说明
 * 1. @Target 描述注解的使用范围
 * 2. @Retention 描述注解的生命周期  SOURCE < ClASS < RUNTIME
 * 3. @Document 说明该注解被包含在javadoc中
 * 4. @Inherited 说明子类可以继承父类中的该注解
 */
public class Meta {
    // 没有填写注解的参数会报错
    // @MyAnnotation
    public void test(){}

    @MyAnnotation(name = "atom")
    public void test1(){}
}

// 定义一个注解
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME) // 该注解在运行时还会有效  => 当值只有一个时，可以省略value关键字
@Target(value = { ElementType.METHOD, ElementType.TYPE}) // 该注解可以用在方法和class上
@interface MyAnnotation {

    // 注解参数： 参数类型 + 参数名()
    String name();

    int age() default 12; // 注解的参数，可以有默认值


    // 如果只有一个注解参数，最好用value定义，这样我们在使用注解的时候就可以@MyAnnotaion("aaa")这样使用
    String value() default "";
}