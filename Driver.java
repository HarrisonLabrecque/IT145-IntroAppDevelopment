import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static final String[] validStatues = {"Phase I", "Phase II", "Phase III", "Phase IV", "Phase V", "intake", "farm", "in service"};
    // Instance variables (if needed)

    public static void main(String[] args) {
    	//Initializing the lists with some sample data
        initializeDogList();
        initializeMonkeyList();
        Scanner scanner = new Scanner(System.in);
        String MenuOption = ""; //stores user input
        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while (!MenuOption.equals("q")) {
        	//display the menu
        	displayMenu();
        	//reading the user input
        	MenuOption = scanner.nextLine();
        	
        	//using a switch statement to select the right action based on input.
        	switch(MenuOption) {
        	case "1":
        		intakeNewDog(scanner);
        		break;
        	case "2":
        		intakeNewMonkey(scanner);
        		break;
        	case "3":
        		reserveAnimal(scanner);
        		break;
        	case "4":
        		printAnimals("dog");
        		break;
        	case "5":
        		printAnimals("monkey");
        		break;
        	case "6":
        		printAnimals("available");
        		break;
        	case "q":
        		break;
        	default:
        		System.out.println("Invalid option! Please pick another option.");
        		break;
        	
        	}
        	
        	
        }
        
        

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	
    	Monkey monkey1 = new Monkey("Bobo","Guenon","male","4","15","6","10","23","03-15-2022","United States","Phase I",false,"United States");
    	Monkey monkey2 = new Monkey("Luke","Macaque","male","2","10","5","5","8","04-18-2020","United States","Phase III",false,"United States");
    	Monkey monkey3 = new Monkey("Chewy","Tamarin","male","5","12","6","7","15","09-25-2019","United States","in service",false,"United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    	

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
    	//Asking for the name of the dog.
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        //checks to see if the dog is already in the system.
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        //Gathering additional information on the new dog.
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquistion date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        
        String trainingStatus;
        boolean isValid = false;
        
        do {//Asks the user for the training status of the dog.
        	System.out.println("Dog's training status options: Phase I,Phase II, Phase III,Phase IV,Phase V,farm or in service");
        	System.out.println("What is the dog's training status?");
        	trainingStatus = scanner.nextLine();
        	// checks the list against valid responses.
        	for(String option : validStatues) {
        		if (option.equalsIgnoreCase(trainingStatus)) {
        			isValid = true;
        			break;
        		}
        	}
        	//prints message if an invalid is typed.
        	 if (!isValid) {
        		 System.out.println("Invalid input. Please enter a valid option.");
        	 }
        	
        } while (!isValid);
        // finishing the in-take process for the dog.
        System.out.println("Is the dog reserved? yes or no");
        String reserved = scanner.nextLine();
        boolean reserveBool = false;
        //checks to see if user typed in a valid response
        if(!reserved.equalsIgnoreCase("yes") && !reserved.equalsIgnoreCase("no")) {
        	System.out.println("Is the dog reserved? yes or no");
        	reserved = scanner.nextLine();
        	}
        //sets reserveBool to true if they typed in yes.
       	if(reserved.equalsIgnoreCase("yes")) {
    		reserveBool = true;
    	} else {
    		reserveBool = false;
    	}
        
        
        System.out.println("What country would the dog be in service?");
        String inServiceCountry = scanner.nextLine();

        // Add the code to instantiate a new dog and add it to the appropriate list
        //Taking the input and creating a new dog object.
        Dog new_dog = new Dog(name,breed,gender,age,weight,acquisitionDate,acquisitionCountry,trainingStatus,reserveBool,inServiceCountry);
        //stores the new data.
        dogList.add(new_dog);
        
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            //Asking for the name of the monkey.
        	System.out.println("What is the monkey's name?");
        	String name = scanner.nextLine();
        	//checks to see if monkey is already in the database.
        	for (Monkey monkey : monkeyList) {
        		if(monkey.getName().equalsIgnoreCase(name)) {
        			System.out.println("\n\nThis monkey is already in our system\n\n");
        			return;
        		}
        	}
        	
        	boolean invalid_species = true;
        	String species;
        	
        	//Prompts the user to input a monkey's species and checks if the input matches any of the allowed species in the Monkey class. 
        	//If the input is not a valid species, it will continue to prompt the user until a valid species is entered.
        	do {
        		System.out.println("What is the monkey's species?");
        		species = scanner.nextLine();
        		
        		for(String valid_species: Monkey.AllowedSpecies) {
        			if(species.equalsIgnoreCase(valid_species)) {
        				invalid_species = false;
        			}
        		}
        		if(invalid_species) {
        			System.out.println("Invalid species.");
        		}
        		
        	}while(invalid_species);
        	//gathering additional information.
        	System.out.println("What is the monkey's gender?");
        	String gender = scanner.nextLine();
        	System.out.println("What is the monkey's age?");
        	String age = scanner.nextLine();
        	System.out.println("What is the weight of the monkey?");
        	String weight = scanner.nextLine();
        	System.out.println("What is the tail length of the monkey?");
        	String tailLength = scanner.nextLine();
        	System.out.println("What is the height of the monkey?");
        	String height = scanner.nextLine();
        	System.out.println("What is the body length of the monkey?");
        	String bodyLength = scanner.nextLine();
        	System.out.println("What is the monkey's acquistion date?");
        	String acquisitionDate = scanner.nextLine();
        	System.out.println("What is the monkey's acquistion country?");
        	String acquisitionCountry = scanner.nextLine();
        	
        	String trainingStatus;
        	boolean isValid = false;
        	//Asks the user what is the training status of the monkey.
        	do {
        		System.out.println("Monkey's training status options: Phase I,Phase II, Phase III,Phase IV,Phase V,farm or in service");
        		System.out.println("What is the dog's training status?");
        		trainingStatus = scanner.nextLine();
        		//loops through the valid status list to confirm that the input was valid.
        		for(String option : validStatues) {
        			if (option.equalsIgnoreCase(trainingStatus)) {
        				isValid = true;
        				break;
        			}
        			
        		}
        		//if the input was invalid it would print this message.
        		if (!isValid) {
        			System.out.println("Invalid input. Please enter a valid option.");
        		}
        		
        		
        	}while(!isValid);
        	
        	
        	
        	//finishing the in-take process.
        	System.out.println("Is the monkey reserved? yes or no");
        	String reserved = scanner.nextLine();
        	boolean reserveBool = false;
        	
        	//checks to see if the user entered a valid response.
        	if(!reserved.equalsIgnoreCase("yes") && !reserved.equalsIgnoreCase("no")) {
        		System.out.println("Is the monkey reserved? yes or no");
        		reserved = scanner.nextLine();
        	//sets the reserveBool equal to true if the monkey is reserved.
        		}
       		if (reserved.equalsIgnoreCase("yes")) {
    			reserveBool = true;
    		} else {
    			reserveBool = false;
    		}
        	
        	System.out.println("What country would the monkey be in service?");
        	String inServiceCountry = scanner.nextLine();
        	
        	
        	//Creating  a new monkey object.
        	Monkey new_monkey = new Monkey(name,species,gender,age,weight,tailLength,height,bodyLength,acquisitionDate,acquisitionCountry,trainingStatus,reserveBool,inServiceCountry);
        	//adding new monkey to the list.
        	monkeyList.add(new_monkey);
        
        	
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	//asks the user to enter in the animal.
        	System.out.println("Please enter a animal type.");
        	String animal = scanner.nextLine();
        	//asks the user to enter in the service country.
        	System.out.println("Enter the service country: ");
        	String serviceCountry = scanner.nextLine();
        	//
        	if(animal.equalsIgnoreCase("dog")) {
        		for(Dog dog: dogList) {
                    if(dog.getInServiceLocation().equals(serviceCountry) && !dog.getReserved()&& dog.getTrainingStatus().equals("in service")) {
                        //update the reserved attribute
                        dog.setReserved(true);
                        System.out.println("Dog reserved successfully.");
                        return;
                    }
        	} System.out.println("No available dogs in the specified country.");
        		} else if (animal.equalsIgnoreCase("monkey")) {
        			for(Monkey monkey: monkeyList) {
        				if(monkey.getInServiceLocation().equals(serviceCountry) && !monkey.getReserved() && monkey.getTrainingStatus().equals("in service")) {
                            //update the reserved attribute
                            monkey.setReserved(true);
                            System.out.println("Monkey reserved successfully.");
                            return;
                        }
        			}System.out.println("No available monkey in the specified country.");
        	} else {
        		System.out.println("No animals of this type and location are available.");
        	}
        	 
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String option) {
        	//If the option is "dog", it prints a header and then iterates through the dogList to display each dog's name, training status, service location, and reservation status.
        	if (option.equalsIgnoreCase("dog")) {
        		System.out.println("Name\tTraining_Status\tService_Location\tReserved");
        		//For each dog in the dogList, it prints the name, training status, service location, and reservation status.
        		for (int i = 0; i < dogList.size(); i++) {
        			System.out.println(dogList.get(i).getName() + "\t\t" + dogList.get(i).getTrainingStatus() + "\t\t" + dogList.get(i).getInServiceLocation() + "\t\t" + dogList.get(i).getReserved());
        		}
        	  //If the option is "monkey", it prints a header and then iterates through the dogList to display each dog's name, training status, service location, and reservation status.
        	} else if (option.equalsIgnoreCase("monkey")) {
        		System.out.println("Name\tTraining_Status\tService_Location\tReserved");
        		////For each monkey in the monkeyList, it prints the name, training status, service location, and reservation status.
        		 for (int i = 0; i < monkeyList.size(); i++) {
        			 System.out.println(monkeyList.get(i).getName() + "\t\t" + monkeyList.get(i).getTrainingStatus() + "\t\t" + monkeyList.get(i).getInServiceLocation() + "\t\t" + monkeyList.get(i).getReserved());
        		 }
        	//If the option is neither "dog" nor "monkey", it prints the same header and then iterates through both dogList and monkeyList to find animals that are in service but not reserved.	 
        	} else {
        		System.out.println("Name\tTraining_Status\tService_Location\tReserved");
        		//For each dog in the dogList meeting the criteria, it prints the name, training status, service location, and reservation status.
        		for (int i = 0; i < dogList.size(); i++) {
        			if (dogList.get(i).getTrainingStatus().equals("in service") && !dogList.get(i).getReserved()) {
        				System.out.println(dogList.get(i).getName() + "\t\t" + dogList.get(i).getTrainingStatus() + "\t" + dogList.get(i).getInServiceLocation() + "\t\t" + dogList.get(i).getReserved());
        			}
        		}
        		//For each monkey in the monkeyList meeting the criteria, it prints the name, training status, service location, and reservation status.
        		for (int i = 0; i < monkeyList.size(); i++) {
        			if (monkeyList.get(i).getTrainingStatus().equals("in service") && !monkeyList.get(i).getReserved()) {
        				System.out.println(monkeyList.get(i).getName() + "\t" + monkeyList.get(i).getTrainingStatus() + "\t" + monkeyList.get(i).getInServiceLocation() + "\t\t" + monkeyList.get(i).getReserved());
        			}
        		}
        	}
        	

        }
}

