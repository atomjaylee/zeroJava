package anotation;

// 常见的注解
public class base {
    static class Person extends Object {
        @Override // 重写方法
        public String toString() {
            return super.toString();
        }

        @Deprecated
        public void test() {
            System.out.println("即将弃用的，或者有替代品的");
        }

        // 抑制提示，比如下面flag声明未使用的话，会编辑器提示，加上注解后则不提示了
        // 当然这些注解除了用在方法上也可以用到类上
        @SuppressWarnings("all")
        boolean flag;
    }
}
