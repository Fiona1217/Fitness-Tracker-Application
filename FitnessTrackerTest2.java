import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * FitnessTrackerTest2
 * Tester code for FitnessTracker assignment.
 */
class FitnessTrackerTest2 {

	/**
	 * TEST 1 (SUCCESS): Tests the calculateDistance() method from the FitnessTracker class.
	 * The user is set to 'female' and steps taken to 100. The expected output
	 * is 70.0 as it returns double and 100 * 0.7 is 70.
	 */
	@Test
	public void testCalculateDistance() {
		//set up the test
		FitnessTracker user = new FitnessTracker();
		user.setStepsTaken(100);
		user.setGender("Female");
		
		//expected value or output
		final double expectedCalculateDistance = 70.0;
		
		double actualCalculateDistance = user.calculateDistance();
		
		assertEquals(expectedCalculateDistance,actualCalculateDistance);
	}
	
	/**
	 * TEST 2 (FAIL): Tests the calculateDistance() method from the FitnessTracker class.
	 * The user is set to 'male' and steps taken to 90. It fails because the
	 * expected output is 70.0. The actual output is 72 (90*0.8).
	 */
	@Test
	public void testCalculateDistance1() {
		//set up the test
		FitnessTracker user1 = new FitnessTracker();
		user1.setStepsTaken(90);
		user1.setGender("Male");
		
		//expected value or output
		final double expectedCalculateDistance = 70.0;
		
		double actualCalculateDistance = user1.calculateDistance();
		
		assertEquals(expectedCalculateDistance,actualCalculateDistance);
	}
	
	/**
	 * TEST 3 (SUCCESS): Tests the caloriesDeficit() method from the FitnessTracker class.
	 * The user's caloriesBurned is set to 2000 and userDailyMaintenance to 1000.
	 * The expected output is -1000 as 1000-2000 is -1000.
	 */
	@Test
	public void testCaloriesDeficit() {
		//set up the test
		FitnessTracker user2 = new FitnessTracker();
		user2.setCaloriesBurned(2000);
		int userDailyMaintenance = 1000;
		
		
		//expected value or output
		final double expectedCaloriesDeficit = -1000;
		
		double actualCaloriesDeficit = user2.caloriesDeficit(userDailyMaintenance);
		
		assertEquals(expectedCaloriesDeficit,actualCaloriesDeficit);
	}
	
	/**
	 * TEST 4 (FAIL): Tests the caloriesDeficit() method from the FitnessTracker class.
	 * The user's caloriesBurned is set to 1000 and userDailyMaintenance1 to 3000. This
	 * fails because the expected output is -1000. The actual output is 2000.
	 */
	@Test
	public void testCaloriesDeficit1() {
		//set up the test
		FitnessTracker user2 = new FitnessTracker();
		user2.setCaloriesBurned(1000);
		int userDailyMaintenance1 = 3000;
		
		//expected value or output
		final double expectedCaloriesDeficit = -1000;
		
		double actualCaloriesDeficit = user2.caloriesDeficit(userDailyMaintenance1);
		
		assertEquals(expectedCaloriesDeficit,actualCaloriesDeficit);
	}
	
	/**
	 * TEST 5 (SUCCESS): Tests the determineFitnessLevel() method from the FitnessTracker class.
	 * The user's caloriesBurned is set to 30 and activeMinutes to 15.
	 * The expected output is 'Moderately Active' as weekly calories burned is
	 * 210 (30*7), and weekly active minutes is 105 (15*7). The calories burned
	 * did not meet the requirement, but the active minute does.
	 */
	@Test
	public void testDetermineFitnessLevel() {
		//set up the test
		FitnessTracker user4 = new FitnessTracker();
		user4.setCaloriesBurned(30);
		user4.setActiveMinutes(15);
		
		//expected value or output
		final String expectedDetermineFitnessLevel = "Moderately Active";
		
		String actualDetermineFitnessLevel = user4.determineFitnessLevel();
		
		assertEquals(expectedDetermineFitnessLevel,actualDetermineFitnessLevel);
	}
	
	/**
	 * TEST 6 (FAIL): Tests the determineFitnessLevel() method from the FitnessTracker class.
	 * The user's caloriesBurned is set to 1000 and activeMinutes to 2. This fails
	 * because the expected output is 'Active'. Weekly calories burned is
	 * 7000 (1000*7), and weekly active minutes is 14 (2*7). The calories burned
	 * did met the requirement but the active minute does not. The 'Active'
	 * results only happen if both calories burned and active minute meets the
	 * requirement.
	 */
	@Test
	public void testDetermineFitnessLevel1() {
		//set up the test
		FitnessTracker user4 = new FitnessTracker();
		user4.setCaloriesBurned(1000);
		user4.setActiveMinutes(2);
		
		//expected value or output
		final String expectedDetermineFitnessLevel = "Active";
		
		String actualDetermineFitnessLevel = user4.determineFitnessLevel();
		
		assertEquals(expectedDetermineFitnessLevel,actualDetermineFitnessLevel);
	}

}
