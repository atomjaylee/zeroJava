package 链表;

public class Initial {
    public static void main(String[] args){
        Link all = new Link();
        all.add("北京");
        all.add("欢迎你");
        all.add("嘿嘿");
        System.out.println("该链表是否为空："+all.isEmpty());
        System.out.println("该链表的长度："+all.size());

        for (Object x : all.toArray()){
            System.out.println(x);
        }

        System.out.println("链表中是否含有北京这个值："+all.contains("北京"));

        System.out.println("修改前的第二个数据:" + all.get(1));
        all.set(1, "我现在不欢迎你了");
        System.out.println("修改后的第二个数据:" + all.get(1));
    }
}
