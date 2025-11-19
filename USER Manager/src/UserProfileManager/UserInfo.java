package UserProfileManager;

public class UserInfo {
    String UserName;
    String UserRegNumber;
    String UserFacultyName;
    String PhoneNumber;

    public UserInfo(String userName, String userRegNumber, String userFacultyName, String PhoneNumber) {
        this.UserName = userName;
        this.UserRegNumber = userRegNumber;
        this.UserFacultyName = userFacultyName;
        this.PhoneNumber = PhoneNumber;
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
        return PhoneNumber;
    }
}