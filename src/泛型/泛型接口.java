package 泛型;

interface Person<T>{
    public void print(T t);
}

class China implements Person<String>{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
public class 泛型接口 {
    public static void main(String[] args){
        China zhang = new China();
        zhang.print("你好啊");
    }
}
