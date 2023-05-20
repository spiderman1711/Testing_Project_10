package Testing;

import static org.junit.jupiter.api.Assertions.*;
import models.Student;
import org.junit.jupiter.api.Test;
/*
 * Tested Using Branch Coverage
 */
class isValidGpaCalculator {

	@Test
	void testAbove97() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,60);
		
		assertEquals(student.getGpa(), 4);
	}
	
	@Test
	void testAbove93() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,53);
		
		assertEquals(student.getGpa(), 4);
	}

	@Test
	void testAbove89() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,50);
		
		assertEquals(student.getGpa(), 3.7);
	}
	
	@Test
	void testAbove84() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,44);
		
		assertEquals(student.getGpa(), 3.3);
	}

	@Test
	void testAbove80() {
		Student student = new Student("Emmanuel","1900672s",10,20,10,40);
		
		assertEquals(student.getGpa(), 3);
	}
	
	@Test
	void testAbove76() {
		Student student = new Student("Emmanuel","1900672s",10,20,6,40);
		
		assertEquals(student.getGpa(), 2.7);
	}
	
	@Test
	void testAbove73() {
		Student student = new Student("Emmanuel","1900672s",10,20,3,40);
		
		assertEquals(student.getGpa(), 2.3);
	}
	
	@Test
	void testAbove70() {
		Student student = new Student("Emmanuel","1900672s",10,20,0,40);
		
		assertEquals(student.getGpa(), 2);
	}
	
	@Test
	void testAbove67() {
		Student student = new Student("Emmanuel","1900672s",10,17,0,40);
		
		assertEquals(student.getGpa(), 1.7);
	}
	
	@Test
	void testAbove64() {
		Student student = new Student("Emmanuel","1900672s",10,14,0,40);
		
		assertEquals(student.getGpa(), 1.3);
	}
	
	@Test
	void testAbove60() {
		Student student = new Student("Emmanuel","1900672s",10,11,0,40);
		
		assertEquals(student.getGpa(), 1);
	}
	
	@Test
	void testBelow60() {
		Student student = new Student("Emmanuel","1900672s",10,0,0,40);
		
		assertEquals(student.getGpa(), 0);
	}
}
