package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValidSubjectNameTester {

	@Test
	void test1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("");
	    assertEquals(expected,actual);
	}

	@Test
	void test2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName(null);
	    assertEquals(expected,actual);
	}
 
	@Test
	void test3() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Maths");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test4() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("maths");
	    assertEquals(expected,actual);
	}

	@Test
	void test5() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Introduction to Mathematics");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test6() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("Maths123");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test7() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("1234");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test8() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectName("%%##@!*");
	    assertEquals(expected,actual);
	}

}
