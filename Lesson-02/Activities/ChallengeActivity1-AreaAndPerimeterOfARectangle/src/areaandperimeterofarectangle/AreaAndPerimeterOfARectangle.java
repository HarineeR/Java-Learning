/* Challenge Activity 1
 * 
 * This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the recrangle. 
 * 
 *  Area = Length x Width
 *  Perimeter = 2 x (Length + Width)
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

package areaandperimeterofarectangle;

import java.util.Scanner;

public class AreaPerimeter
 {
    public static void main(String[] args) 
    {
        int l,w,a,p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length");
        l= sc.nextInt();
        System.out.print("Enter Width");
        w= sc.nextInt();
        a = l * w;
        p = 2 * (l + w);
        System.out.println("Perimeter="+p);
        System.out.println("Area="+a);
    }
}
