package Code;
import java.util.Scanner;

public class WhileIteration {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    	System.out.print("Enter a string: ");  
    	String str= sc.nextLine();              //reads string   - Basking ridge
    	System.out.print("You have entered: "+str);          
    	char[] JavaCharArray = {'r', 's', 't', '1', '!'};
    	for (int i=0; i<JavaCharArray.length; i++) {
    		for (int j =0; j< str.length(); j++)
    		{
    			if (JavaCharArray[i] == str.charAt(j))
    			{
    				System.out.println("\nCharacter present is " +JavaCharArray[i]);
    				
    			}
    			
    		}
    	}

    }
}