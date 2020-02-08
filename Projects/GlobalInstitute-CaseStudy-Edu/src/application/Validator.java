package application;

public class Validator {

	public void validate(Student student) throws Exception {

		String errorStatus = null;

		if (!isValidStudentName(student.getStudentName())) {
			errorStatus = "Validator.INVALID_STUDENTNAME";
		} else if (!isValidStudentId(student.getStudentId())) {
			errorStatus = "Validator.INVALID_STUDENTID";
		} else if (!isValidDepartment(student.getDepartment())) {
			errorStatus = "Validator.INVALID_DEPARTMENT";
		} else if (!isValidExamMarks(student)) {
			errorStatus = "Validator.INVALID_EXAMMARKS";
		} else if (!isValidResult(student.getResult())) {
			errorStatus = "Validator.INVALID_RESULT";
		}

		if (errorStatus != null) {
			Exception exception = new Exception(errorStatus);
			throw exception;
		}
	}

	// The entered student name should contain only alphabets and spaces. 
	// Name cannot start with a space
	public Boolean isValidStudentName(String studentName) {
		Boolean isValid = true;
		if (studentName.length() != 0) {
			if (!(studentName.matches("[a-zA-Z ]*"))) {
				isValid = false;
			}
		
			if (studentName.charAt(0) == ' ') {
				isValid = false;
			}

		} else {
			isValid = false;
		}
		return isValid;
	}

	
	// The entered student ID can be any valid 4 digit number greater than or equal to 1001
	public Boolean isValidStudentId(Integer studentId) {
		Boolean isValid = true;
		if (!(studentId >= 1001 && studentId <= 9999)) {
			isValid = false;
		}
		return isValid;
	}

	// The entered Department name should be one among the given departments
	// (ECE, CSE, IT)
	public Boolean isValidDepartment(String department) {
		Boolean isValid = true;
		if (!(department.equals("ECE") || department.equals("CSE") || department.equals("IT"))) {
			isValid = false;
		}
		return isValid;
	}

	// Checking if marks set are not less than "0"
	public Boolean isValidExamMarks(Student student) {
		
		Boolean isValid = true;
		if (!(student.getMark1() >= 0 && student.getMark2() >= 0 && student.getMark3() >= 0
				&& student.getMark1() < 101 && student.getMark2() < 101 && student.getMark3() < 101 )) {
			
			isValid = false;
		}
		return isValid;
	}

	// Checking if result set is either 'P' or 'F' only
	public Boolean isValidResult(Character result) {
		Boolean isValid = true;
		if (!(result == 'P' || result == 'F')) {
			isValid = false;
		}
		return isValid;
	}

}
