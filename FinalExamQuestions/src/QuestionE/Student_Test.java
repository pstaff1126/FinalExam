package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Leasean", "A", "McCoy", dBirthDate, "001 Labrador Lane", "302-893-6881", "bgibbons1@udel.edu","MIS");
		Student stu3 = new Student("Sam", "B", "Bradford", dBirthDate, "002 Labrador Lane", "302-893-6882", "bgibbons2@udel.edu","MIS");
		Student stu4 = new Student("Jordan", "C", "Matthews", dBirthDate, "003 Labrador Lane", "302-893-6883", "bgibbons3@udel.edu","MIS");
		Student stu5 = new Student("Demarco", "Isbad", "Murray", dBirthDate, "004 Labrador Lane", "302-893-6884", "bgibbons4@udel.edu","MIS");
		HashMap A=new HashMap();
		A.put(stu1.getPersonID(),0);
		A.put(stu2.getPersonID(),1);
		A.put(stu3.getPersonID(),2);
		A.put(stu4.getPersonID(),3);
		A.put(stu5.getPersonID(),4);

		assertTrue(A.size()==5);
	}

}
