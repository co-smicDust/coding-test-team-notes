import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] primeNum = new boolean[n - m + 1];
        Arrays.fill(primeNum, true);
        int sum = 0, min = 0;

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < n/2; j++) {
                if (i <= j) break;
                if (i % j == 0) {
                    primeNum[i - m] = false;
                    break;
                }
            }
        }

        if (m == 1) primeNum[0] = false;

        for (int p = 0; p < n-m+1; p++) {
            if (primeNum[p]) {
               if (min == 0) min = p + m;
               sum += p + m;
            }
        }

        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}