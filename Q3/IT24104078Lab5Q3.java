import java.util.Scanner;

public class IT24104078Lab5Q3 {
    public static void main(String[] args) {
        // Room charge per day as a constant
        final int ROOM_RATE = 48000;

        Scanner input = new Scanner(System.in);

        // Input start date and end date
        System.out.print("Enter the start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = input.nextInt();

        // Validation of dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; // Stop the program if dates are invalid
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be before end date.");
            return; // Stop the program if start date is not before end date
        }

        // Calculate the number of reserved days
        int daysReserved = endDate - startDate;

        // Determine the discount rate
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10; // 10% discount for 3-4 days
        } else if (daysReserved >= 5) {
            discountRate = 20; // 20% discount for 5 or more days
        }

        // Calculate the total cost
        int totalCost = daysReserved * ROOM_RATE;
        int discount = totalCost * discountRate / 100;
        int finalAmount = totalCost - discount;

        // Output the results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total cost before discount: Rs " + totalCost);
        System.out.println("Discount amount: Rs " + discount);
        System.out.println("Final amount to be paid: Rs " + finalAmount);

        input.close(); // Close the scanner
    }
}
