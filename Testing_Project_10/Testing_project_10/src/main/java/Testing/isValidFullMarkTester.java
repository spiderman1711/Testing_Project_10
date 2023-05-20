package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Verfication;

// using the black box testing by using the eqivalence class partitioning 
// divide the the partions into 4 partitions 
//partition mark = 100 
//partition mark > 100
//partition mark : 0 < mark <100
//partition mark < 0


class isValidFullMarkTester {

	@Test
	// case from the first partition 
	void test1() {
		boolean expected = true;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(100);
	    assertEquals(expected,actual,"Verfication::Inavalid Mark");
	}

	@Test
	//case from the second partition
	void test2() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(121.5);
	    assertEquals(expected,actual,"Verfication::Inavalid Mark");

	}
	
	@Test
	// case from third partition 
	void test3() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(98.5);
	    assertEquals(expected,actual,"Verfication::Inavalid Mark");

	}
	
	
	@Test
	// case from forth partition 
	void test4() {
		boolean expected = false;
		Verfication verfication = new Verfication();
		boolean actual = verfication.isValidFullMark(-50);
	    assertEquals(expected,actual,"Verfication::Inavalid Mark");

	}

}