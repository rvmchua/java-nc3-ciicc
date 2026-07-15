import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade (0-100): ");
        byte grade = input.nextByte();
        char letterGrade;

        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100!");
        } else {
            if (grade >= 90) {
               letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("Your grade is " + letterGrade);
        }
        input.close();
    }
}