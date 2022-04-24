package base;

public class typeConversion {
    public static void main(String[] args) {
        // 类型转换 -  自动转换 + 强制转换
        // (低)char, byte, int -> long -> float -> double(高)
        // 低到高自动转换  高到低强制转换 - 可能造成内存溢出
        int num = 128;
        byte byte_a = (byte)num; // 内存溢出

        /**
         * 注意点
         * 1. 不能转换boolean，因为boolean是用位存储的
         * 2. 不能转换成不相干的类型，比如转成类，对象，数组等
         */
    }
}