package 阿里java;

class person {
    private String name;
    private int age;
    private static String country = "中国";

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void setCountry(String c){
        System.out.println(c);
        country = c;
    }

    public String getInfo(){
        this.setCountry("美国");
        return "个人信息: name:" + this.name + ",age:" + this.age + ",country:" + this.country;
    }
}
public class static属性 {
    public static void main(String[] args){

        person p1 = new person("张三",10);
        person p2 = new person("李四",11);
        person p3 = new person("王五",12);

        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
    }
}
