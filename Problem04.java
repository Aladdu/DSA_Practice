//Swap value of two variables
package DSA;

public class Problem04 {
	
     public static void swap01(int a,int b) {
    	 int c;
    	 c=a;
    	 a=b;
    	 b=c;
    	 System.out.println("After swap values are:A= "+a+" B "+b);
    	
     }
     public static void swap02(int a,int b) {
    	 b=a+b;
    	 a=b-a;
    	 b=b-a;
    	 System.out.println("After swap values are:A= "+a+" B "+b);
    	 
     }
     public static void swap03(int arr[]) {
    	 System.out.println("Enter a,b values");
    	 arr[1]=arr[0]+arr[1];
    	 arr[0]=arr[1]-arr[0];
    	 arr[1]=arr[1]-arr[0];
    	
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          swap01(12, 5);
         swap02(2, 5);
         int arr[]= {15,42};
         swap03(arr);
         System.out.println();
         System.out.print("After swap values are:A= "+arr[0]+" B "+arr[1]);
	}

}
