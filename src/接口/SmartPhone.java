package 接口;

/*
 *  extend必须在implements之前
 */
public class SmartPhone extends TelPhone implements IPlayGame {
    @Override
    public void  message() {
        System.out.println("我是智能机，我能发消息");
    }

    @Override
    public void playGames() {
        System.out.println("我是智能机，我能打游戏");
    }
}
