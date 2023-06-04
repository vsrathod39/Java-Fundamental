package decision_structure;

import java.util.Scanner;

public class switch_expression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message = switch (grade) {
            case "A" -> "Excellent!";
            case "B", "C" -> "Good!";
            case "D" -> {
                yield "Average!";
            }
            default -> "Oh oh!";
        };
        System.out.println("Message: " + message);
    }
}
