package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class IsValidMidtermExam {

	@Test
	void testValidInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(20,100);
	}
	
	@Test
	void testNegValue() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(-20,100);
	}
	
	@Test
	void testOutRangeInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(30,100);
	}
	
	@Test
	void testFulMarkequalsInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(100,100);
	}
	

	@Test
	void testZeroInput() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(0,100);
	}
	
	@Test
	void testInputMoreThanFullMark() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(1000,100);
	}
	
	@Test
	void testInputDoubleInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(16.5,100);
	}
	
	@Test
	void testInputNegDoubleInputs() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidMidtermExamsMark(-16.5,100);
	}

}
