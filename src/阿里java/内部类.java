package 阿里java;

class OutClass{
    private static  String msg = "hello word";

    public void fun(int num){
        class Inner{
            public void print(){
                System.out.println("msg:" + msg);
                System.out.println("num:"+ num);
            }
        }

        new Inner().print();
    }
}

public class 内部类 {
    public static void main(String[] args){
        new OutClass().fun(11);
    }
}
