//Positive negative checking
package DSA;

import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int Number=sc.nextInt();
    if(Number>0)
    	System.out.println(Number +" Number is Positive");
    else
    	System.out.println(Number +" Number is Negative");
    }

}
