package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;
// using the black box testing aplling the state transition testing
// we have 2 states 
// first state valid mark , action (output)= true
// second state inalid marks , action (output)= false

class isValidMidtermExamTester {
// testing the invalid marks that results in false 
	@Test
	void testNegValue() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(-16.5,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testOutRangeInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(30,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testFulMarkequalsInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(100,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testInputMoreThanFullMark() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(1000,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	
//	testing the valid marks that results in true 
	@Test
	void testInputDoubleInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(16.5,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testValidInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(20,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testZeroInput() {
	 boolean expected=true;
	 Verfication verfication = new Verfication(); 
	 boolean actual=verfication.isValidMidtermExamsMark(0,100);
	 assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
}	
	
	
