package UserProfileManager;

public class UserInfo {
    String UserName;
    String UserRegNumber;
    String UserFacultyName;
    String UserPhoneNumber;

    public UserInfo(String userName, String userRegNumber, String userFacultyName,  String UserPhoneNumber) {
        this.UserName = userName;
        this.UserRegNumber = userRegNumber;
        this.UserFacultyName = userFacultyName;
        this.UserPhoneNumber = UserPhoneNumber;
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
    public String getPhoneNumber() {
        return UserPhoneNumber;
    }
}