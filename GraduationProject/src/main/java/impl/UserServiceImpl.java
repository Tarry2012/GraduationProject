package impl;
import dao.UserDAO;
import domain.user.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import service.UserService;
import sqlmap.SQLMapHandle;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tqy on 15-11-28.
 */
@Service(UserService.SPRING_NAME)
public class UserServiceImpl implements UserService{
    private final Logger logger = Logger.getLogger(this.getClass());
    public UserServiceImpl(){

    }
    public boolean userCheckLogin(String name, String password){
        SqlSession session = SQLMapHandle.sqlSessionFactory.openSession();
        if (name.isEmpty()|| password.isEmpty()){
            return false;
        }
        try{
            UserDAO userDAO = session.getMapper(UserDAO.class);
            Map<String, String> userLoginInfo = new HashMap<String, String>();
            userLoginInfo.put("userName", name);
            userLoginInfo.put("userPassword", password);
            User user = userDAO.selectUserByName(userLoginInfo);
            System.out.println(user.toString());
            if (user.getUserPassword().equals(password)){
                logger.debug("this is test debug log 2");
                logger.error(System.getProperties());
                return true;
            }else{
                return false;
            }
        }finally{
            session.close();
        }
    }
}
