//Converting Celsius to Fahrenheit
/*Meaning of Converting Celsius to Fahrenheit in Coding
Converting Celsius to Fahrenheit in coding means writing a program that takes 
a temperature value in Celsius as input, applies the conversion formula, and 
outputs the equivalent temperature in Fahrenheit.
Steps to Code It.
*/
package DSA;

import java.util.Scanner;

public class Problem03 {
	
	public static float Fahrenheit(float celsius)
	{
		return (celsius*(9.0f/5.0f))+32;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Celsius value : ");
		float celsius=sc.nextFloat();
		System.out.println("Fahrenheit "+Fahrenheit(celsius)+"F");
		
	}

}
