
class TargetClone implements Cloneable{
    static String name;
    static int age;

    public TargetClone(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 父类负责克隆
    }
}

public class ObjectClone {
    public static void main(String[] args) throws Exception {
        TargetClone target = new TargetClone("张三", 23);
        TargetClone clone = (TargetClone) target.clone();
        System.out.println(TargetClone.age);
        target.setAge(100);
        System.out.println(clone.age);
    }
}
