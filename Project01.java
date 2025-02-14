// Number Guessing Game.
package Projects;

import java.util.Random;
import java.util.Scanner;

public class Project01 {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random random=new Random();
			int numbertogues=random.nextInt(100)+1;
			int userguess;
			boolean hasguesednumber=false;
			
			System.out.println("Wellcome to the Number Guessing Game:");
			System.out.println("guess the number between 1 to 100");
			while(! hasguesednumber) {
				System.out.println("Enter the number:");
				userguess=sc.nextInt();
				if(numbertogues>userguess) {
					System.out.println("Your number to to low");
				}
				else if(numbertogues<userguess) {
					System.out.println("YOur number is too hight.try again");
				}
				else {
					System.out.println("Congratulations your enter number is correct");
				hasguesednumber= true;
				}
			}	
	}

}
