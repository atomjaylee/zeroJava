import java.util.Base64;

public class base64 {
    public static void main(String[] args){
        String msg = "我是要加密的密码";
        String eMsg = Base64.getEncoder().encodeToString(msg.getBytes()); // 加密
        System.out.println("加密后的数据：" + eMsg);

        byte data[] = Base64.getDecoder().decode(eMsg);
        System.out.println("解密后的数据:"  + new String(data));
    }
}

