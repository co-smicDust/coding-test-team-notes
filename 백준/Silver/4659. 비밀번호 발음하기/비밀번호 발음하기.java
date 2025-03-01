import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] vowel = {"a","e","i","o","u"};

        Pw:
        while (true) {
            // 'end'가 나올 때 까지 검증 반복
            String pw = br.readLine();
            if (pw.equals("end")) break;

            // 모음(a,e,i,o,u) 중 하나를 반드시 포함
            int nv = 0;
            for (String v: vowel) {
                if (pw.contains(v)) break;
                nv++;
            }
            if (nv == 5) {
                sb.append("<").append(pw).append("> is not acceptable.\n");
                continue;
            }

            // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 됨
            int v3 = 0; // 모음 카운트
            int c3 = 0; // 자음 카운트
            Letter:
            for (int i = 0; i < pw.length(); i++) { // pw 한 글자씩
                for (String v: vowel) {  // 모음 여부 판단
                    if (v.equals(String.valueOf(pw.charAt(i)))) {    // 모음일 때
                        c3 = 0;
                        v3++;
                        if (v3 == 3) {  // 3번 연속 왔을 경우
                            sb.append("<").append(pw).append("> is not acceptable.\n");
                            continue Pw;
                        }
                        continue Letter;
                    }
                }
                // 자음일 때
                v3 = 0;
                c3++;
                if (c3 == 3) {  // 3번 연속 왔을 경우
                    sb.append("<").append(pw).append("> is not acceptable.\n");
                    continue Pw;
                }
            }

            // 같은 글자가 연속으로 두 번 오면 안 되나, ee와 oo는 허용
            for (int i = 0; i < pw.length() - 1; i++) {
                String ltr = String.valueOf(pw.charAt(i));
                if (ltr.equals(String.valueOf(pw.charAt(i + 1))) && !ltr.equals("e") && !ltr.equals("o")) {
                    sb.append("<").append(pw).append("> is not acceptable.\n");
                    continue Pw;
                }
            }

            // 조건을 모두 충족할 경우
            sb.append("<").append(pw).append("> is acceptable.\n");

        }   // end of Loop Pw

        System.out.println(sb);

    }   // end of Method main
}   // end of Class Main