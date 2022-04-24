package xcharge;

public class Initail {
    public static void main(String[] args){
        /*
         * 引用多态
         * 1. 父类的引用可以指向本类的对象
         * 2. 父类的引用可以指向子类的对象
         * 3. 子类的引用不可以指向父类的对象
         */
        Animal obj1 = new Animal(); // 父类的引用 -> 本类的对象
        Animal obj2 = new Dog(); // 父类的引用 -> 子类的对象
        Animal obj3 = new Cat();
        // Dog obj3 = new Animal(); // 错误： 子类的引用 -/-> 父类

        /*
         * 方法的多态
         * 1. 创建本类对象，调用方法是本类的方法
         * 2. 创建子类对象，调用方法是子类重写或继承来的方法
         */
        obj1.move(); // 父类本身的方法
        obj2.move(); // 子类覆盖父类的方法
        obj3.move(); // 子类继承父类的方法

        // obj2.watchDoor(); // 错误， 父类的引用不能调用子类特有的方法


        /*
         * 引用的类型转换
         */

        Dog wangcai = new Dog();
        Animal caiquan = wangcai; // 向上类型转换(无风险) 茶杯水倒进茶壶
        // Cat Tom = caiquan; // 向下类型转换(有风险) 茶壶水倒进茶杯，可能会发生溢出


        if(caiquan instanceof Cat){
            Cat Bibi = (Cat)caiquan; // 强制类型转化，编译时为Cat类型，运行时为Dog类型，所以虽然编译器不报错，运行时会报错
        }else{
            System.out.println("不能进行类型转换");
        }
        /*
         * instanceof用法
         *  1. 使用格式：  引用类型变量 instanceof 类/接口  eg: wangcai instanceof Dog
         *  2. 注意事项:  instanceof左边必须继承于右边。否则会报错 eg: wangcai instanceof Cat
         */
    }
}
