package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValidOralExamMarkTester {


	@Test
	void testValidInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(10,100);
	}
	
	@Test
	void testNegValue() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(-10,100);
	}
	
	@Test
	void testOutRangeInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(30,100);
	}
	
	@Test
	void testFulMarkequalsInput() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(100,100);
	}
	

	@Test
	void testZeroInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(0,100);
	}
	
	@Test
	void testInputMoreThanFullMark() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(1000,100);
	}
	
	@Test
	void testInputDoubleInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(6.5,100);
	}
	
	@Test
	void testInputNegDoubleInputs() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(-6.5,100);
	}

}
