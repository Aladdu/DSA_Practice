//Check the given number is odd or even
package DSA;

import java.util.Scanner;

public class Problem05 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
     int A=sc.nextInt();
     int count = 0;
	if(A%2==0) {
		System.out.println(A+" Even number");
		count++;
	}
	else 
		System.out.println(A+"  Odd number");
    	 
     }
	}

	
