import dao.UserDAO;
import domain.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import service.UserService;

import javax.annotation.Resource;
import java.io.Reader;

/**
 * Created by tqy on 15-11-28.
 */
public class UserTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static{
        try{
            reader = Resources.getResourceAsReader("sqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        @Resource
        UserService userService;

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public boolean userChecklogin(String name, String password) {
        SqlSession session = sqlSessionFactory.openSession();
        sqlSessionFactory.getConfiguration().addMapper(UserDAO.class);
        try{
            UserDAO userDAO = session.getMapper(UserDAO.class);
            User user = userDAO.selectUserByName(name);
            System.out.println(user.toString());
            userService.userCheckLogin(name, password);
            if (user.getUserPassword() == password){
                return true;
            }else{

            }
        }finally{
            session.close();
        }
        return  false;
    }
}
