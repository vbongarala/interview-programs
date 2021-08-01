package Code;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
public class strRevandCharRevCollections {
	
	    public static String reverse(String str)
	    {
	        // return if the string is null or empty
	        if (str == null || str.equals("")) {
	            return str;
	        }
	 
	        // create an empty list of characters and push every
	        // character of the given string into it
	        List<Character> list = new ArrayList<Character>();
	        for (char c: str.toCharArray()) {
	            list.add(c);
	        }
	 
	        // reverse list using `java.util.Collections` `reverse()`
	        Collections.reverse(list);
	 
	        // list.toString() is [t, h, g, i, l, e, D,  , e, i, h, c, e, T]
	 
	        // convert `list.toString()` to valid string
	        return list.toString()
	            .replaceAll("[,\\[\\]]", "")    // t h g i l e D   e i h c e T
	            .replaceAll("  ", "@")          // t h g i l e D@ e i h c e T
	            .replaceAll(" ", "")            // thgileD@eihceT
	            .replaceAll("@", " ");          // !em esreveR
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
	    	System.out.print("Enter a string: ");
	    	String str= sc.nextLine(); //reads string.
//	    	String str = "Reverse me!";
	 
	        // String is immutable
	        str = reverse(str);
	 
	        System.out.println("The reversed string is " + str);
	    }
	}

