//This line imports the Scanner class from the java.util package.
import java.util.Scanner;
// This line declares a public class named LabProgram.
public class LabProgram {
   //This line declares the main method, which is the entry point of the program.
   public static void main(String[] args) {
      //This line creates a new Scanner object to read input from the console.
      Scanner scnr = new Scanner(System.in);
      String userText; //This line declares a String variable named userText.
      int count = 0; //This line initializes an integer variable count to 0.
   
      userText = scnr.nextLine();  // This line reads a line of input from the user and stores it in the userText variable.
      //This line starts a for loop that iterates over each character in the userText string.
      for (int i = 0; i <userText.length(); i++){
         // This line gets the character at index i from the userText string.
         char character = userText.charAt(i);
         //This line checks if the character is not a space, period, exclamation mark, or comma.
         if (character != ' ' && character != '.' && character != '!' && character != ','){
            //This line increments the count variable if the character is not a space, period, exclamation mark, or comma.
            count = count + 1;
   } //This line closes the if statement.
} //This statement closes the for loop.
//This line prints the count of non-space, non-period, non-exclamation mark, and non-comma characters in the userText string.
System.out.println(count);
}// This line closes the main method.
} //This line closes the LabProgram class.