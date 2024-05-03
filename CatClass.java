// Cat Class inheriting from the Pet Class
public class Cat extends Pet {
    
    // Attributes that can only be accessed from within the Cat class
    private int catSpaceNumber;
    
    // Constructor Method
    public Cat(String name, int catSpaceNumber) {
        super(name);
        this.catSpaceNumber = catSpaceNumber;
    }
    
    // Accessor methods
    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }
    
    // Mutator methods
    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }
}