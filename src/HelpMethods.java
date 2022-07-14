import java.util.Scanner;

public class HelpMethods {
    static Scanner scanner = new Scanner(System.in);

    //method to simulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //method to print separator with length n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method to stop game until user enters anything
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
}