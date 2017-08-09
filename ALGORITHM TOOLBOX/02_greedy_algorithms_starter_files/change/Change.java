import java.util.Scanner;
public class Change {
    private static int getChange(int n) {
        int numChanges = 0;
        int[] denominations = new int[] {10, 5, 1};
        while (n > 0) {
            int i = 0;
            while (i <= 2 && denominations[i] > n) i++;
            n -= denominations[i];
            numChanges++;
        }
        return numChanges;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));
        scanner.close();
    }
}
