import java.util.Scanner;

public class exam_marks_percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total marks of subjects");
        int total_marks = sc.nextInt();
        int  percentage = (total_marks* 100)/500;
        System.out.println(percentage);
    }



}