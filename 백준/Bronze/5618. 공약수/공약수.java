import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int min = (int) 1.0e+8;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < min) min = nums[i];
        }

        System.out.println(1);
        for (int i = 2; i <= min; i++) {
            if (nums[0] % i == 0) {
                int cmn = i;
                for (int j = 1; j < n; j++) {
                    if (nums[j] % i != 0) {
                        cmn = 0;
                        break;
                    }
                }
                if (cmn != 0) System.out.println(cmn);
            }
        }
    }
}