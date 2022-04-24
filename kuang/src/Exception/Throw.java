package Exception;

/**
 * 当我们知道可能会发生异常的时候，我们需要自己手动的抛出异常，比如方法校验参数时，等等
 * 常见的抛出错误有两种方式
 * 1. throw在方法体中抛出
 * 2. throws是当方法体中处理不了，或者这个错误需要让调用这个方法的知道
 */
public class Throw {
    public static void main(String[] args) {
        try {
            int sum = comptedSum(2, 0);
        } catch (Exception e) {
            System.out.println("捕获到方法抛出的异常");
        }
    }

    public static int comptedSum(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a + b;
    }
}
