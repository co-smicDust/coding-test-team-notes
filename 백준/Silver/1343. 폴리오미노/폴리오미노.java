import java.io.*;

public class Main {
    public static StringBuilder el = new StringBuilder();
    public static boolean impossible = false;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        System.out.println(readBoard(board));
    }

    public static String readBoard(String b) {
        int cnt = 0;

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'X') {   // X일 경우 카운트 후 다음 문자로
                cnt++;
                continue;
            }
            // .일 경우
            if (cnt > 0) {  // . 앞에 X가 존재할 때
                poly(cnt);  // 판단 후 덮기
                if (impossible) {
                    return "-1";  // 덮을 수 없을 경우 -1 리턴
                }
                // 덮을 수 있는 경우
                el.append(".");
                cnt = 0;

            } else {    // .앞에 .일 경우
                el.append(".");
            }
        }

        if (cnt > 0) {
            poly(cnt);
            if (impossible) {
                return "-1";
            }
        }

        return el.toString();
    }

    public static void poly (int c) {
        if (c % 2 == 0) {
            while (c > 0) {
                if (c > 3) {
                    el.append("AAAA");
                    c -= 4;
                } else {
                    el.append("BB");
                    c -= 2;
                }
            }
            return;
        }
        impossible = true;
    }
}