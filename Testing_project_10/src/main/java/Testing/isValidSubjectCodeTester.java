package Testing;

import com.mycompany.testing_project_10.Verfication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class isValidSubjectCodeTester {
	@Test
	void testA1() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode(null);
	    assertEquals(expected,actual);
	}

	@Test
	void testA3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("A2345");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CS345678");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA5() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE5678");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA6() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("Cse457g");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA7() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("Cse457s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA8() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("CSE123s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA9() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("cse765s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA10() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("cSe128s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA11() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("cse%28s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA12() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("c@e128s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA13() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("cse%28s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA14() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123cses");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA15() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123Cses");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA16() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123CSEs");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA17() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123cseg");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA18() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("12cse3s");
	    assertEquals(expected,actual);
	}
	
	@Test
	void testA19() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidSubjectCode("123cses");
	    assertEquals(expected,actual);
	}

}
