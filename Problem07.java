//Find largest among three numbers
package DSA;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Values: ");
        int a=sc.nextInt();
        System.out.println("Enter B Values:");
        int b=sc.nextInt();
        System.out.println("Enter C Values:");
        int c=sc.nextInt();
        if(a>b && a> c ) {
        	System.out.println(a+" is greater / Largest number");
        }
        else if(b>c) {
        	System.out.println(b+" is Largest number");
        }
        else
        	System.out.println(c+" is Largest number");
	}

}
