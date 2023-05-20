package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;
//using the black bx testing applying the cause effect graph 
//having 4 cases with 2 effects
class IsValidOralPracticalExamTester {

	// case 1:mark is < 0  
	//effect : false
	@Test
	void testA1() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(-1,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	// case 2:0 <= mark <= 10
	//effect : true
	@Test
	void testA2() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(5,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testA3() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(0,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testA4() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(10,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	// case 3 :10 < mark <= 100  
	// effect : false
	@Test
	void testA5() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidOralPracticalMark(40,100);
	assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	// case 4 :100 < mark  
	// effect : false
	@Test
	void testA6() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
	boolean actual=verfication.isValidOralPracticalMark(108,100);
	assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	
	
	
}