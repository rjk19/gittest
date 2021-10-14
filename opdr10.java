import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class opdr10 {
	
	   public static void main(String[] args) {
		   
		   Scanner s = new Scanner(System.in);
		   String[] arr = new String[5];
		   int counter = 0;
		   
		   String saidWords = "Gezegd is: ";
		   
		   for(int i = 0; i < arr.length; i++) {
			   System.out.println("Ik ga op vakantie en ik neem mee...");
			   arr[i] =  s.nextLine();
			   
			   if (arr[i] != null && counter == 0) {
				   saidWords += arr[i] + " ";
				   counter++;
			   } else 
				   if (counter > 0 && String.valueOf(arr[i].charAt(0)) == saidWords.substring(saidWords.length() - 2)) {
					   	saidWords += arr[i] + " ";
			   } else {
				   System.out.println("Wrong!");
			   }
			   System.out.println(saidWords);
			   System.out.println("Moet beginnen met: " + saidWords.substring(saidWords.length() - 2));
			   
		   }
		  
		  	   
	   }
}
