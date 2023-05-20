package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import models.Subject;
import com.mycompany.testing_project_10.Csv_Reader;

class isValidCsvSubjectTester {

    @Test
    void testValidName() throws FileNotFoundException {
        Subject subject = new Subject("Testing", "CSE113", 100);
        Csv_Reader cr = new Csv_Reader();

        Subject outPutSubject = cr.getSubject("samples\\Testing_Sample.csv");

        assertNotEquals(outPutSubject,null);
        assertEquals(outPutSubject.getSubjectName(), subject.getSubjectName());
        assertEquals(outPutSubject.getFullMark(), subject.getFullMark());
        assertEquals(outPutSubject.getSubjectCode(), subject.getSubjectCode());

    }

    @Test
    void testValidNameWithS() throws FileNotFoundException {
        Subject subject = new Subject("Testing", "CSE113", 100);
        Csv_Reader cr = new Csv_Reader();

        Subject outPutSubject = cr.getSubject("samples\\Testing_Sample2.csv");

        assertNotEquals(outPutSubject,null);
        assertEquals(outPutSubject.getSubjectName(), subject.getSubjectName());
        assertEquals(outPutSubject.getFullMark(), subject.getFullMark());
        assertEquals(outPutSubject.getSubjectCode(), subject.getSubjectCode());

    }

}
