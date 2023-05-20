package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.mycompany.testing_project_10.*;

import models.Student;

import org.junit.jupiter.api.Test;

class isValidCSVStudentReaderDataflow {

	@Test
	void test1() throws FileNotFoundException {
		
		Csv_Reader c = new Csv_Reader();
		
		
		ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample.csv");
		
		
		Student s1 = new Student("Emmanuel", "1900672s", 10, 20, 10, 60);
		Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
		ArrayList<Student> st2 = new ArrayList<Student>();
		st2.add(s1);
		st2.add(s2);
		
		
		for(int i=0;i<st2.size();i++) {
			
			assertEquals(st1.get(i).getName(),st2.get(i).getName());
			assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
			assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
			assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
			assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
			
			
			
		}
	}
		
		
		void test2() throws FileNotFoundException {
			
			Csv_Reader c = new Csv_Reader();
			
			
			ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample2.csv");
			
			
			
			Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
			ArrayList<Student> st2 = new ArrayList<Student>();
			
			st2.add(s2);
			
			assertEquals(st1.size(),st2.size());
			for(int i=0;i<st2.size();i++) {
				
				assertEquals(st1.get(i).getName(),st2.get(i).getName());
				assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
				assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
				assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
				assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
				
			}}
			
			void test3() throws FileNotFoundException {
				
				Csv_Reader c = new Csv_Reader();
				
				
				ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample3.csv");
				
				
				
				Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
				ArrayList<Student> st2 = new ArrayList<Student>();
				
				st2.add(s2);
				
				assertEquals(st1.size(),st2.size());
				for(int i=0;i<st2.size();i++) {
					
					assertEquals(st1.get(i).getName(),st2.get(i).getName());
					assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
					assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
					assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
					assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
					
				}
	}
			
			void test4() throws FileNotFoundException {
				
				Csv_Reader c = new Csv_Reader();
				
				
				ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample4.csv");
				
				
				
				Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
				ArrayList<Student> st2 = new ArrayList<Student>();
				
				st2.add(s2);
				
				assertEquals(st1.size(),st2.size());
				for(int i=0;i<st2.size();i++) {
					
					assertEquals(st1.get(i).getName(),st2.get(i).getName());
					assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
					assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
					assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
					assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
					
				}}
			
	void test5() throws FileNotFoundException {
				
				Csv_Reader c = new Csv_Reader();
				
				
				ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample5.csv");
				
				
				
				Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
				ArrayList<Student> st2 = new ArrayList<Student>();
				
				st2.add(s2);
				
				assertEquals(st1.size(),st2.size());
				for(int i=0;i<st2.size();i++) {
					
					assertEquals(st1.get(i).getName(),st2.get(i).getName());
					assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
					assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
					assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
					assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
					
				}}
	void test6() throws FileNotFoundException {
		
		Csv_Reader c = new Csv_Reader();
		
		
		ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample6.csv");
		
		
		
		Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
		ArrayList<Student> st2 = new ArrayList<Student>();
		
		st2.add(s2);
		
		assertEquals(st1.size(),st2.size());
		for(int i=0;i<st2.size();i++) {
			
			assertEquals(st1.get(i).getName(),st2.get(i).getName());
			assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
			assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
			assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
			assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
			
		}}
	void test7() throws FileNotFoundException {
		
		Csv_Reader c = new Csv_Reader();
		
		
		ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample7.csv");
		
		
		
		Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
		ArrayList<Student> st2 = new ArrayList<Student>();
		
		st2.add(s2);
		
		assertEquals(st1.size(),st2.size());
		for(int i=0;i<st2.size();i++) {
			
			assertEquals(st1.get(i).getName(),st2.get(i).getName());
			assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
			assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
			assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
			assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
			
		}}
	void test8() throws FileNotFoundException {
		
		Csv_Reader c = new Csv_Reader();
		
		
		ArrayList<Student> st1= c.csv_parsing("samples/Testing_Sample8.csv");
		
		
		
		Student s2 = new Student("youssef", "1900666s", 10, 20, 10, 60);
		ArrayList<Student> st2 = new ArrayList<Student>();
		
		st2.add(s2);
		
		assertEquals(st1.size(),st2.size());
		for(int i=0;i<st2.size();i++) {
			
			assertEquals(st1.get(i).getName(),st2.get(i).getName());
			assertEquals(st1.get(i).getNumber(),st2.get(i).getNumber());
			assertEquals(st1.get(i).getOralOrPracticalMark(),st2.get(i).getOralOrPracticalMark());
			assertEquals(st1.get(i).getMidTermMark(),st2.get(i).getMidTermMark());
			assertEquals(st1.get(i).getFinalMark(),st2.get(i).getFinalMark());
			
		}}

}
