interface connect extends sketch {
    void call();
    void message();
}

interface sketch {
    void fly();
}

abstract class roket implements connect{

}


public class Interface {
    public static void main(String[] args){
        roket chinaRed = new roket(){
            @Override
            public void fly() {
                System.out.println("我中国红啊，我能和你通信");
            }

            @Override
            public void call() {

            }

            @Override
            public void message() {

            }
        };

        chinaRed.fly();
    }
}
