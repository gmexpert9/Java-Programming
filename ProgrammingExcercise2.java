/** Program Excercise 2.1
* Summary: A number input program
* Author: Christopher J Linney
* Date: March 4, 2015
**/

import java.util.Scanner; // Java package for the Scanner class is used.    
 
class Number
{
   public static void main(String args[])
   {
       //the maximum amount of numbers the user asks to put in 
      int n = 5;
      
      // program displays the following message
      System.out.println("Enter a 5 numbers to get the sum");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      if (n <= 5)
      {
          n = n++;
      }
      
      else { 
          System.out.println("You have already entered 5 numbers");
      }
      
      System.out.println("The sum of 5 numbers is " + n);
   
   }
   
   scanner.close(); // close scanner
}
                      

} // end excercise 2








