class Phone {
    public Phone(){
        System.out.println("我被实例化了，舒服~");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我他么被回收了，气不气");
    }
}

public class system {
    public static void main(String[] args) throws Exception {
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        StringBuffer str = new StringBuffer("atom");
        for (int item = 0; item < 100000; item++) {
            str.append("China");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("总共花费了：" + (endTime - startTime));

        // gc进行垃圾回收，此处调用的是Runtime的gc方法实现
         System.gc();

        // 对finalize复写，垃圾回收后调用
        Phone china = new Phone();
        china = null;
        System.gc();
    }
}
