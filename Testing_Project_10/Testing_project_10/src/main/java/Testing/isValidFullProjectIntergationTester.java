package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import com.mycompany.testing_project_10.Testing_project_10;

class isValidFullProjectIntergationTester {

	@Test
	void testAllValidAttributes() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample.csv", "outputs\\testAllValidAttributes.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testAllValidAttributes.csv").exists(), true);
	}

	@Test
	void testInvalidName() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample2.csv", "outputs\\testInvalidName.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidName.csv").exists(), true);
	}
	
	@Test
	void testInvalidNumber() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample3.csv", "outputs\\testInvalidNumber.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidNumber.csv").exists(), true);
	}
	
	@Test
	void testInvalidOral() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample4.csv", "outputs\\testInvalidOral.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidOral.csv").exists(), true);
	}
	
	@Test
	void testInvalidMidterm() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample5.csv", "outputs\\testInvalidMidterm.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidMidterm.csv").exists(), true);
	}
	
	@Test
	void testInvalidPractical() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample6.csv", "outputs\\testInvalidPractical.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidPractical.csv").exists(), true);
	}
	
	@Test
	void testInvalidFinal() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample7.csv", "outputs\\testInvalidFinal.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testInvalidFinal.csv").exists(), true);
	}
	
	@Test
	void testNullName() throws FileNotFoundException {
		Testing_project_10.runProject("samples\\Testing_Sample8.csv", "outputs\\testNullName.csv");
		assertEquals(new File(System.getProperty("user.dir") + "\\" + "outputs\\testNullName.csv").exists(), true);
	}
}