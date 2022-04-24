package 接口;

public class Inital {

    public static void main(String[] args){
        SmartPhone iphone = new SmartPhone();
        iphone.playGames();

        Psp sony = new Psp();
        sony.playGames();

        /*
         * 接口也可以与匿名内部类配合使用
         *
         * 匿名内部类：没有名字的内部类，多用于关注实现而不关注类的名称
         */

        IPlayGame sansumg = new IPlayGame() {
            @Override
            public void playGames() {
                System.out.println("我是匿名内部类，我定义了打游戏的功能");
            }
        };
        sansumg.playGames();
    }
}
