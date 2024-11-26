import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        System.out.println("Сумма цифр: " + sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        return (n == 0) ? 0 : n % 10 + sumOfDigits(n / 10);
    }
}