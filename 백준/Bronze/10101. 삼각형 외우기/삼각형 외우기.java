import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        String result = determineTriangleType(angle1, angle2, angle3);
        System.out.println(result);
    }

    private static String determineTriangleType(int angle1, int angle2, int angle3) {
        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                return "Equilateral";
            } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Error";
        }
    }
}