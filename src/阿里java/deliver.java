package 阿里java;

public class deliver {
    public static void main(String[] args){
        Message msg = new Message();
        msg.setNum(100);
        fun(msg);
        System.out.print(msg.getNum());
    }

    public static void fun(Message temp){
        temp.setNum(30);
    }
}


class Message{
    private int num;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }
}