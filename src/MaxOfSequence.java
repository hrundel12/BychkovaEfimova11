import java.util.Scanner;

public class MaxOfSequence {
    public static void main(String[] args) {
        System.out.println("Максимум последовательности: " + findMax());
    }

    private static int findMax() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) return 0;
        return Math.max(n, findMax());
    }
}