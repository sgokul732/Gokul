package application;


public class Student {

	private Integer studentId;
	private String studentName;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	private Character result;
	private String department;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getMark1() {
		return mark1;
	}

	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}

	public Integer getMark2() {
		return mark2;
	}

	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}

	public Integer getMark3() {
		return mark3;
	}

	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}

	public Character getResult() {
		return result;
	}

	public void setResult(Character result) {
		this.result = result;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
