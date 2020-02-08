package exercises;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Tester31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Ron",1);
		Student s2=new Student(102,"John",9);
		Student s3=new Student(103,"Son",5);
		Student s4=new Student(101,"Ron",1);
		Student[] s={s1,s2,s3,s4};
		List<Student> stuList=new ArrayList<Student>();
		stuList.addAll(Arrays.asList(s));
		Set<Student> stuSet=new HashSet<Student>();
		stuSet.addAll(stuList);
		ArrayList<Student> ar=new ArrayList<>();
		ar.addAll(stuList);
		ar.removeAll(stuSet);
		System.out.println("Hello"+ar);
		stuList=new ArrayList<Student>();
		stuList.addAll(stuSet);
		stuList.sort(new Helper2());
		for(Student st:stuList){
			System.out.println(st.getStudentName());
			System.out.println(st.getStudentSemester());
			
		}

	}

}
class Helper implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStudentSemester()>o2.getStudentSemester())
			return 1;
		else if(o1.getStudentSemester()>o2.getStudentSemester())
			return -1;
		else
			return 0;
	}
	
}
class Helper2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStudentSemester()>o2.getStudentSemester())
			return -1;
		else if(o1.getStudentSemester()>o2.getStudentSemester())
			return 1;
		else
			return 0;
	}
	
}
