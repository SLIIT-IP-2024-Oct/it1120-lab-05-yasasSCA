import java.util.Scanner;

public class IT24104078Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input three numbers
        System.out.println("Enter three different integers:");

        System.out.print("First number: ");
        int num1 = scanner.nextInt();

        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Third number: ");
        int num3 = scanner.nextInt();

        // Finding the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Finding the smallest number
        int smallest = Math.min(num1, Math.min(num2, num3));

        // Output the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
