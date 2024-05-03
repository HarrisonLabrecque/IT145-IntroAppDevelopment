import java.util.Scanner;

public class OutputWithVars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;

        System.out.println("Enter integer: ");
        userNum = scanner.nextInt();
        System.out.println("You entered: " + userNum);

        // Calculate and output the square and cube of userNum
        int squared = userNum * userNum;
        int cubed = userNum * userNum * userNum;
        System.out.println(userNum + " squared is " + squared);
        System.out.println("And " + userNum + " cubed is " + cubed + "!!");

        // Prompt user for a second input and store it in userNum2
        System.out.println("Enter another integer: ");
        int userNum2 = scanner.nextInt();

        // Calculate and output the sum and product of userNum and userNum2
        int sumResult = userNum + userNum2;
        int productResult = userNum * userNum2;
        System.out.println(userNum + " + " + userNum2 + " is " + sumResult);
        System.out.println(userNum + " * " + userNum2 + " is " + productResult);

        return;
    }
}