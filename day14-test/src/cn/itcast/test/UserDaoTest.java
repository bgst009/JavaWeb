package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User user = new User();
        user.setName("qwer");
        user.setPassword("1234");
        UserDao dao = new UserDao();
        User loginUser = dao.login(user);

        System.out.println(loginUser);
    }
}
