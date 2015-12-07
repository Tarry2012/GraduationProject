package domain.user;
/**
 * Created by tqy on 15-11-27.
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String toString(){
        return "user[userId= " + userId + ", userName= " + userName + ", userPassword= " + userPassword + "]";
    }
}
