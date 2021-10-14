import java.util.Scanner;
import java.util.Arrays;

public class opdr7 {
	public static void main(String[] args) {
	   
		String woord = "fiets";
		Scanner input = new Scanner(System.in);
		String userinp;
		String empty = "";
		String code = "";
		
		char[] charArray = woord.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			empty += " _";
		}
		
		System.out.println(empty);
		System.out.println("Guess the word!");
		userinp = input.nextLine();
		
		char[] lettercheck = userinp.toCharArray();
		
		for(int i = 0; i < lettercheck.length; i++) {
			if(lettercheck[i] == charArray[i]) {
				code += "2";
			}
			if(lettercheck[i] != charArray[i] && woord.indexOf(lettercheck[i]) != -1) {
				code += "1";
			}
			if (lettercheck[i] != charArray[i] && woord.indexOf(lettercheck[i]) == -1) {
				code += "0";
			}
		}
		
		  	   
	   }
}
