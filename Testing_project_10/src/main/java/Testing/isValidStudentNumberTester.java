package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValidStudentNumberTester {

	@Test
	void testEmptyString() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testNullstring() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber(null);
	    assertEquals(expected,actual);
	}

	@Test
	void testEnteringLessThan7char() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("AB35456");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testEnteringMoreThan7char() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("CS3456748");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testEnteringLetterAtfirst() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("C2345678");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testExactly7digitsAndLetter() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567E");
	    assertEquals(expected,actual);
	}


	@Test
	void testSymbolOnLastLetter() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567/");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testEnteringLetterInTheMiddle() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234T567");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testExactly7digitsAndSmallLetter () {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1234567e");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testEnteringASpecialChar() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentNumber("1298765#");
	    assertEquals(expected,actual);
	}
}
