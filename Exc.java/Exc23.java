
import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.println("Uppercase: " + upperCaseInput);
        scanner.close();
    }
}