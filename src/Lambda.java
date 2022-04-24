import 链表.Link;


/**
 * 是jdk1.8后重要更新，因为越来越多的程序支持函数式编程，而java是面向对象编程，并不支持函数式编程，为了弥补，添加了lambda
 * <p>
 * 但是它有个缺点，就是这个接口只能定义一个方法，如果是两个方法，直接报错, 但是接口本身并不报错，而是在调用处报错，为了表明此接口
 * 就是用来做函数式编程的，就多了个注解，@FunctionalInterface ，这样如果这个接口不符合函数式接口，就会在定义时就报错了
 */

@FunctionalInterface
interface Imessage {
    int add(int a, int b);
}

// 方法引用
@FunctionalInterface
interface ICall<T, B> {
    B toLowerCase(T par);
}

public class Lambda {
    public static void main(String[] args) {
        // 函数式编程的时候
        Imessage msg = (p1, p2) -> p1 + p2;
        System.out.println(msg.add(2, 1));

        // 方法引用语法
        ICall<String, String> call = String::toLowerCase;
        System.out.println(call.toLowerCase("RERKJKER"));

        String[] atp = {"atom","vscode","westorm","idea"};

    }
}
