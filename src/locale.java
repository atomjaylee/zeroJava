
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class locale {
    public static void main(String[] args) throws Exception{
        System.out.println(Locale.CHINA); // zh_CN
        System.out.println(Locale.CHINESE); // zh
        System.out.println(Locale.getDefault());

//        Locale loc = new Locale("en","US");
        Locale loc = new Locale("zh", "CN");
        // getBundle的资源名字，没有后缀， 而且一定要放在CLASSPATH中，放在包中的要加包名字
        ResourceBundle Message = ResourceBundle.getBundle("Message", loc);

//
        String content = Message.getString("Hello");
        content = new String(content.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(MessageFormat.format(content, "能看到不"));

    }
}

