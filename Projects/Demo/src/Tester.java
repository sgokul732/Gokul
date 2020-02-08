import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Jack",29,"M");
		Student s2=new Student("Alex",32,"F");
		Student s3=new Student("Jimmy",67,"F");
		ArrayList<Student> stuList=new ArrayList();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		for(Student s:stuList){
			System.out.println(s.customShow((st)->{
				
				return s.gender.equals("M")?"Mr."+st.name:"Mrs."+st.name;
				
				
			}));
		}

	}

}
