package 枚举;

enum Color {
    RED,
    GREEN,
    BLUE
}

public class Enum {
    public static void main(String[] args){
       for(Color tem: Color.values()){
           System.out.println(tem.ordinal()+ tem.name());
       }
    }
}
