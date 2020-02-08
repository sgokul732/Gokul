package application;

import java.util.ArrayList;
import java.util.List;

import resources.LogConfig;

public class Application {

	// can have status as 'P' only if all 3 marks are 50 and above
	public String addStudent(Student student) throws Exception {
		Validator validator = new Validator();
		try {
			validator.validate(student);

			char tempResult = 'P';
			if (student.getMark1() < 50 || student.getMark2() < 50 || student.getMark3() < 50) {
				tempResult = 'F';
				if (student.getResult() != tempResult) {
					throw new Exception("Application.INVALID_RESULT_FAIL");
				}
			} else {
				if (student.getResult() != tempResult) {
					throw new Exception("Application.INVALID_RESULT_PASS");
				}
			}

			DataProvider dataProvider = new DataProvider();
			return dataProvider.addStudent(student);
		} catch (Exception exception) {
			LogConfig.getLogger(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}
	}

	public String calculateGrade(StudentReport studentReport) throws Exception {
		try {
			String grade = null;
			if (studentReport.getResult() == 'F') {
				grade = "NA";
			} else {

				float average = (float) (studentReport.getTotalMarks() / studentReport.getNoOfSubjects());

				if (average >= 90f) {
					grade = "A+";
				} else if (average >= 80f && average < 90f) {
					grade = "A";
				} else if (average >= 70f && average < 80f) {
					grade = "B";
				} else {
					grade = "C";
				}
			}
			return grade;
		} catch (Exception exception) {
			LogConfig.getLogger(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}

	}

	public List<StudentReport> getGradesForStudentsInRange(String range) throws Exception {
		List<StudentReport> finalList = new ArrayList<StudentReport>();
		List<StudentReport> allStudents = new ArrayList<StudentReport>();
		DataProvider dataProvider = new DataProvider();
		int lowerLimit = 0;
		int upperLimit = 0;
		String grade = null;
		try {

			String[] limits = range.split("-");
			lowerLimit = Integer.parseInt(limits[0]);
			upperLimit = Integer.parseInt(limits[1]);

			allStudents = dataProvider.getAllStudents();
			for (StudentReport studentReport : allStudents) {

				if (studentReport.getTotalMarks() >= lowerLimit && studentReport.getTotalMarks() <= upperLimit) {
					grade = calculateGrade(studentReport);
					studentReport.setGrade(grade);
					finalList.add(studentReport);
				}
			}

			if (finalList.size() == 0) {
				throw new Exception("Application.NO_RECORDS");
			}
			return finalList;
		} catch (Exception exception) {
			LogConfig.getLogger(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}
	}
}
