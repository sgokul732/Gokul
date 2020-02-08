package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		 ArrayList<Integer> collection = new ArrayList<Integer>();
	        collection.add(1); collection.add(5); collection.add(3);
	        Collections.sort(collection,new Helper());
	        
	        System.out.println(collection);
       
}
	
}
class Helper implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		if(a>b)
			return -1;
		else if(a<b)
			return 1;
		else
			return 0;
				
	}
	
}
