package domain.user;
/**
 * Created by tqy on 15-11-27.
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private String userMail;
    private String userPicture;
    private String userHomePage;
    private String userInterestType;

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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserHomePage() {
        return userHomePage;
    }

    public void setUserHomePage(String userHomePage) {
        this.userHomePage = userHomePage;
    }

    public String getUserInterestType() {
        return userInterestType;
    }

    public void setUserInterestType(String userInterestType) {
        this.userInterestType = userInterestType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", userHomePage='" + userHomePage + '\'' +
                ", userInterestType='" + userInterestType + '\'' +
                '}';
    }
}
