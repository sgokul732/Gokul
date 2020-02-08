package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import application.Application;
import application.Student;

public class ApplicationTest {
	@Rule
	public ExpectedException exception= ExpectedException.none();
	@Test
	public void addStudentInvalidDepartment() throws Exception {
		
		exception.expectMessage("Validator.INVALID_DEPARTMENT");
		Student student=new Student();
		student.setStudentName("Jacob");
		student.setStudentId(1004);
		student.setMark1(50);
		student.setMark2(60);
		student.setMark3(65);
		student.setResult('P');
		student.setDepartment("cse");
		new Application().addStudent(student);
		
		
		
		// Write the code to test
	}
	@Test
	public void addStudentInvalidMarks() throws Exception {
		exception.expectMessage("Validator.INVALID_EXAMMARKS");
		Student student=new Student();
		student.setStudentName("Jacob");
		student.setStudentId(1004);
		student.setMark1(-50);
		student.setMark2(110);
		student.setMark3(65);
		student.setResult('P');
		student.setDepartment("CSE");
		new Application().addStudent(student);
		// Write the code to test
	}
	@Test
	public void addStudentInvalidStudentId() throws Exception {
		exception.expectMessage("Validator.INVALID_STUDENTID");
		Student student=new Student();
		student.setStudentName("Jacob");
		student.setStudentId(10040);
		student.setMark1(50);
		student.setMark2(60);
		student.setMark3(65);
		student.setResult('P');
		student.setDepartment("CSE");
		new Application().addStudent(student);
		
		// Write the code to test
	}
}
