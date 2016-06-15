
public class CitySim9002 { //class declaration
	
	public static String[] personas = new String[]{"Student","Professor","Business Person","Blogger"};
	public static String[] locations = new String[]{"Cathedral of Learning","The Point","Downtown","Squirrel Hill","Exit"}; 
	
	public static void main(String[] args) { //main method declaration
		
		int seedNumber = 0; //initialize seed variable
		RandomNumberGenerator dice = new RandomNumberGenerator();
		
		if (args.length > 0) { //if statement ensuring some argument was entered on command line
			try{ //try catch to ensure argument is an integer
				if(Integer.parseInt(args[0]) >0 && Integer.parseInt(args[0]) < 10){ //if statement to ensure argument is an int from 1-9				    
				    seedNumber = Integer.parseInt(args[0]); //convert argument to integer and store as seed
				    System.out.println("Welcome to CitySim!  Your seed is " +seedNumber); //welcome user and give feedback				    
				}else{
					System.err.println("Argument must be a one digit integer from 1-9");//inform user argument must be between 1-9
					System.exit(1);
				}
			} catch (NumberFormatException e){//catch block to handle if type is not integer
				 System.err.println("Argument '" + args[0] + "' must be a one integer argument, seed.");
			     System.exit(1);//exit program due to error
			}
		}else{
	        System.err.println("No argument entered, must input seed value. System will now exit.");
	        System.exit(1);
		}
		
		int randomNumber = dice.generator(seedNumber,9)+1;//obtain random number
		
		for(int j = 1; j < 6; j++){//for loop to handle each visitor
			
			String assignedPersona = null;
			String assignedLocation;
			int loopBreaker = 0;//breaks while loop if visitor exits
			int accumulator = 0;//accumulator that ensures that a visitor must visit one location before leaving
			
			assignedPersona = personas[dice.generator(randomNumber,3)];//randomly assign persona for visitor
			System.out.println("Visitor "+j+" is a "+assignedPersona);
			
			while(loopBreaker == 0){//while loop to iterate through locations as long as the visitor does not exit
				
				assignedLocation = locations[dice.generator(5)];//choose random location for visitor to visit
				
				while(accumulator == 0 && assignedLocation == "Exit"){
					assignedLocation = locations[dice.generator(5)];//if visitor exited on first location, keep trying until a real location is generated
				}
				
				if(assignedLocation != "Exit"){
					System.out.println("Visitor "+j+" is going to "+assignedLocation);//Feedback for where visitor is traveling
				}else{
					System.out.println("Visitor "+j+" has left the city");//correct feedback for when visitor leaves
				}
				
				if(assignedPersona == "Student"){ 
					if(assignedLocation == "Cathedral of Learning"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "The Point"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Downtown"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Squirrel Hill"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Exit"){
						loopBreaker = 1;//breaks while loop if visitor exits
					}
				}//end student if statement
				
				if(assignedPersona == "Professor"){
					if(assignedLocation == "Cathedral of Learning"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "The Point"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Downtown"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Squirrel Hill"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Exit"){
						loopBreaker = 1;//breaks while loop if visitor exits
					}
				}//end professor if statement
				
				if(assignedPersona == "Business Person"){
					if(assignedLocation == "Cathedral of Learning"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "The Point"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "Downtown"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Squirrel Hill"){
						System.out.println("Visitor "+j+" did like "+assignedLocation);
					}else if(assignedLocation == "Exit"){
						loopBreaker = 1;//breaks while loop if visitor exits
					}
				}//end business person if statement
				
				if(assignedPersona == "Blogger"){
					if(assignedLocation == "Cathedral of Learning"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "The Point"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "Downtown"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "Squirrel Hill"){
						System.out.println("Visitor "+j+" did not like "+assignedLocation);
					}else if(assignedLocation == "Exit"){
						loopBreaker = 1;//breaks while loop if visitor exits
					}
				}//end blogger if statement
				
				assignedLocation = null;//clear the location so a new one can be randomly selected
				accumulator++;//accumulator that ensures that a visitor must visit one location before leaving
				
			}//end of while loop that iterates through locations for each visitor
			
			System.out.println("***");//print asterisks when visitor leaves city
			randomNumber++;//ensures different random results
			
		}//end for loop to iterate through each visitor
		
	}//end main method
	
}//end CitySim9002 class
