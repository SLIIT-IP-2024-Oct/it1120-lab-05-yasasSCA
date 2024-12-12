import java.util.Scanner;

public class IT24104078Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of new members
        System.out.print("Enter the number of new members: ");
        int newMembers = input.nextInt();

        // Validate input
        if (newMembers < 0) {
            System.out.println("Invalid number. Please enter 0 or more.");
        } else {
            // Determine the prize
            String prize;
            if (newMembers == 0) {
                prize = "No Prize";
            } else if (newMembers == 1) {
                prize = "Pen";
            } else if (newMembers == 2) {
                prize = "Umbrella";
            } else if (newMembers == 3) {
                prize = "Bag";
            } else if (newMembers == 4) {
                prize = "Travelling Chair";
            } else {
                prize = "Headphone";
            }

            // Print the prize
            System.out.println("Prize: " + prize);
        }

        input.close();
    }
}
