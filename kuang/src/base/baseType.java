package base;

public class baseType {
    public static void main(String[] args) {
        /**
         * 八大基本数据类型
         */

        // ******** 整数型 ********
        byte number_byte = 20;     // 占 1 字节   范围: -128 ~ 127
        short number_short = 200;  // 占 2 字节   范围: -32768 ~ 32767
        int number_int = 2000;     // 占 4 字节   范围: -2147483648 ~ 2147473647
        long number_long = 20000L; // 占 8 字节   范围: -92233720368xxx - xx 很大，注意后面加L

        // ******* 浮点型 *******
        float number_float = 12.23F;       // 占 4 字节  注意末尾F
        double number_double = 3.1415926;  // 占 8 字节

        // ******* 字符型 ******
        char char_a = '中';   // 占 2 字节  注意必须用单引号，双引号是string
        String name = "李杰"; // String不是关键字 而是类

        // ***** 布尔型 *****
        boolean flag = true;  // 占 1 位 注意不是字节


        /**
         * 引用数据类型
         * 1. 类
         * 2. 接口
         * 3. 数组
         */
    }
}

/*
 * 电脑中的存储单位的基本概念
 * bit(位), byte(字节), KB, M, G
 *
 * bit为 数据存储 最小单位， 11001100是八位二进制数
 * byte为 数据处理 基本单位
 *
 * 1B(字节) = 8bit(位)
 *
 * 1B = 8bit
 * 1024B = 1KB
 * 1024KB = 1M
 * 1024M = 1G
 */