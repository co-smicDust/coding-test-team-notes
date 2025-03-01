import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        for (int i = 0; i < H; i++) {
            String[] c = br.readLine().split("");
            int cloud = 0;  // 구름 위치

            for (int j = 0; j < W; j++) {
                if (c[j].equals("c")) {
                    sb.append("0 ");
                    cloud = j + 1;
                } else {
                    if (cloud == 0) {
                        sb.append("-1 ");
                    } else {
                        int forcast = j + 1 - cloud;
                        sb.append(forcast).append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }   // end of Method main
}   // end of Class Main