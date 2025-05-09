/**
 * DESCRIPTION: 
 * @version: openjdk 21.0.4 2024-07-16 LTS
 * @since: javac 21.0.4
 * @see java.lang.Object
 * @author Fiona .
 */

/**
 * FitnessTracker.java
 * Starter code for FitnessTracker assignment.
 */
public class FitnessTracker {
	/**
	 * First Name of FitnessTracker
	 */
	private String firstName;
	
	/**
	 * Last Name of FitnessTracker
	 */
	private String lastName;
	
	/**
	 * The gender of FitnessTracker
	 */
	private String gender;
	
	/**
	 * Amount of steps taken of FitnessTracker (daily)
	 */
	private int stepsTaken;
	
	/**
	 * Number of calories burned of FitnessTracker (daily)
	 */
	private int caloriesBurned;
	
	/**
	 * Amount of active minutes of FitnessTracker (daily)
	 */
	private int activeMinutes;
	
	/**
	 * A constant variable for male steps (in meters)
	 */
	private final double MALE_STEPS = 0.8;
	
	/**
	 * A constant variable for female steps (in meters)
	 */
	private final double FEMALE_STEPS = 0.7;
	
	/**
	 * A constant variable for day of week
	 */
	private final int DAY_OF_WEEK = 7;
	
	/**
	 * A variable for weekly active minutes
	 */
	private double weekActive;
	
	/**
	 * A variable for fitness level
	 */
	private String fitnessLevel;
	
	/**
	 * A variable for steps length
	 */
	private double stepLength;
	
	/**
	 * A variable for calories deficit result
	 */
	private int caloriesDeficitResult;
  
	/**
	 * This is the default constructor for FitnessTracker.
	 */
	public FitnessTracker() {
		
	}
	
	/**
	 * This is a constructor for FitnessTracker. It initialized the user's
	 * first and last name, gender, steps taken, calories burned, active minutes,
	 * and the maintenance calories.
	 * 
	 * @param firstName The first name of FitnessTracker
	 * @param lastName The last name of FitnessTracker
	 * @param gender The gender of FitnessTracker
	 * @param stepsTaken The amount of steps taken of FitnessTracker
	 * @param caloriesBurned The total of calories burned of FitnessTracker
	 * @param activeMinutes The minute of being active of FitnessTracker
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int stepsTaken, int caloriesBurned, int activeMinutes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.stepsTaken = stepsTaken;
		this.caloriesBurned = caloriesBurned;
		this.activeMinutes = activeMinutes;
	}

	/**
	 * Returns the firstName of user
	 * @return firstName of FitnessTracker
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the firstName of the user
	 * @param firstName The first name of FitnessTracker
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns the lastName of user
	 * @return lastName of FitnessTracker
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the lastName of the user
	 * @param lastName The last name of FitnessTracker
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the gender of user
	 * @return gender of FitnessTracker
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender of the user
	 * @param gender The gender of FitnessTracker
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Returns the stepsTaken of user
	 * @return stepsTaken of FitnessTracker
	 */
	public int getStepsTaken() {
		return stepsTaken;
	}
	
	/**
	 * Sets the stepsTaken of the user
	 * @param stepsTaken The number of steps taken of FitnessTracker
	 */
	public void setStepsTaken(int stepsTaken) {
		this.stepsTaken = stepsTaken;
	}
	
	/**
	 * Returns the caloriesBurned of user
	 * @return caloriesBurned of FitnessTracker
	 */
	public int getCaloriesBurned() {
		return caloriesBurned;
	}
	
	/**
	 * Sets the caloriesBurned of the user
	 * @param caloriesBurned The amount of calories burned of FitnessTracker
	 */
	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}
	
	/**
	 * Returns the activeMinutes of user
	 * @return activeMinutes of FitnessTracker
	 */
	public int getActiveMinutes() {
		return activeMinutes;
	}
	
	/**
	 * Sets the activeMinutes of the user
	 * @param activeMinutes The amount of active minutes of FitnessTracker
	 */
	public void setActiveMinutes(int activeMinutes) {
		this.activeMinutes = activeMinutes;
	}
	
	/**
	 * Returns the stepLength of user
	 * @return the amount of distance based on gender.
	 */
	public double calculateDistance() {
		if (gender.equalsIgnoreCase("Male")) {
			stepLength = MALE_STEPS * stepsTaken;
		}
		else {
			stepLength = FEMALE_STEPS * stepsTaken;
		}
		return stepLength;
	}
	
	/**
	 * This is a void method (does not return anything)
	 */
	public void weeklyActive() {
		weekActive = activeMinutes * DAY_OF_WEEK;
	}
	
	/**
	 * Returns the fitnessLevel of user
	 * @return fitness level based on weekly active minutes and weekly calories burned
	 */
	public String determineFitnessLevel() {
		int weekCal = caloriesBurned * DAY_OF_WEEK;
		if ( (activeMinutes * DAY_OF_WEEK) > 150 && weekCal > 2000) {
			fitnessLevel = "Active";
		}
		else if(( (activeMinutes * DAY_OF_WEEK) >= 75 && (activeMinutes * DAY_OF_WEEK) <= 150) || (weekCal >= 1000 && weekCal <= 2000)) {
			fitnessLevel = "Moderately Active";
		}
		else {
			fitnessLevel = "Sedentary";
		}
		return fitnessLevel;
	}
	
	/**
	 * Returns the caloriesDeficitResult of user
	 * @param maintenanceCal The daily maintenance calories of user
	 * @return the result for calories deficit
	 */
	public int caloriesDeficit(int maintenanceCal) {
		caloriesDeficitResult =  maintenanceCal - caloriesBurned;
		return caloriesDeficitResult;
	}
	
	/**
	 * This is a void method (does not return anything)
	 * @param maintenanceCal The daily maintenance calories of user
	 */
    public void displayFitnessData(int maintenanceCal) {
    	System.out.println("--- User Fitness Data ---");
    	System.out.printf("Name: %s %s%nGender: %s%nDaily Steps: %d%nDistance Walked: %.1f meters%nWeekly Active Minutes: %.1f%nFitness Level: %s%nDaily Calories Deficit/Surplus: %d%n", firstName, lastName, gender, stepsTaken, stepLength, weekActive, fitnessLevel, caloriesDeficitResult);
      System.out.println("Fitness Level Criteria:");
      System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
      System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
      System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
    }
}
