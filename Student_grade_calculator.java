import java.util.Scanner;

public class Student_grade_calculator {
    public static void main(String[] args) {
        float total_marks;
        float avg_percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtain in english :");
        float english = sc.nextFloat();
        System.out.println("Enter marks obtain in hindi :");
        float hindi = sc.nextFloat();
        System.out.println("Enter marks obtain in maths :");
        float maths = sc.nextFloat();
        System.out.println("Enter marks obtain in biology :");
        float biology = sc.nextFloat();

        total_marks = english + hindi + maths + biology;

        avg_percentage = total_marks / 4;

        System.out.println("total marks obtain : " + total_marks);
        System.out.println("Average percentage : " + avg_percentage + "%");

        if (avg_percentage <= 40) {
            System.out.println("Grade is F");
        } else if (avg_percentage >= 41 && avg_percentage <= 50) {
            System.out.println("Grade is E");
        } else if (avg_percentage >= 51 && avg_percentage <= 60) {
            System.out.println("Grade is D");
        } else if (avg_percentage >= 61 && avg_percentage <= 70) {
            System.out.println("Grade is C");
        } else if (avg_percentage >= 71 && avg_percentage <= 80) {
            System.out.println("Grade is B");
        } else {
            System.out.println("Grade is A");
        }

    }
}
