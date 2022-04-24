import com.kuang.dao.OracleImpl;
import com.kuang.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new OracleImpl());
        userService.userInfo();
    }
}
