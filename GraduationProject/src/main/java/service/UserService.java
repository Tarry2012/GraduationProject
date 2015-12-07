package service;

/**
 * Created by tqy on 15-11-28.
 */
public interface UserService {
    public static final String SPRING_NAME = "userService";

    public boolean userCheckLogin(String name, String password);
}
