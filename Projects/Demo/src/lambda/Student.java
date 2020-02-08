package lambda;

public class Student implements Comparable<Student> {
	private int id;
	private int marks;
	public Student(int id,int marks){
		this.id=id;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		if(this.marks>s1.marks){
			return 1;
		}
		else if(this.marks<s1.marks){
			return -1;
		}
		else
			return 0;
	}

}
