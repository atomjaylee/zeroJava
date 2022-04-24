package 泛型;

class Message<T>{
    private T note;

    public void setNote(T note){
        this.note = note;
    }

    public T getNote(){
        return note;
    }
}

public class first {
    public static void main(String[] args){
        Message<String> mess = new Message<>();
        mess.setNote("你好啊");
        System.out.println(mess.getNote());
    }
}
