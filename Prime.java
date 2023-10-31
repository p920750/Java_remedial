/************************************************************************************
 * File         :Prime.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Check Whether a Number is Prime or Not
 * Version      :1.0
 * Date         :31/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Prime {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		   for(int i=1;i<=number;i++) {
			     if(number%i==0)
			    	count++; 
		           }
		  if(count==2)
		     System.out.println(number+" is a Prime Number:");
		  else
			  System.out.println(number+" is Not Prime Number:");  
	}
}
