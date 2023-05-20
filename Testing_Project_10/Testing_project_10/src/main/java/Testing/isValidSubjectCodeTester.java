package Testing;

import com.mycompany.testing_project_10.Verfication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// using the white box testig we apply the statement coverage test

class isValidSubjectCodeTester {
	
	// first if = false , enters the loop , second if = false , third if = false
	@Test
	void testA1() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE123s");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	void testA2() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE123");
		 assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	//Test cases for the first "if" statement is true
	@Test
	void testB1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("null");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	
	@Test
	void testB2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	@Test
	void testB3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("ABC1234");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	

	@Test
	void testB4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE56");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	
	@Test
	//Test cases for the second "if" statement is true
	void testC1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CS1234");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");	}
	
	@Test
	void testC2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("C12345");
    	assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	@Test
	void testC3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123456");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	
	
	//Test case for the third "if" statement is true
	@Test
	void testD1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSECSE");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	
	@Test
	void testD2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE12E");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	
	@Test
	void testD3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE2SE");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	
	@Test
	void testD4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSEC2E");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");
	}
	
	//Test case for the forth "if" statement is true
		@Test
	void testE1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE123#");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	void testE2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE123g");
	    assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}
	
	void testE3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE1231");
		assertEquals(expected,actual,"Verfication::Invalid Subject Code");
		}		
	

}