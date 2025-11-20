import UserProfileManager.UserInfo;
import UserProfileManager.ManagerUserInfo;
import com.unibupay.app.FeeItemController;

public class Main {
    public static void main(String[] args) {

        // Creation of the user manager

        ManagerUserInfo userManager = new ManagerUserInfo();

        // Adding a few users

        UserInfo user1 = new UserInfo("Alice Dupont", "24/7812/CSS-S", "Computer Science", "+256 770 799 058");
        UserInfo user2 = new UserInfo("David SEBA", "24/1619/BIT-S", "Informational Technology" "+256 770 799 058");
        UserInfo user3 = new UserInfo("Charlie Brown", "25/9089/BM-S", "Business Management" "+256 770 799 058");


        // Adding users to the manager system

        userManager.storeUser(user1);
        userManager.storeUser(user2);
        userManager.storeUser(user3);

        //Displaying users with different Boolean combinations

        System.out.println("=== UNIBU PAY - School Fees Management System ===");
        System.out.println("=== Student Personal Informations===");

        System.out.println();
        userManager.displayUser("David SEBA", true, true, true);
        userManager.displayUser("Alice Dupont", true, true, true);
        userManager.displayUser("Charlie Brown", true, false, true);


        // Create the controller
        var controller = new FeeItemController();

        // Add some sample fee items

        System.out.println("\n--- Adding Fee Items ---");
        controller.addNewFeeItem("FEE001", "Tuition Fee 2024", "Annual tuition fee for undergraduate programs",
                2500.00, "TUITION", "2024-ANNUAL");

        controller.addNewFeeItem("FEE002", "Hostel Accommodation", "Semester hostel fee",
                1200.00, "ACCOMMODATION", "2024-SEM1");

        controller.addNewFeeItem("FEE003", "Library Fee", "Library access and resources fee",
                150.00, "LIBRARY_FEE", "2024-SEM1");

        controller.addNewFeeItem("FEE004", "Medical Insurance", "Student health insurance coverage",
                300.00, "INSURANCE", "2024-ANNUAL");

        // Display all available fee items

        System.out.println("\n--- Displaying Available Fee Items ---");
        controller.displayAllFeeItems();

        // Process fee items (simulate payment processing)

        System.out.println("\n--- Processing Fee Items ---");
        controller.processFeeItems();

        // Demonstrate adding one more item

        System.out.println("\n--- Adding Additional Fee Item ---");
        controller.addNewFeeItem("FEE005", "Laboratory Fee", "Science lab equipment and maintenance",
                200.00, "LAB_FEE", "2024-SEM1");

        // Display updated list

        System.out.println("\n--- Updated Fee Items List ---");
        controller.displayAllFeeItems();

    }
}