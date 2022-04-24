package 异常;

public class CustomizeException extends Exception {
    // 利用构造器的重载功能

    // 自带的构造器
    public CustomizeException(){

    }

    // 自定义的构造器 - 可以传参
    public CustomizeException(String message){
        super(message);
    }
}
