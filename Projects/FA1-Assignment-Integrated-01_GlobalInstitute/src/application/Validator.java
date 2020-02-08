package application;

public class Validator {

	public void validate(Student student) throws Exception {
		if(!isValidStudentName(student.getStudentName()))
			throw new Exception("Validator.INVALID_STUDENTNAME");
		if(!isValidStudentId(student.getStudentId()))
			throw new Exception("Validator.INVALID_STUDENTID");
		if(!isValidDepartment(student.getDepartment()))
			throw new Exception("Validator.INVALID_DEPARTMENT");
		if(!isValidExamMarks(student))
			throw new Exception("Validator.INVALID_EXAMMARKS");
		if(!isValidResult(student.getResult()))
			throw new Exception("Validator.INVALID_RESULT");
		// Use isValidStudentName, isValidStudentId, isValidDepartment, isValidExamMarks, isValidResult to validate the student details
		// For invalid inputs throw exceptions with the corresponding messages
	}

	// The entered student name should contain only alphabets and spaces. 
	// Name cannot start with a space
	public Boolean isValidStudentName(String studentName) {
		String regex="[A-Za-z][A-Za-z ]*";
		if(studentName.matches(regex))
		return true;
		else return false;
	}

	
	// The entered student ID can be any valid 4 digit number greater than or equal to 1001
	public Boolean isValidStudentId(Integer studentId) {
		if(studentId>=1001 && studentId<=9999)
		return true;
		else return false;
	}

	// The entered Department name should be one among the given departments
	// (ECE, CSE, IT)
	public Boolean isValidDepartment(String department) {
		if(department.equals("ECE")|| department.equals("CSE")|| department.equals("IT"))
			
		return true;
		else return false;
	}

	// Checking if marks set are not less than "0"
	public Boolean isValidExamMarks(Student student) {
		if((student.getMark1()>=0 && student.getMark1()<=100) && (student.getMark2()>=0 && student.getMark2()<=100) && (student.getMark3()>=0 && student.getMark3()<=100))
			
		return true;
		else return false;
	}

	// Checking if result set is either 'P' or 'F' only
	public Boolean isValidResult(Character result) {
		if(result.equals('P') || result.equals('F'))
			
		return true;
		else return false;
	}
}
