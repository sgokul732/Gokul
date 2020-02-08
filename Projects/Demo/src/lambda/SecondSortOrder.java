package lambda;

import java.util.Comparator;

public class SecondSortOrder implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getId()>s2.getId()){
			return -11;
		}
		else if(s1.getId()<s2.getId()){
			return 1;
		}
		else 
			return 0;
	}

}
