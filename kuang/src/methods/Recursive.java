package methods;

public class Recursive {
    public static void main(String[] args) {
        int sum = factorial(5);
        System.out.println(sum);
    }

    // 递归 - 通过栈的方式(先进后出)实现， 但是如果n太大，还是不要用，太影响性能，栈太大了
    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
}
