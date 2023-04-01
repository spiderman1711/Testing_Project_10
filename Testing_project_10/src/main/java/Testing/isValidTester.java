package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValidTester {

	@Test
	void test1() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(100);
	    assertEquals(expected,actual);
	}

	@Test
	void test2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(10);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(99.5);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(1000);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test5() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(0);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test6() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(95);
	    assertEquals(expected,actual);
	}
	@Test
	void test7() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(101);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test8() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(99);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test9() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(50);
	    assertEquals(expected,actual);
	}
	
	@Test
	void test10() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(12345678);
	    assertEquals(expected,actual);
	}
}
