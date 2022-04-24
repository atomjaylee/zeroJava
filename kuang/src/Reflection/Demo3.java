package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * 通过反射获取注解
 * 例子： ORM表的实现 - Object结构和数据表中的结构一致
 */
public class Demo3 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c1 = Student.class;

        // 获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation item : annotations) {
            System.out.println(item);
        }
        // 获取注解的值
        TableAnnotation annotationClass = (TableAnnotation) c1.getAnnotation(TableAnnotation.class);
        System.out.println(annotationClass.value());

        // 获取指定注解
        Field name = c1.getDeclaredField("name");
        FieldAnnotation nameAnnotation = (FieldAnnotation) name.getAnnotation(FieldAnnotation.class);

        System.out.println(nameAnnotation.ColumnName());
        System.out.println(nameAnnotation.length());
        System.out.println(nameAnnotation.type());
    }
}

@TableAnnotation("db_student")
class Student {

    @FieldAnnotation(ColumnName = "db_id", type = "varchar", length = 3)
    private String name;

    @FieldAnnotation(ColumnName = "db_age", type = "int", length = 10)
    private int age;
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableAnnotation {
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnnotation {
    String ColumnName();

    String type();

    int length();
}
