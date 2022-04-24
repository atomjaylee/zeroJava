// String 和 StringBuffer的区别在于， 前者不能直接修改，后者能够直接修改

public class stringbuffer {
    public static void main(String[] args){
        // 定义
        StringBuffer buf = new StringBuffer("你好呀");
        System.out.println("定义:"+buf);

        // 添加
        buf.append("china").append(", 中国");
        System.out.println("添加内容后：" + buf);

        // 删除
        buf.delete(1, 3); // 删除index[1-2] 保留index[3];
        System.out.println("删除内容后：" + buf);

        // 插入
        buf.insert(1, "好呀");
        System.out.println("插入内容后：" + buf);

    }
}
