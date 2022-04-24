package 异常;
/*
 * main -> test2 -> test1
 * 主函数抓取test2中的错误，test2抓取test1中 的错误
 * 形成链式的结构
 */
public class ExceptionChain {
    public static void main(String[] args){
        ExceptionChain ct = new ExceptionChain();
        try {
             ct.test2();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void test2(){
        try {
            test1();
        }catch (CustomizeException e){
            RuntimeException newExc = new RuntimeException(e);
            throw newExc;
        }
    }

    public void test1() throws CustomizeException{
        throw new CustomizeException("我是test1中传给自定义异常中的参数");
    }
}
