package 异常;

public class TryCatch {
    public static void main(String[] args){
        int num = test2();
        System.out.println("我运行完了");
    }

    public static int test(){
        int divider = 10;
        int result = 100;
        try {
            while(divider > -1){
                 divider--;
                 result = result + 100/divider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return -1;
        }
    }

    public static int test2(){
        int divider = 10;
        int result = 100;
        try {
            while(divider > -1){
                divider--;
                result = result + 100/divider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return 999;
        }finally {
            System.out.println("我是finally方法");
            return result;
        }
    }
}
