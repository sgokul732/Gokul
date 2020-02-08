package tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> t=new HashSet<Integer>();
		t.add(9);
		t.add(8);
		t.add(8);
		for(Integer e:t)
			System.out.println(e);
	    Iterator<Integer> it=t.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());

	}

}
