package Exception;

public class CustomEexception {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void test() throws Exception {
        throw new myException("自定义");
    }
}

// 自定义异常类
class myException extends Exception {
    private String desc;

    public myException(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "This is myException info:" + this.desc;
    }
}

