/*************************************************************************************************
 *    File             :Positive.java
 *    Description      :Java Program To Check Whether a Number Is Positive or Negative
 *    Author           :Praveen Rajan
 *    Version          :1.0
 *    Date             :27/09/23
 ************************************************************************************************/
package praveen;
import java.util.Scanner;
public class Positive {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter a Number");
		number=sc.nextInt();
		if(number>0)
			System.out.println(number+"is a Positive Number");
		else
				System.out.println(number+" is a Negative Number");			
	}

}
