//Check whether a character is vowel or consonant
package DSA;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char c=sc.next().charAt(0);
		if(Character.isLetter(c)) {
		switch(Character.toLowerCase(c)) {
		case 'a':
			System.out.println(c+" vowel");
			break;
		case 'e':
		    System.out.println(c+" vowel");
		    break; 
		case 'i':
		System.out.println(c+" vowel");
		break;
		case 'o':
		System.out.println(c+" vowel");
		break;
		case 'u':
		System.out.println(c+" vowel");
		break;
		
		default:
			System.out.println(c+" Consonent");
		}
	}
		else
			System.out.print("Give me only character");

}
}
