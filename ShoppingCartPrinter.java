import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
       //creates a new Scanner object named "scnr" that reads input from the standard input stream (System.in).
        Scanner scnr = new Scanner(System.in);
        //defining our variables.
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;
        //Creating 2 new objects of the ItemtoPurchase class.
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Prompt user to enter the details for the first item.
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());

        // Clear the newline character from the buffer
        scnr.nextLine();
        //Prompt user to enter the details for the second item.
        System.out.println("\nItem 2");
        System.out.println("Enter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());

        // Calculate the total cost.
        int totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        // Output the total cost
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice() * item1.getQuantity()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice() * item2.getQuantity()));
        System.out.println("");
        System.out.println("Total: $" + totalCost);
    }
}