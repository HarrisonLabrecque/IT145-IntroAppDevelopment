public class ItemToPurchase {
    // These lines declare private fields itemName, itemPrice, and itemQuantity of the ItemToPurchase class.
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
//This line defines a constructor for the ItemToPurchase class.
    public ItemToPurchase() {
       //These lines initialize the itemName, itemPrice, and itemQuantity fields to default values in the constructor.
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    // This line defines a setter method setName to set the itemName field.
    public void setName(String name) {
        this.itemName = name;
    }
//This line defines a setter method setPrice to set the itemPrice field.
    public void setPrice(int price) {
        this.itemPrice = price;
    }
//This line defines a setter method setQuantity to set the itemQuantity field.
    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    //This line defines a getter method getName to retrieve the itemName field.
    public String getName() {
        return this.itemName;
    }
//This line defines a getter method getPrice to retrieve the itemPrice field.
    public int getPrice() {
        return this.itemPrice;
    }
//This line defines a getter method getQuantity to retrieve the itemQuantity field.
    public int getQuantity() {
        return this.itemQuantity;
    }

    // This line defines a method printItemPurchase to print the details of the item to purchase.
    public void printItemPurchase() {
        System.out.println(itemQuantity + " " + itemName + " $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }
}