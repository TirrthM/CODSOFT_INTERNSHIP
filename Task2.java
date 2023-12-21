//Student grade calculator

import java.util.*;

public class Task2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maths, science, english, social_science, french;
        int totalSubjects = 5;
        System.out.println("\n**********Student Grade Calculator**********\n");  
        System.out.println("Enter Math marks: ");
        maths = sc.nextInt();
        System.out.println("Enter science marks: ");
        science = sc.nextInt();
        System.out.println("Enter english marks: ");
        english = sc.nextInt();
        System.out.println("Enter social_science marks: ");
        social_science = sc.nextInt();
        System.out.println("Enter french marks: ");
        french = sc.nextInt();
        int totalMarks = maths + science + social_science + english + french;
        int percentage = totalMarks/totalSubjects;
        char Grade = calculateGrade(percentage);
        System.out.println("Total marks: "+totalMarks+"/500");
        System.out.println("Average percentage: "+percentage);
        System.out.println("Grade: "+Grade);

    }

    private static char calculateGrade(double Percentage) {
        if (Percentage >= 90) {
            return 'A';
        } else if (Percentage >= 80) {
            return 'B';
        } else if (Percentage >= 70) {
            return 'C';
        } else if (Percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }



}
