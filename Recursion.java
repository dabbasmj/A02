package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
	
	static int returnNum = 0;
	static String[] sArr;
	static String str;
	static Character[] cArr;
	static int total = 0;
	static String out = "";
	static int iter = 0;
	
	public static int sumOfDigits(int n) {
		//This method returns the sum of all the digits.
		//sumOfDigits(-34) -> 7
		//sumOfDigits(1038) -> 12
		
		n = Math.abs(n);
		
		str = Integer.toString(n);
		
		sArr = str.split("");
		returnNum += Integer.parseInt(sArr[0]);
		if(str.length() >= 1) {
		str = str.substring(1,str.length());}
		
		//Base Case
		if(str.isEmpty()) {
			return returnNum;
		}
		n = Integer.parseInt(str);
		
		return sumOfDigits(n);
	}
	
	public static int countSmiles(char[] letters, int index) {
		//This method counts the number of colons followed by a closing parenthesis.
		//countSmiles([:,), ,L,i,f,e, ,i,s, ,g,o,o,d, ,:,)], 0) -> 2
		//countSmiles([H,a,p,p,y, ,D,a,y, ,:,),:,),:,),!], 0) -> 3
		//countSmiles([a,:,b,(,c,),:, ,),e], 0) -> 0
		
		//Base case
		if(letters.length < 2) {
			return total;
		}
		
		if(letters[0] == ':') {
			if(letters[2] == ')') {
				total++;
			}
		}
		
		return countSmiles(Arrays.copyOfRange(letters, 1, letters.length),0);
	}
	
	public static String toUpper(String str) {
		//E.g. "Hi there!" returns "H I   T H E R E !" 
		
		Character c = str.charAt(iter);
		Character.toUpperCase(c);
		
		return "HI";
	}
	
	public static void main(String[] args) {
		
		System.out.println(Recursion.sumOfDigits(5225));
		System.out.println("SUM OF DIGITS");
		String str = "[H,a,p,p,y, ,D,a,y, ,:,),:,),:,),!], 0)]";
		char[] inArr = str.toCharArray();
		System.out.println(Recursion.countSmiles(inArr, 0));
		System.out.println("Count Smiles");
		

	}
	
}
