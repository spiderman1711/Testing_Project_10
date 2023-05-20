package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

//The white box testing using the branch coverage technique
//we need to test that both if conditionals are true and false 
//and for the loop to be executed none and at least once  
class isValudStudentNameTester {
	// these test cases will make the if conditionals true 
		// and the loop is not executed 
		@Test
		// first if true
		void testA1()
		{
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}

		@Test
		void testA2() {
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName(null);
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		@Test
		void testA3() {
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName(" Tom");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		
		@Test
		// the for loop has to be executed ,with the if = true 
		void testA4() {
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("TOM123");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		void testA5() {
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("123Tom");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		void testA6() {
			boolean expected = false;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("@Tom");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		// the 2 ifs are false and the for loop is executed
		@Test
		void testB1() {
			boolean expected = true;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("Tom");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
		@Test
		void testB2() {
			boolean expected = true;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("tom");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}

		@Test
		void testB3() {
			boolean expected = true;
			Verfication verfication = new Verfication();
			boolean actual = verfication.isValidStudentName("Tom Holland");
		    assertEquals(expected,actual,"Verfication::Invalid Student Name");
		}
		
}