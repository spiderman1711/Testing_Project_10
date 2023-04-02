package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

class isValidTester {

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
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("AB35456");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("CS3456748");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test5() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("C2345678");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test6() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("1234567E");
	    assertEquals(expected,actual);
	}
	/*
	@Test
	void test7() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("Cse457s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test8() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("CSE123s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test9() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("cse765s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test10() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("cSe128s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test11() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("cse%28s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test12() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("c@e128s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test13() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("cse%28s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test14() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("123cses");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test15() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("123Cses");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test16() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("123CSEs");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test17() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("123cseg");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test18() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("12cse3s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void test19() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidStudentName("123cses");
	    assertEquals(expected,actual);
	}
	
	
}
*/
}
