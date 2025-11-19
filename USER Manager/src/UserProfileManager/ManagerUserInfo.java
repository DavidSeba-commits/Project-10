package UserProfileManager;

import java.util.ArrayList;
import java.util.List;

public class ManagerUserInfo {
    private List<UserInfo> users = new ArrayList<>();

    // Add a user
    public void storeUser(UserInfo user) {
        users.add(user);
    }

    // Retrieve a user by name
    public UserInfo getUser(String name) {
        for (UserInfo user : users) {
            if (user.getUserName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    // Display a user by name with Boolean control
    public void displayUser(String name, boolean showName, boolean showReg, boolean showFaculty) {
        UserInfo user = getUser(name);
        if (user == null) {
            System.out.println("User '" + name + "' Not Found");
            return;
        }
        displaySingleUser(user, showName, showReg, showFaculty);
    }

    // Private method to display a single user with Boolean control
    private void displaySingleUser(UserInfo user, boolean showName, boolean showReg, boolean showFaculty) {
        StringBuilder info = new StringBuilder();

        if (showName) {
            info.append("Name: ").append(user.getUserName());
        }

        if (showName && showReg) {
            info.append(", ");
        } else if (showReg && info.length() > 0) {
            info.append(", ");
        }

        if (showReg) {
            info.append("RegNumber: ").append(user.getUserRegNumber());
        }

        if ((showName || showReg) && showFaculty) {
            info.append(", ");
        } else if (showFaculty && info.length() > 0) {
            info.append(", ");
        }

        if (showFaculty) {
            info.append("Faculty: ").append(user.getUserFacultyName());
        }

        System.out.println(info.toString());
    }
}