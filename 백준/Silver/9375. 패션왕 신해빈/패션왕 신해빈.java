import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> com = new HashMap<>();  // 옷의 유형과 유형별 개수를 담은 해시맵
        int tc = Integer.parseInt(br.readLine());   // 테스트케이스 개수

        for (int i = 0; i < tc; i++) {  // 각 테스트케이스 수행
            int n = Integer.parseInt(br.readLine());    // 테스트케이스별 옷의 개수
            for (int j = 0; j < n; j++) {   // 옷을 해시맵에 저장
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                com.put(type, com.containsKey(type)?com.get(type)+1:1);
            }
            Set types = com.keySet();   // 옷의 유형을 담은 set

            int cnt = 1;
            for (Object t: types) {
                cnt *= com.get(t.toString()) + 1;
            }

            sb.append(cnt - 1).append("\n");
            com.clear();
        }

        System.out.println(sb);
    }
}