import java.util.Date;

public class date {
    public static void main(String[] args) throws Exception{
        // 普通定义
        Date time = new Date();
        System.out.println(time);

        // 类型的转换
        // 1. long -> date
        long currentTime = System.currentTimeMillis();
        System.out.println(new Date(currentTime));

        // 2. date -> long
        Date target = new Date(currentTime);
        System.out.println(target.getTime());
    }
}
