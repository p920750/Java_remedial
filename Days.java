/*************************************************************************************************
 *    File             :Positive.java
 *    Description      :Java Program To Display Number of Days in a Month
 *    Author           :Praveen Rajan
 *    Version          :1.0
 *    Date             :27/09/23
 ************************************************************************************************/
package praveen;
import java.util.Scanner;
public class Days {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		   int year,month;
		   System.out.println("Enter  Year and Month");
		   year=sc.nextInt();
		   month=sc.nextInt();
	  
	 if(month==1)
		System.out.println("January "+year+" has 31 days");
	       if(month==2) {
	            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	    	       System.out.println("February "+year+" has 28 days");
	          else
	    	   System.out.println("February "+year+" has 28 days");
	    }
	          else if(month==3)
	    	      System.out.println("March "+year+" has 31 days");
	             else if(month==4)
	    	       System.out.println("April "+year+" has 30 days");
	                else if(month==5)
	    	          System.out.println("May "+year+" has 31 days");
	                   else if(month==6)
	    	             System.out.println("June "+year+" has 30 days");
	                     else if(month==7)
	    	               System.out.println("July "+year+" has 31 days");
	                       else if(month==8)
	    	                 System.out.println("August "+year+" has 31 days");
	                          else if(month==9)
	    	                   System.out.println("September "+year+" has 30 days");
	                            else if(month==10)
	    	                       System.out.println("October "+year+" has 31 days");
	                              else if(month==11)
	    	                        System.out.println("November "+year+" has 30 days");
	                                else if(month==12)
	    	                          System.out.println("December "+year+" has 31 days");
               else
	             System.out.println("Wrong Choice!!");
       }
}
