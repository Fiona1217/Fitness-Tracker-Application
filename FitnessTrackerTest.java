import java.util.Scanner;

/**
 * FitnessTrackerTest.java
 */
public class FitnessTrackerTest {

	/**
	 * The main method
	 * @param args The command-line
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String userFirstName = input.nextLine();
		
		System.out.print("Enter last name: ");
		String userLastName = input.nextLine();
		
		String userGender; //local variable
		while(true) {
			System.out.print("Enter gender (Male/Female): ");
			userGender = input.nextLine();

			if(userGender.equalsIgnoreCase("Male") || userGender.equalsIgnoreCase("Female")) {
				break;
			}
			else {
				System.out.println("Please enter either 'Male' or 'Female'");
			}	
		}
		
		System.out.print("Enter daily steps: ");
		int userDailySteps = input.nextInt();
		
		System.out.print("Enter daily calories burned: ");
		int userDailyCalories = input.nextInt();
		
		System.out.print("Enter daily active minutes: ");
		int userDailyActive = input.nextInt();
		
		System.out.print("Enter daily maintenance calories: ");
		int userDailyMaintenance = input.nextInt();
		
		System.out.println(" ");
		
		
		FitnessTracker user = new FitnessTracker(userFirstName, userLastName,
				userGender, userDailySteps, userDailyCalories, userDailyActive);
		
		user.calculateDistance();
		user.weeklyActive();
		user.determineFitnessLevel();
		user.caloriesDeficit(userDailyMaintenance);
		
		user.displayFitnessData(userDailyMaintenance);
		
		input.close();
  }
}
