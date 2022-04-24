package methods;

public class variableParams {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4);
    }

    // 通js一样，有时候我们也不知道我的需要传递的参数有多少,可使用...来表示, 然后通过for来遍历获取
    public static int getSum(int... param) {
        int _sum = 0;
        for (int item : param) {
            _sum += item;
        }
        return _sum;
    }
}
