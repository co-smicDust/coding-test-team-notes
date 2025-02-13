import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] pm = new String[n];
        HashMap<String, Integer> pmh = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            pm[i] = name;
            pmh.put(name, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if (48 < q.charAt(0) && q.charAt(0) < 58) { // 문제가 숫자라면
                sb.append(pm[Integer.parseInt(q) - 1]).append("\n");
            } else {    // 문제가 문자라면
                sb.append(pmh.get(q)).append("\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}