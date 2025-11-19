package UserProfileManager;

public class UserInfo {
    String UserName;
    String UserRegNumber;
    String UserFacultyName;
    String UserEmail;

    public UserInfo(String userName, String userRegNumber, String userFacultyName) {
        this.UserName = userName;
        this.UserRegNumber = userRegNumber;
        this.UserFacultyName = userFacultyName;
        this.UserEmail = userName;
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

    public String getUserEmail() {
        return UserEmail;
    }
}