import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int arrA[] = {1,2,3,4,10};
        int arrB[] = Arrays.copyOf(arrA, arrA.length);

        // toString直接打印，不用for循环
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));

        // 比较
        arrA[1] = 10;
        System.out.println("比较："+ Arrays.equals(arrA,arrB));

        // 二分法 查找不到负数，查到返回index : 注意，这个方法为二分法，运行前必须调用sort进行排序
        System.out.println(Arrays.toString(arrA));
        Arrays.sort(arrA);
        System.out.println(Arrays.binarySearch(arrA, 10));
    }
}
