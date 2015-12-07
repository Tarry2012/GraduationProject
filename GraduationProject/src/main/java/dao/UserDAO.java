package dao;
import domain.user.User;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by tqy on 15-11-27.
 */
public interface UserDAO {
    public User selectUser(User user);
    public boolean addUsder(User user);
    public boolean deleteUsder(User user);
    public boolean modifyUser(User user);
    public boolean updateUser(User User);
    public User selectUserByName(Map userLoginInfo);
}
