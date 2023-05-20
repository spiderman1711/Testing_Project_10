package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import com.mycompany.testing_project_10.Csv_Writer;
import models.Student;
import models.Subject;


class isValidCsvWritter {

	@Test
	void testcase1() throws IOException {
		/*	case 2 students
		 * input:Subject("Math", "CSE551", 100)
		 * 		 Student("Emma", "1901016s", 10, 10, 20, 60)
		 * 		 Student("osf", "1901568s", 10, 10, 20, 60)
		 * 
		 * Expected Output: Math,100.0
		 *					Emma,1901016s,4.0,A+
		 *					osf,1901568s,4.0,A+
		 */
		System.out.println("\tTestCase1");
		//paths
		String path_true  = System.getProperty("user.dir") + "\\samples\\CsvWritter_testcases_samples\\CsvWritter_True_testcase1.csv";
		String path_out   = "\\samples\\CsvWritter_testcases_samples\\CsvWritter_Output_testcase1.csv";

		//data initialization
        Subject subject = new Subject("Math", "CSE551", 100);
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Emma", "1901016s", 10, 10, 20, 60);
        Student student2 = new Student("osf", "1901568s", 10, 10, 20, 60);
        studentList.add(student1);
        studentList.add(student2);
        
        // write data into csv
        new Csv_Writer().writeCsv(path_out, subject, studentList);
        
        //compare true samples and output samples
        String true_line, out_line;
        Scanner s_true = new Scanner(new File(path_true));
        Scanner s_out = new Scanner(new File(System.getProperty("user.dir") + path_out));
        
        while(s_true.hasNext()) {
        	true_line = s_true.nextLine();
        	out_line = s_out.nextLine();
        	assertArrayEquals(true_line.split(","), out_line.split(","));
        }
	}
	
	@Test
	void testcase2() throws IOException {
		/*	case zero students
		 * input:Subject("Math", "CSE551", 100)
		 * 
		 * Expected Output: Math,100.0
		 */
		System.out.println("\tTestCase2");
		//paths
		String path_true  = System.getProperty("user.dir") + "\\samples\\CsvWritter_testcases_samples\\CsvWritter_True_testcase2.csv";
		String path_out   = "\\samples\\CsvWritter_testcases_samples\\CsvWritter_Output_testcase2.csv";

		//data initialization
        Subject subject = new Subject("Math", "CSE551", 100);
        ArrayList<Student> studentList = new ArrayList<Student>();

        // write data into csv
        new Csv_Writer().writeCsv(path_out, subject, studentList);
        
        //compare true samples and output samples
        String true_line, out_line;
        Scanner s_true = new Scanner(new File(path_true));
        Scanner s_out = new Scanner(new File(System.getProperty("user.dir") + path_out));
        
        while(s_true.hasNext()) {
        	true_line = s_true.nextLine();
        	out_line = s_out.nextLine();
        	assertArrayEquals(true_line.split(","), out_line.split(","));
        }
	}
	
	@Test
	void testcase3() throws IOException {
		/*	case 1 student
		 * input:Subject("Testing", "CSE112s", 100)
		 * 
		 * Expected Output: Math,100.0
		 */
		System.out.println("\tTestCase3");
		//paths
		String path_true  = System.getProperty("user.dir") + "\\samples\\CsvWritter_testcases_samples\\CsvWritter_True_testcase3.csv";
		String path_out   = "\\samples\\CsvWritter_testcases_samples\\CsvWritter_Output_testcase3.csv";

		//data initialization
        Subject subject = new Subject("Testing", "CSE112s", 100);
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Hossam", "1801468s", 8, 7, 18, 40);
        studentList.add(student1);
        
        // write data into csv
        new Csv_Writer().writeCsv(path_out, subject, studentList);
        
        //compare true samples and output samples
        String true_line, out_line;
        Scanner s_true = new Scanner(new File(path_true));
        Scanner s_out = new Scanner(new File(System.getProperty("user.dir") + path_out));
        
        while(s_true.hasNext()) {
        	true_line = s_true.nextLine();
        	out_line = s_out.nextLine();
        	assertArrayEquals(true_line.split(","), out_line.split(","));
        }
	}
}
