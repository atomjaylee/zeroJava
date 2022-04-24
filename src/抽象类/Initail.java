package 抽象类;

public class Initail {
    public static void main(String[] args){
        TelPhone nokia = new cellPhone();
        nokia.message();

        TelPhone iphone = new SmartPhone();
        iphone.message();

        // TelPhone sansung = new TelPhone();
        // 抽象类不能直接创建，可以定义为引用变量
    }
}
