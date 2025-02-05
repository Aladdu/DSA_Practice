package DSA;

import java.util.Scanner;

public class Problem_01 {
    Scanner sc=new Scanner(System.in);
    public void Area(double length,double width) {
    	System.out.println("Enter lenght of rectangle:");
    	length=sc.nextDouble();
    	System.out.println("Enter width of rectangle:");
    	width=sc.nextDouble();
		System.out.print(length*width);
    	}
	public static void main(String[] args) {
    Problem_01 Obj=new Problem_01();
    Obj.Area(12,13);

	}

}
