package Code;

public class stringRev_Check {
	
	  public String reverseStr(String str) {
		    // create variable to store reversed version of str
		    StringBuilder reverse = new StringBuilder();

		    // iterate over input string from the back with charAt
		    for(int i = str.length() - 1; i >= 0; i--) {
		      // add chars to reversed variable
		      reverse.append(String.valueOf(str.charAt(i)));
		    }

		    // convert to string and return reversed version 
		    return reverse.toString();
		  }

}
