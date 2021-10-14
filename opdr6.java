import java.util.Scanner;
import java.util.Arrays;

public class opdr6 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String word;
	    
	    System.out.println("Enter a word");
	    word = s.nextLine();
	    
	    char charArray[] = word.toCharArray();
	    Arrays.sort(charArray);
	    System.out.println(Arrays.toString(charArray));
	    

		  	   
	   }
}
