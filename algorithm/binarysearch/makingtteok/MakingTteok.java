import java.util.*;

public class MakingTteok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] tteok = new int[n];
        for (int i = 0; i < n; i++) {
            tteok[i] = sc.nextInt();
        }

        int start = 0;
        int end = Arrays.stream(tteok).max().getAsInt();
        int maxh = 0;
        
        while (start <= end) {
            int result = 0;
            int h = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if (tteok[i] > h) result += tteok[i] - h;   
            }
            if (result >= m) {
                maxh = h;
                start = h + 1;
            }
            else end = h - 1;
        }
        System.out.println(maxh);
    }
}