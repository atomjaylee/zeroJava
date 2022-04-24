import java.math.BigInteger;
import java.util.Random;

public class math {
    public static void main(String[] args) throws Exception {
        System.out.println(Math.round(16.5));
        System.out.println(Math.round(16.51));
        System.out.println(Math.round(-16.5));
        System.out.println(Math.round(-16.51));
        System.out.println("格式化的数据：" + formatNum(-16.515, 2));

        // 产生随机数
        char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Random rand = new Random();
        for (int x = 0; x < 4; x++) {
            System.out.print("随机验证码：" + data[rand.nextInt(data.length)]);
        }

        // 大数字操作
        // java.math包中提供BigInteger,BigDecimal两个类
        BigInteger bigNum1 = new BigInteger("234234234243234234242342342");
        BigInteger bigNum2 = new BigInteger("22343434343434343");
        System.out.println("加法操作:" + bigNum1.add(bigNum2));
        System.out.println("减法操作:" + bigNum1.subtract(bigNum2));
        System.out.println("乘法操作:" + bigNum1.multiply(bigNum2));
        System.out.println("除法操作:" + bigNum1.divide(bigNum2)); // 这个是做了取整的
        BigInteger result[] = bigNum1.divideAndRemainder(bigNum2);
        System.out.println("商是：" + result[0] + " 余数是：" + result[1]); // 正常的结果

    }

    // js的toFixed方法
    public static Double formatNum(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }
}

