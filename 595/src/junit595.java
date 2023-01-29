import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class junit595 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public static void square(){
	    int x, y, sum;
	    @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); // Read user input

	    System.out.println("Type another number:");
	    y = myObj.nextInt(); // Read user input

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); // Print the sum
	  }

}
