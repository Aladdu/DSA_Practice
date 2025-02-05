//Find ASCII value of a character
package DSA;

import java.util.Scanner;

public class Problem02 {
    public int ascii() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Charecter");
    	char Char=sc.next().charAt(0);
		int ascivalue=(int)Char;
		return ascivalue;
    }
	public static void main(String[] args) {
		Problem02 obj1=new Problem02();
		System.out.println(obj1.ascii());
	}

}
