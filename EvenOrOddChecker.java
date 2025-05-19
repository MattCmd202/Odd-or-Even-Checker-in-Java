import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scnr.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
