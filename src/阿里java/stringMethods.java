package 阿里java;


/**
 * String 为一个字符数组，所以String类也提供了相互转换的方法
 *
 * 1. 字符数组 => 字符串
 *    - public String(char[] value) 为整体转化
 *    - public String(char[] value, int offset, int count); 截取部分转化
 * 2. 字符串 => 字符
 *    - public char charAt(int index) 获取索引位置的字符
 *    - public char[] toCharArray() 转化成字符数组
 */
public class stringMethods {
    public static void main(String[] args){
        String name = "atomjaylee";

        System.out.println(name.charAt(1));
        System.out.println(name.toCharArray());

        char data[] = new char[]{'l','i','j','i','e'};

        System.out.println(new String(data));
        System.out.println(new String(data, 2, 3));
    }
}
