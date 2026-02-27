import java.util.Scanner;

public class SmartVault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String userInput = sc.nextLine();

        String input = userInput.substring("Blackbox{".length(), userInput.length()-1);

        if (checkPassword(input)) {
            System.out.println("Access granted. Flag: Blackbox{" + input + "}");
        } else {
            System.out.println("Access denied!");
        }
    }

    public static boolean checkPassword(String password) {
        int[] secret = {84, 72, 51, 95, 82, 51, 65, 76};

        String built = "";
        for (int num : secret) {
            built += (char) num;
        }

        return password.equals(built);
    }
}