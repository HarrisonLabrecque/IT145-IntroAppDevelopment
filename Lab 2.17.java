import java.util.Scanner;

public class LabProgram {
    
    // Method to calculate the dollar cost to drive the given miles.
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        // Calculates how much it would cost to drive a certain amount of miles.
        double cost_to_drive = (milesDriven / milesPerGallon) * dollarsPerGallon;
        // Returns the calculated result.
        return cost_to_drive;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the car's miles per gallon.
        System.out.println("Enter the car's miles per gallon: ");
        double milesPerGallon = sc.nextDouble();
        //Input the price of gas in dollars per gallon.
        System.out.println("Enter the price of gas in dollars per gallon: ");
        double dollarsPerGallon = sc.nextDouble();
        
        // Calculate and output gas cost for 10 miles, 50 miles, and 400 miles.
        double cost10Miles = drivingCost(milesPerGallon, dollarsPerGallon, 10.0);
        double cost50Miles = drivingCost(milesPerGallon, dollarsPerGallon, 50.0);
        double cost400Miles = drivingCost(milesPerGallon, dollarsPerGallon, 400.0);
        
        // Output the results with two decimal points
        System.out.printf("%.2f %.2f %.2f\n", cost10Miles, cost50Miles, cost400Miles);
        
        return;
    }
}