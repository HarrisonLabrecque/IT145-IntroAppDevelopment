import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
    	//defining the variables that would be used.
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        
        // The first do-while loop in the code prompts the user to input the wall's height and ensures that the input is valid. 
        //It checks if the input is a valid double and if it is a positive value. 
        //If the input is not valid, it provides appropriate error messages and prompts the user to enter a valid value.
        do {
            System.out.println("Enter wall height (feet): ");
            // Check if input is a valid double
            if (scnr.hasNextDouble()) {
                wallHeight = scnr.nextDouble();
                // Check if input is negative
                if (wallHeight > 0) {
                    // Break the loop if input is valid and positive
                    break;
                } else if (wallHeight == 0) {
                    System.out.println("Height cannot be zero. Please enter a non-zero value.");
                } else {
                    System.out.println("Height cannot be negative. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.next(); // Clear the invalid input
            }
        } while (true);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        // The second do-while loop in the code prompts the user to input the wall's width and follows a similar validation process as the first loop.
        //It checks if the input is a valid double and if it is a positive value. 
        //If the input is not valid, it provides appropriate error messages and prompts the user to enter a valid value.
        
        do {
            System.out.println("Enter wall width (feet): ");
            // Check if input is a valid double
            if (scnr.hasNextDouble()) {
                wallWidth = scnr.nextDouble();
                // Check if input is negative
                if (wallWidth > 0) {
                    // Break the loop if input is valid and positive
                    break;
                } else if (wallWidth == 0) {
                    System.out.println("Width cannot be zero. Please enter a non-zero value.");
                } else {
                    System.out.println("Width cannot be negative. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.next(); // Clear the invalid input
            }
        } while (true);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
