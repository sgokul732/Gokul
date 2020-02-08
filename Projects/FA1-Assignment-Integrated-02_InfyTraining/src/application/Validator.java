package application;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;



public class Validator {
	public void validate(Booking booking) throws Exception {
//		try{
		if(!isValidBatchName(booking.getBatchName()))
			throw new Exception("Validator.INVALID_BATCH_NAME");
		if(!isValidCourseName(booking.getCourseName()))
			throw new Exception("Validator.INVALID_COURSE_NAME");
		if(!isValidAssessmentDate(booking.getAssessmentDate()))
			throw new Exception("Validator.INVALID_ASSESSMENT_DATE");
		if(!isValidAssessmentType(booking.getAssessmentType()))
			throw new Exception("Validator.INVALID_ASSESSMENT_TYPE");
		if(!isValidEmailId(booking.getTraineesList()))
			throw new Exception("Validator.INVALID_EMAIL_ID");
		
//		}
//		catch(Exception e)
//		{
//			LogConfig.getLogger(AppConfig.class).error(e.getMessage(), e);
//			throw e;
//		}
		
		// Use isValidBatchName, isValidCourseName, isValidAssessmentDate, isValidAssessmentType, isValidEmailId to validate the booking details
		// For invalid inputs throw exceptions with the corresponding messages
	}
	
	public Boolean isValidBatchName(String batchName) {
	       String regex="(JEE|MS|IVS)-(RT1|RT2)-(CS|NCS)";
           if(batchName.matches(regex))
                 return true;
           return false;
}


		
	

	public Boolean isValidCourseName(String courseName) {
		String regex="FA[1-9]";
		if(courseName.matches(regex))
			return true;
		return false;
		
	}
	
	public Boolean isValidAssessmentDate(LocalDate assessmentDate) {
		LocalDate today = LocalDate.now();
		LocalDate end = today;
		
		for(int i=1;i<=7;i++) {
			end = end.plusDays(1);
			if(end.get(ChronoField.DAY_OF_WEEK) == 6 || end.get(ChronoField.DAY_OF_WEEK) == 7)
				end = end.plusDays(1);
			if(end.get(ChronoField.DAY_OF_WEEK) == 7)
				end = end.plusDays(1);
		}
		
		if(assessmentDate.isAfter(today) && (assessmentDate.isBefore(end) || assessmentDate.isEqual(end)))
			return true;
		else
			return false;
		
		//		LocalDate today = LocalDate.now();
//        LocalDate today1=today.plusDays(7);
//        if((assessmentDate.isAfter(today)) && (assessmentDate.isBefore(today1)))
//            if((today.get(ChronoField.DAY_OF_WEEK)!=6) && (today.get(ChronoField.DAY_OF_WEEK)!=7))
//            return true;
//     return false;
//
//        

	}

	
	public Boolean isValidAssessmentType(String assessmentType) {
        if(assessmentType.equals("Objective") || assessmentType.equals("Hands-On"))
            return true;
     return false;
}

		
	

//	public Boolean isValidEmailId(List<Trainee>traineesList) {
//		for(Trainee trainee:traineesList){
//			
//		String l[]=trainee.getEmailId().split("_");
//		
////		String regex4="[A-Za-z]+";
////		String empno=trainee.getEmpNo().toString();
////		String emailId=trainee.getEmailId();
//		if(!(l[0].matches("[A-Za-z]+")&& Integer.parseInt(l[1])==trainee.getEmpNo()))
//			return false;}
//		return true;
//		
//		
//		
//	}
////}
	
	public Boolean isValidEmailId(List<Trainee> traineeList) {
		for(Trainee trainee: traineeList) {
			if(!trainee.getEmailId().matches("[A-Za-z]+_"+trainee.getEmpNo()))
				return false;
		}
		return true;
	}

}
