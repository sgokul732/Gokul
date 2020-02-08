package exercises;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentSemester;
	public Student(Integer studentId,String studentName,Integer studentSemester){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentSemester=studentSemester;
	}
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
	public Integer getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}
	@Override
	public boolean equals(Object o){
		Student p=(Student)o;
		if(this.studentId==p.studentId)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode(){
		return this.studentId;
	}

}
