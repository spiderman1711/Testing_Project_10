package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Student;
/*
 * Tested Using Basic path Coverage
 */
class isValidGradeCalculator {

	@Test
	void testAbove97() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,60);
		
		assertEquals(student.getGrade(), "A+");
	}
	
	@Test
	void testAbove93() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,53);
		
		assertEquals(student.getGrade(), "A");
	}

	@Test
	void testAbove89() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,50);
		
		assertEquals(student.getGrade(), "A-");
	}
	
	@Test
	void testAbove84() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,44);
		
		assertEquals(student.getGrade(), "B+");
	}

	@Test
	void testAbove80() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,40);
		
		assertEquals(student.getGrade(), "B");
	}
	
	@Test
	void testAbove76() {
		Student student = new Student("Emmanuel","1900672s",10,20,6,40);
		
		assertEquals(student.getGrade(), "B-");
	}
	
	@Test
	void testAbove73() {
		Student student = new Student("Emmanuel","1900672s",10,20,3,40);
		
		assertEquals(student.getGrade(), "C+");
	}
	
	@Test
	void testAbove70() {
		Student student = new Student("Emmanuel","1900672s",10,20,0,40);
		
		assertEquals(student.getGrade(), "C");
	}
	
	@Test
	void testAbove67() {
		Student student = new Student("Emmanuel","1900672s",10,17,0,40);
		
		assertEquals(student.getGrade(), "C-");
	}
	
	@Test
	void testAbove64() {
		Student student = new Student("Emmanuel","1900672s",10,14,0,40);
		
		assertEquals(student.getGrade(), "D+");
	}
	
	@Test
	void testAbove60() {
		Student student = new Student("Emmanuel","1900672s",10,11,0,40);
		
		assertEquals(student.getGrade(), "D");
	}
	
	@Test
	void testBelow60() {
		Student student = new Student("Emmanuel","1900672s",10,0,0,40);
		
		assertEquals(student.getGrade(), "F");
	}

}
