import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] build = new int[n][2];
        int[] rank = new int[n];
        Arrays.fill(rank, 1);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            build[i][0] = Integer.parseInt(st.nextToken());
            build[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {       // 기준
            for (int j = 0; j < n; j++) {   //비교 대상
                if (i != j) {           // i와 j가 다른 번호일 때
                    if (build[i][0] < build[j][0]) {    // 몸무게 비교
                        if (build[i][1] < build[j][1]) {    // 키 비교
                            rank[i]++;
                        }
                    }
                }
            }
        }

        for (int r:rank) {
            System.out.print(r + " ");
        }
    }
}