package 阿里java;


//初期类的书写要求
/*
 1. 类名称应该有意义，能明确表示某类事物，并首字母大写
 2. 类中所有的属性应该使用private来保护，并且添加为他们添加getter,setter方法
 3. 类中可以存在多个构造方法，但是必须存在一个无参的构造方法
 4. 类中所有方法都不允许出现任何System.out语句， 所有输出信息应该在调用处打印
 5. 类中应该提供一个返回类完整信息的方法，暂定为getInfo
*/


class Person {
    private String name;
    private String address;
    private Number age;

    public Person(){}

    public Person(String n){
        setName(n);
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getInfo(){
        return "name:" + name + ",address:" + address + ",age:" + age;
    }
}

public class Init {
    public static void main(String[] args){
        System.out.println(new Person("atomJayLee").getInfo());
    }
}
