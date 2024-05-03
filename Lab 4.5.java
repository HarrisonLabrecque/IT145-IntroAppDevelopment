import java.util.Scanner;
//This line declares a public class named PeopleWeights.
public class PeopleWeights {
   //This line declares the main method, which is the entry point of the program.
   public static void main(String[] args) {
      //This line creates a Scanner object named input to read input from the user.
      Scanner input = new Scanner(System.in);
      //This line declares an array named weights to store 5 double values.
      double[] weights = new double[5];
      //This line declares a variable totalWeight and initializes it to 0.
      double totalWeight = 0;
      // This line declares a variable maxWeight and initializes it to the first element of the weights array.
      double maxWeight = weights[0];
      
      
      //This line starts a for loop to iterate over the weights array.
      for (int i = 0; i < 5; i++){
         //This line prompts the user to enter a weight.
         System.out.println("Enter weight " +(i + 1) +": ");
         //This line reads the user input and stores it in the weights array.
         weights[i] = input.nextDouble();
      }
      //Adding the newline to add some space.
      System.out.println();
      //This line prints a message indicating the user input will be displayed.
       System.out.print("You entered: ");
      //This line starts a for-each loop to iterate over the weights array.
      for (double weight : weights){
         // This line prints each weight entered by the user.
         System.out.print(weight + " ");
      }
      //This line starts another for-each loop to iterate over the weights array.
      for (double weight : weights){
         //This line calculates the total weight by summing up all the weights.
         totalWeight = totalWeight + weight;
         //This line updates the maxWeight if a weight greater than the current maxWeight is found.
         if (weight > maxWeight){
            maxWeight = weight;
         }
      }
      //This line calculates the average weight by dividing the total weight by the number of weights.
      double averageWeight = totalWeight / 5;
      
      
      //This line prints the total weight.
      System.out.println("\nTotal weight: " + totalWeight);
      //This line prints the average weight.
      System.out.println("Average weight: " + averageWeight);
      // This line prints the maximum weight entered.
      System.out.println("Max weight: " + maxWeight);

      
      
      
      return;
   }
}