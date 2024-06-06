import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCredits = 0.0;
        double totalPoints = 0.0;

        for (int i = 0; i < 20; i++) {
            String courseName = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            double gradePoint = getGradePoint(grade);
            if (gradePoint != -1) {
                totalCredits += credit;
                totalPoints += credit * gradePoint;
            }
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("%.6f\n", gpa);
    }

    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            case "P": return -1.0;
            default: return -1.0;
        }
    }
}