package 泛型;

// 泛型方法分两种：
// 1. 在接口或类中的方法
// 2. 在接口或类以外的方法（平时不常见，但是JDK文档中此类程序很多）
public class 泛型方法 {
    public static void main(String[] args){
        Integer data[] = fun(1,2,3,4);
        for(int item: data){
            System.out.println(item);
        }
    }

    // <T> 描述的是泛型标记的声明
    public static <T> T[] fun(T ...args){
        return args;
    }
}
