package Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class strReverseCollections {
	
	 public static void main(String[] args) {          
	        //Create a list of strings  
	            List<String>  mylist = new ArrayList<String>();  
	            mylist.add("Java");  
	            mylist.add("PHP");  
	            mylist.add("Python");  
	            mylist.add("COBOL");  
	            System.out.println("Original List:- " + mylist);        
	            Collections.reverse(mylist);  
	            System.out.println("Modified List:- " + mylist);  
	          }  

}
