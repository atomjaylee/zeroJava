package 接口;

public class Psp implements IPlayGame {
    @Override
    public void playGames() {
        System.out.printf("我是psp,我重写了接口的playgame的方法");
    }
}
