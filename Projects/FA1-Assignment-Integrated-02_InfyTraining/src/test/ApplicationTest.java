package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import application.Application;
import application.Booking;
import application.Report;
import application.Trainee;




public class ApplicationTest {
	@Rule
	public ExpectedException e=ExpectedException.none();

	@Test
	public void bookAssessmentInvalidBatchName()throws Exception{
		e.expect(Exception.class);
		e.expectMessage("Validator.INVALID_BATCH_NAME");
		Booking booking =new Booking();
		booking.setBatchName("JEE-rt1-cs");
		booking.setAssessmentType("Objective");			
		booking.setCourseName("FA1");			
		LocalDate assessmentDate1 = LocalDate.now();
		assessmentDate1 = assessmentDate1.plusDays(3);
		booking.setAssessmentDate(assessmentDate1);
		Trainee trainee=new Trainee();
		trainee.setEmailId("John_626262");
		trainee.setEmpNo(626262);
		List<Trainee> l1=new ArrayList<Trainee>();
		l1.add(trainee);
		booking.setTraineesList(l1);
		
		new Application().bookAssessment(booking);
	}
	@Test
	public void bookAssessmentInvalidEmailId()throws Exception{
		e.expect(Exception.class);
		e.expectMessage("Validator.INVALID_EMAIL_ID");
		Booking booking =new Booking();
		booking.setBatchName("JEE-RT2-CS");
		booking.setAssessmentType("Hands-On");			
		booking.setCourseName("FA1");			
		LocalDate assessmentDate1 = LocalDate.now();
		assessmentDate1 = assessmentDate1.plusDays(3);
		booking.setAssessmentDate(assessmentDate1);
		Trainee trainee=new Trainee();
		trainee.setEmailId("John_262626");
		trainee.setEmpNo(626262);
		List<Trainee> l1=new ArrayList<Trainee>();
		l1.add(trainee);
		booking.setTraineesList(l1);
		
		new Application().bookAssessment(booking);
		// Write the code to test
	}
	@Test
	public void getAssessmentReportNotFound() throws Exception{
		e.expect(Exception.class);
		e.expectMessage("Application.NO_RECORDS_FOUND");
		
		new Application().getAssessmentReport("IVS-RT1-CS");
	}
}
