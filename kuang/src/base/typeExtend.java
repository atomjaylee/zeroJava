package base;

public class typeExtend {
    public static void main(String[] args) {
        // * 最好完全不使用浮点数进行比较，因为浮点数存在舍入误差的
        // * 开发银行业务等和金额有关的，最好使用Java自带的BigDecimal这个数学工具类
        float f1 = 23423234234234f;
        float f2 = f1 + 1;
        System.out.println(f1 == f2); // 居然打出了true


        // -----------------------------------
        // 字符扩展
        // -----------------------------------
        char c1 = 'A';
        char c2 = '国';
        System.out.println(c1);
        System.out.println((int)c1); // 65
        System.out.println(c2);
        System.out.println((int)c2); // 22269

        // 所有的字符本质还是数字
        // char的编码 Unicode 2字节 65536
        char c3 = '\u0061';  // a

        // 转义字符 \t \n
    }
}
