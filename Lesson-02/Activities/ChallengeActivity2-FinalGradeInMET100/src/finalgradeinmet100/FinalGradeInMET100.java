/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number) 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */

package finalgradeinmet100;

import java.util.Scanner;

public class Grade 
{
    public static void main(String[] args)
    {
        int e1, e2, e3, total, perc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Exam 1 Score= ");
        e1 = sc.nextInt();
        System.out.print("Exam 2 Score= ");
        e2 = sc.nextInt();
        System.out.print("Exam 3 Score= ");
        e3 = sc.nextInt();
        total = e1 + e2 + e3;
        perc = 100 * total / 450;
        System.out.println("Total points ="+total);
        System.out.println("Percentage ="+perc);
        
        
    }
}

