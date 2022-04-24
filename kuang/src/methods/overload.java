package methods;

public class overload {
    // 同一个类中，如果方法名相同，但是参数的个数，参数的类型，参数的循序不同都是方法的重载
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public int getSum(double num1, double num2) {
        return (int)(num1 + num2);
    }

    public static void main(String[] args) {

    }
}
