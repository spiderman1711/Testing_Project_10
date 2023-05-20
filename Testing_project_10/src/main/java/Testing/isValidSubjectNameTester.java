package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

// The white box testing using the branch coverage technique
// we need to test that both if conditionals are true and false 
// and for the loop to be executed none and at least once  
class isValidSubjectNameTester {
    // these test cases will make the if conditionals true 
	// and the loop is not executed 
	@Test
	// first if true
	void testA1()
	{
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}

	@Test
	void testA2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName(null);
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	@Test
	void testA3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName(" Maths");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	
	@Test
	// the for loop has to be executed ,with the if = true 
	void testA4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Maths123");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	void testA5() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("123Maths");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	void testA6() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("M@ths");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	// the 2 ifs are false and the for loop is executed
	@Test
	void testB1() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Maths");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
	@Test
	void testB2() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("maths");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}

	@Test
	void testB3() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Introduction to Mathematics");
		assertEquals(expected,actual,"Verfication::Invalid Subject Name");
	}
	
}