package UserProfileManager;

public class UserInfo {
    String UserName;
    String UserRegNumber;
    String UserFacultyName;

    public UserInfo(String userName, String userRegNumber, String userFacultyName) {
        this.UserName = userName;
        this.UserRegNumber = userRegNumber;
        this.UserFacultyName = userFacultyName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserRegNumber() {
        return UserRegNumber;
    }

    public String getUserFacultyName() {
        return UserFacultyName;
    }
}