package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

// applying the black box testing using the boundry value analysis
//between 0 and 10 
class isValidActivitiesMark {

	@Test
	//Max value
	void test1() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(10,100);
	}
	
	@Test
	// Min value
	void test2() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(0,100);
	}
	
	// Min value -1
	@Test
	void test3() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(-1,100);
	}
	
	@Test
	// Max Value + 1
	void test4() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(11,100);
	}
	
	
	@Test
	// Normal Value
	void test5() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(6.5,100);
	}
	
	@Test
	//Max value -1
	void test6() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(9,100);
	}
	
	
	@Test
	//Min value +1
	void test7() {
    boolean expected=true;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(1,100);
 }

	@Test
	void TestThefullMark() {
    boolean expected=false;
    Verfication verfication = new Verfication(); 
    boolean actual=verfication.isValidActivitiesMark(100,100);
	}
}
