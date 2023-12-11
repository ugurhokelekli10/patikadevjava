import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;

        String[][] users = {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        boolean isFound = false;
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }
}
