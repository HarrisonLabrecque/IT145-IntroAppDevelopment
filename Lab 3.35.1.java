//This line imports the Scanner class from the java.util package, which is used for user input.
import java.util.Scanner;
//This line declares a public class named DrawHalfArrow.
public class DrawHalfArrow {
//This line declares the main method, which is the entry point of the program.
public static void main(String[] args) {
//This line creates a new Scanner object named `scnr` to read input from the console.
Scanner scnr = new Scanner(System.in);
//Declaring 3 integer variables without initializing them.
int arrowBaseHeight;
int arrowBaseWidth;
int arrowHeadWidth;
//This line prints a message asking the user to enter the arrow base height.
System.out.println("Enter arrow base height:");
//This line reads an integer input from the user and assigns it to the `arrowBaseHeight` variable.
arrowBaseHeight = scnr.nextInt();
//This line prints a message asking the user to enter the arrow base width.
System.out.println("Enter arrow base width:");
//This line reads an integer input from the user and assigns it to the `arrowBaseWidth` variable.
arrowBaseWidth = scnr.nextInt();
//This line prints a message asking the user to enter the arrow head width.
System.out.println("Enter arrow head width:");
//This line reads an integer input from the user and assigns it to the `arrowHeadWidth` variable.
arrowHeadWidth = scnr.nextInt();

// Check if arrowHeadWidth is less than or equal to arrowBaseWidth
while(arrowHeadWidth <= arrowBaseWidth){
   // Prompt user to enter arrow head width
   System.out.println("Enter arrow head width:");
   //Read user input for arrow head width
   arrowHeadWidth = scnr.nextInt();
   
}

//This line prints an empty line.
System.out.println("");

// The following nested for loop draws the arrow base using asterisks based on the user input for height and width.
for (int i = 0; i < arrowBaseHeight; i++) {
for (int j = 0; j < arrowBaseWidth; j++) {
System.out.print("*");
}
System.out.println();
}

//The following nested for loop draws the arrow head using asterisks based on the user input for the head width.
for (int i = arrowHeadWidth; i > 0; i--) {
for (int j = 0; j < i; j++) {
System.out.print("*");
}
System.out.println();
}
}// This line marks the end of the main method.
}// This line marks the end of the DrawHalfArrow class.