import java.util.Scanner;

public class Algos{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Output: Calculate the sum using the formula and display the result
        long sum = (long) n * (n + 1) / 2;  // Use long to avoid overflow
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
