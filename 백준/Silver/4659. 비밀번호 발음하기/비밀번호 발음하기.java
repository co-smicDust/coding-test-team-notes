import java.util.*;
import java.io.*;

public class Main {
    public static Set<Character> vowel = Set.of('a','e','i','o','u');
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 'end'가 나올 때 까지 검증 반복
            String pw = br.readLine();
            if (pw.equals("end")) break;

            if (isGoodPw(pw)) {
                sb.append("<").append(pw).append("> is acceptable.\n");
            } else {
                sb.append("<").append(pw).append("> is not acceptable.\n");
            }
        }
        System.out.println(sb);

    }   // end of Method main

    public static boolean isGoodPw(String pw) {
        return containsV(pw) && !isContinuous(pw) && !hasTheSameLettersInARow(pw);
    }

    public static boolean containsV(String pw) {
        // 모음(a,e,i,o,u) 중 하나를 반드시 포함
        for (Character p: pw.toCharArray()) {
            if (vowel.contains(p)) return true;
        }
        return false;
    }

    public static boolean isContinuous(String pw) {
        // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 됨
        int v3 = 0; // 모음 카운트
        int c3 = 0; // 자음 카운트
        Letter:
        for (int i = 0; i < pw.length(); i++) { // pw 한 글자씩
            for (Character v: vowel) {  // 모음 여부 판단
                if (v.equals(pw.charAt(i))) {    // 모음일 때
                    c3 = 0;
                    v3++;
                    if (v3 == 3) {  // 3번 연속 왔을 경우
                        return true;
                    }
                    continue Letter;
                }
            }
            // 자음일 때
            v3 = 0;
            c3++;
            if (c3 == 3) {  // 3번 연속 왔을 경우
                return true;
            }
        }
        return false;
    }

    public static boolean hasTheSameLettersInARow(String pw) {
        // 같은 글자가 연속으로 두 번 오면 안 되나, ee와 oo는 허용
        for (int i = 0; i < pw.length() - 1; i++) {
            Character ltr = pw.charAt(i);
            if (ltr.equals(pw.charAt(i + 1)) && !ltr.equals('e') && !ltr.equals('o')) {
                return true;
            }
        }
        return false;
    }
}   // end of Class Main