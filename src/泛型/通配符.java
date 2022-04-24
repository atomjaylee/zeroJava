package 泛型;

class IMessage<T extends String> {
    private T note;

    public void setNote(T note) {
        this.note = note;
    }

    public T getNote() {
        return note;
    }
}

public class 通配符 {
    public static void main(String[] args) {
        IMessage<String> mess = new IMessage<>();
        mess.setNote("我是设置进来的");
        fun(mess);
    }

    public static void fun(IMessage<? super String> temp) {
        temp.setNote("NI");
        System.out.println(temp.getNote());
    }
}

