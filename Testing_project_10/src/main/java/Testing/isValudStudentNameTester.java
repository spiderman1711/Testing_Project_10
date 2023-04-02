package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValudStudentNameTester {

	@Test
	void test1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("");
	    assertEquals(expected,actual);
	}

	@Test
	void test2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName(null);
	    assertEquals(expected,actual);
	}
 
	@Test
	void test3() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("TOM");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test4() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("tom");
	    assertEquals(expected,actual);
	}

	@Test
	void test5() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("Tom Holland");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test6() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("Tom123");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test7() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("1234");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test8() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("%%##@!*");
	    assertEquals(expected,actual);
	}

}
