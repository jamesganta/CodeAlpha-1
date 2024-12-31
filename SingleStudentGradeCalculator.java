import java.util.Scanner;

public class SingleStudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Get marks for each subject
        double[] subjectMarks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
            totalMarks += subjectMarks[i];
        }

        // Calculate average marks
        double averageMarks = totalMarks / numSubjects;

        // Determine grade based on average marks
        String grade;
        if (averageMarks >= 90) {
            grade = "A+";
        } else if (averageMarks >= 80) {
            grade = "A";
        } else if (averageMarks >= 70) {
            grade = "B";
        } else if (averageMarks >= 60) {
            grade = "C";
        } else if (averageMarks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}