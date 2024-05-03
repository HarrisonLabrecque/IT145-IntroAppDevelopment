
public class Monkey extends RescueAnimal{
	//Creating a list for the accepted species.
	public static String[] AllowedSpecies= {"Capuchin","Guenon","Macaque","Marmoset","Squirrel monkey","Tamarin"};
	
	//Defining monkey specific attributes
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	
	//Defining the constructor method for the monkey class.
	public Monkey(String name, String species, String gender, String age,
		    String weight,String tailLength,String height,String bodyLength,String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		
		
	}
	//getter method
	public String getTailLength() {
		return tailLength;
	}
	//setter method
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}

}
