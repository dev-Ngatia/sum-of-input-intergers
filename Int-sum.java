import java.util.Scanner;

public class SumUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum of the entered numbers: " + sum);
    }
}
