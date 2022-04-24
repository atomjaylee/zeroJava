package 综合练习;

public abstract class Car {
    private String name; // 车的名字
    private int price; // 租车的价格

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getCapacity(); // 获取容量

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
