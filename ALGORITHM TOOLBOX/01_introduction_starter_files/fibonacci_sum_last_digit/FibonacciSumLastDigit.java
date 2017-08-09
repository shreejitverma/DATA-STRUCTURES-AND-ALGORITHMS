import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FibonacciSumLastDigit {

    private static int getFibonacciSumLastDigit(int n) {

        int[] last_digits = new int[n + 1];
        last_digits[0] = 0;
        last_digits[1] = 1;
        for(int i = 2; i <= n; i++) {
            last_digits[i] = (
                    last_digits[i - 2] % 10 +
                    last_digits[i - 1] % 10 ) % 10;
        }
        return last_digits[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciSumLastDigit(n);
        System.out.println(c);
        scanner.close();
    }
}
