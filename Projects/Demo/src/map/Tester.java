package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import exercises.Student;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,String> m=new TreeMap<String,String>();
       m.put("2", "Java");
       m.put("1","Dot Net");
       m.put("3", "C++");
       for(String s:m.keySet()){
    	   System.out.println(s+" "+m.get(s));
       }
       Map<Student,Integer> ms=new TreeMap<Student,Integer>();
       ms.put(new Student(1,"a",2), 1);
       for(Student s:ms.keySet()){
    	   System.out.println(s+" "+ms.get(s));
       }
      
       
	}

}
