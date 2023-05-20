package Testing;

import static org.junit.jupiter.api.Assertions.*;
//applying the black box testing using the BVA
// between 0 and 60

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isvalidFinalexamMarkTester {

	@Test
	//Max value
	void test1() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(60,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	// Min value -1
	void test2() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(-1,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	// Min value +1
	void test6() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(1,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	//normal value
	void test3() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(30,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	

	@Test
	//Min value
	void test4() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(0,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	//Max value + 1
	void test5() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(61,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	//Max value - 1
	void test7() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(59,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testInputNegDoubleInputs() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(-70.6,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testFulMarkequalsInput() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(100,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}
	
	@Test
	void testInputDoubleInputs() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidFinalExamMark(50.6,100);
    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}

}