//Created by Harrison LaBrecque
public class Pet {
	//Defining the attributes of this class. 
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	//Creating the constructor method that utilizes the attributes.
	public Pet(String petType,String petName,int petAge,int dogSpaces,int catSpaces,int daysStay,double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpaces = dogSpaces;
		this.catSpaces = catSpaces;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}
	// This method retrieves the type of pet that the owner has.
	public String getPetType() {
		return petType;
	}
	// This method sets what type of pet that the owner has.
	public void setPetType(String petType) {
		this.petType = petType;
	}
	// This method gets the name of the pet.
	public String getPetName() {
		return petName;
	}
	//This method sets the name of the pet.
	public void setPetName(String petName) {
		this.petName = petName;
	}
	//This method retrieves the age of the pet.
	public int getPetAge() {
		return petAge;
	}
	// This method assigns the age to the pet.
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	//This method is getting the location where the dog would stay.
	public int getDogSpaces() {
		return dogSpaces;
	}
	//This method assigns where the dog would be staying for their duration.
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	//This method gets a location for the owner's cat.
	public int getCatSpaces() {
		return catSpaces;
	}
	//This method assigns a spot for the owner's cat during their duration.
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	//This method is used to get the duration of time that the pet will be staying.
	public int getDaysStay() {
		return daysStay;
	}
	//This method is used to set the amount of time that the pet will be staying here.
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	//This method is used to get the amount of money that the owner needs to pay.
	public double getAmountDue() {
		return amountDue;
	}
	//This method sets the amount that the owner needs to pay.
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

}
