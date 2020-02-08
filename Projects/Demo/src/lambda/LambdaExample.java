package lambda;

import java.util.ArrayList;



class LambdaExample {
    public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
		list.add("James");
		list.add("John");
		list.add("Aparna");
		list.add("Abhimanyu");
		displayStringsInDescendingOrderOfLength(list);
	}
	
    public static void displayStringsInDescendingOrderOfLength(ArrayList<String> strList) {
       strList.sort((String a,String b)->b.compareTo(a));
       for(String s:strList){
    	   System.out.println(s);
       }
	}
}


