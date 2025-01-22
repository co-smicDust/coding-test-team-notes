import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 전구 개수
        int m = sc.nextInt();   // 명령어 개수
        int[] state = new int[n];     // 현재 상태 초기화
        for (int i = 0; i < n; i++) {
            state[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int orderNum = sc.nextInt();
            int il = sc.nextInt() - 1;
            int xr = sc.nextInt();

            switch (orderNum) {
                case 1:
                    state[il] = xr;
                    break;
                case 2:
                    for (int j = il; j < xr; j++) {
                        if (state[j] == 0) state[j] = 1;
                        else state[j] = 0;
                    }
                    break;
                case 3:
                    for (int j = il; j < xr; j++) {
                        state[j] = 0;
                    }
                    break;
                case 4:
                    for (int j = il; j < xr; j++) {
                        state[j] = 1;
                    }
                    break;
            }
        }
        for (int s: state) System.out.print(s + " ");
    }
}