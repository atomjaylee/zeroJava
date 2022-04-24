package 阿里java;

class Animation {
    {
        System.out.println("这是结构代码块");
    }
    public Animation(){
        System.out.println("这是结构方法");
    }
    static {
        System.out.println("这是静态代码块");
    }
}

public class 代码块 {

    public static void main(String[] args){
        new Animation();
        new Animation();
    }
}
