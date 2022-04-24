package base;

public class ForPrint {
    public static void main(String[] args) {
        // 打印乘法表
        for (int line = 1; line <= 9; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(line + "*" + i + "=" + i * line + "\t");
            }
            System.out.println();
        }

        // for的增强,主要用于遍历集合和数组
        int[] number = {1, 2, 3, 4, 5, 6, 7};
        for (int item : number) {
            System.out.println(item);
        }
    }
}
