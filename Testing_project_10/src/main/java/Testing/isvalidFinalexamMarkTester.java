package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isvalidFinalexamMarkTester {

	@Test
	void testValidInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(60,100);
	}
	
	@Test
	void testNegValue() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(-60,100);
	}
	
	@Test
	void testOutRangeInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(30,100);
	}
	
	@Test
	void testFulMarkequalsInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(100,100);
	}
	

	@Test
	void testZeroInput() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(0,100);
	}
	
	@Test
	void testInputMoreThanFullMark() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(1000,100);
	}
	
	@Test
	void testInputDoubleInputs() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(50.6,100);
	}
	
	@Test
	void testInputNegDoubleInputs() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(-70.6,100);
	}

}
