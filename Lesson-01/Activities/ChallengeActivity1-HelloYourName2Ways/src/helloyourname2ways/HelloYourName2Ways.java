/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;
{
public class HelloYourName2Ways 
{
    public static void main(String[] args)
     {
        System.out.println("enter ur first name");
        fn=sc.next();
        System.out.println("enter ur second name");
        sn=sc.next();

        System.out.println("Hello,"+fn+" "+sn);
        System.out.println("Or should I say:"+sn+", "+fn);
        
    }
    
}
