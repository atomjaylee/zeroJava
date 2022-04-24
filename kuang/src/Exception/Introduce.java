package Exception;

/**
 * Java中常见的错误一般分为两种，1. Error 2. Exception
 * 1. Error一般都是毁天灭地的，会导致我们服务的停止，比如我们递归溢出等问题
 * 2. Exception使我们平时要解决的问题，一般是运行时异常，在IDEA中并不提示报错，常见的比如空指针，运算异常，找不到类等
 * 3. Error和Exception都是 Throwable的子类， Throwable是超类
 */

public class Introduce {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // 异常的捕获
        try {
//            System.out.println(a / b);
            new Introduce().a();
        } catch (Exception e) {
            System.out.println("程序异常，Exception捕获");
        } catch (Error e) {
            System.out.println("程序异常，Error捕获");
        } catch (Throwable e) {
            System.out.println("程序异常，超类捕获");
        } finally {
            System.out.println("final");
        }

    }

    // 递归导致内存溢出
    public void a() {
        b();
    }

    public void b() {
        a();
    }
}
