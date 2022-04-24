package 接口;

/*
 * 1. 默认会添加abstract关键字 => public abstract interface IPlayGame
 */
public interface IPlayGame {
    String system = "andriod"; // 系统默认扩展为 => public static final String system = "andriod";
    void playGames(); // 系统默认扩展为 => public abstract void playGames();
}
