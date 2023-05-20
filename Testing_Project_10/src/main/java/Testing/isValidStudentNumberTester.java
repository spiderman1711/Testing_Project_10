package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

// using the white box testing applying the condition coverage  
class isValidStudentNumberTester {
	//Condition 1: number is null or number length is not 8 
	//or the first character of number is not a digit
	@Test
	void testEmptyString() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("");
	    assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testNullstring() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber(null);
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}

	@Test
	void testEnteringLessThan8char() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("3545886");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testEnteringTheFirstDigitALetter() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("CS345678");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testEnteringTheFirstDigitASpecialchar() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("#%345678");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	

	@Test
	void testEnteringMoreThan8char() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("345688878");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	
    //Condition 2: Each character of number must be a digit 
	// except for the last one
	

	@Test
	void testAllcharctersAreDigitsAndLastisLetter() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567s");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testEnteringASpecialCharInTheMiddle() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("129%8765");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testEnteringLetterInTheMiddle() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234T567");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	//Condition 3: The last character of number is not a letter 
	//or number length is not 8
	
	@Test
	void testExactly7digitsAndLetter() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567e");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testSpecialCharInTheEnd() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567#");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void testDigitCharInTheEnd() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("12345678");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
	@Test
	void test6DigitsAndAletter() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("123456s");
		assertEquals(expected,actual,"Verfication::Invalid Student Number");
	}
	
}