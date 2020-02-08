package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTester {
	public static void main(String args[]){
		MyInterface mf=(String arg)->System.out.println(arg);
		
		mf.print("Hi");
		
		Student s1=new Student(1,100);
		Student s2=new Student(2,200);
		Student s3=new Student(3,200);
		List<Student> stuList=new ArrayList<Student>();
		stuList.add(s3);
		stuList.add(s1);
		stuList.add(s2);
		
		
		Collections.sort(stuList);
		for(Student s:stuList){
			System.out.println(s.getId()+"  "+s.getMarks());
		}
		Collections.sort(stuList,new SecondSortOrder());
		System.out.println("________________________________________--");
		for(Student s:stuList){
			System.out.println(s.getId()+"  "+s.getMarks());
		}
		
	}
	
	public void test(MyInterface mi){
		
	}
	

}


