//this piece of code is done by Nazmul Alam Diptu [ A teacher in cse215.L) ]
import java.util.Scanner;
public class Task01 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        double totalMarks = 0, avgMarks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numStudents = sc.nextInt();
        double[] marks = new double[numStudents];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of students " + (i + 1) + " : ");
            marks[i] = sc.nextDouble();
        }
        sc.close();
        avgMarks = totalMarks(marks) / numStudents;
        System.out.println("Average is : " + avgMarks);
        System.out.println(aboveAvg(marks, avgMarks) + " of them got above average.");
        System.out.println(belowAvg(marks, avgMarks) + " of them got below average.");
    }
    public static double totalMarks(double[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }
    public static int aboveAvg(double[] marks, double avgMarks) {
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > avgMarks)
                count++;
        }
        return count;
    }
    public static int belowAvg(double[] marks, double avgMarks) {
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < avgMarks)
                count++;
        }
        return count;
    }
}
