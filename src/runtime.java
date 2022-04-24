public class runtime {
    public static void main(String[] args){
        Runtime mode = Runtime.getRuntime();
        System.out.println("free:"+mode.freeMemory()/1024/1024+",total:" + mode.totalMemory()/1024/1024+ ",max:" + mode.maxMemory()/1024/1024);
        mode.gc();
        System.out.println("free:"+mode.freeMemory()/1024/1024+",total:" + mode.totalMemory()/1024/1024+ ",max:" + mode.maxMemory()/1024/1024);
    }
}
