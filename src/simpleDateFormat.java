import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormat {
    public static void main(String[] args) throws Exception{
        // Date -> String
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        Date currentTime = new Date();
        SimpleDateFormat simFormat = new SimpleDateFormat(pattern);
        String result = simFormat.format(currentTime);
        System.out.println(result);

        // String -> Date
        String date = "2019-01-11 12:12:12.999";
        Date res = simFormat.parse(date);
        System.out.println(res);
    }
}
