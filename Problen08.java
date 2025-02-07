//Leap year checking
package DSA;

import java.util.Scanner;

public class Problen08 {
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Year here to check leap or not");
	 int Year=sc.nextInt();
	 if((Year%4==0 && Year%100!=0 ) || Year%400==0) {
	 System.out.println(Year+" A leap year");
	 }
	 else
		 System.out.println("Not a leap year");
	 }

}
