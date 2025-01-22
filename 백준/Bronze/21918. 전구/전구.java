import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(sc.nextToken());   // 전구 개수
        int m = Integer.parseInt(sc.nextToken());   // 명령어 개수

        sc = new StringTokenizer(br.readLine());
        int[] state = new int[n];     // 현재 상태 초기화
        for (int i = 0; i < n; i++) {
            state[i] = Integer.parseInt(sc.nextToken());
        }

        for (int i = 0; i < m; i++) {
            sc = new StringTokenizer(br.readLine());
            int orderNum = Integer.parseInt(sc.nextToken());
            int il = Integer.parseInt(sc.nextToken()) - 1;
            int xr = Integer.parseInt(sc.nextToken());

            switch (orderNum) {
                case 1:
                    state[il] = xr;
                    break;
                case 2:
                    for (int j = il; j < xr; j++) {
                        state[j] = Math.abs(state[j] - 1);
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