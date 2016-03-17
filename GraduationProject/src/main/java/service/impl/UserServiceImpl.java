package service.impl;
import dao.UserDAO;
import domain.user.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by tqy on 15-11-28.
 */
@Service(UserService.SPRING_NAME)
public class UserServiceImpl implements UserService{

    public boolean userCheckLogin(String name, String password){
      return  false;
    }
}
