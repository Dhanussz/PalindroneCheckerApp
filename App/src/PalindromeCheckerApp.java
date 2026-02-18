import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Usecase 1 : Dynamic Palindrome (User Input)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reverse = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        if(input.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
