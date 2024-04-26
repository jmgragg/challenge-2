import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the URL:");
        String url = scanner.nextLine();

        if (url.equals("https://www.example.com")) {
            System.out.println("You have access to the secret network.");
        } else {
            System.out.println("You do not have access to the secret network.");
        }
    }
}