package 阿里java;


// 实现首字母大写
public class byteMethods {
    public static void main(String[] args){
        String target = "hello zhichong";

        byte[] data = target.getBytes();

        for(int i=0; i<data.length;i++){
            System.out.println(data[i]+",");
        }
        System.out.println(new String(data));
        System.out.println(firstUpper(target));
    }

    public static String firstUpper(String str){
        if(str == null || "".equals(str)){
            return str;
        }
        if(str.length()> 1){
            return str.substring(0,1).toUpperCase() + str.substring(1,str.length());
        }
        return str.toUpperCase();
    }
}
