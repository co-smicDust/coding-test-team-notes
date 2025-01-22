import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // 테스트 케이스 수
        sc.nextLine();  // 개행
        char[] answer = new char[t];    // 테스트 케이스 별 답

        for (int i = 0;i < t;i++) {
            int[] cnt = new int[26];   // a-z 카운트
            Arrays.fill(cnt,0);    // 0으로 초기화
            String s = sc.nextLine();   // 암호문 입력

            for (int j = 0; j < s.length(); j++){    // 공백제외 카운트
                int c = s.charAt(j);
                if (c == 32) continue;
                cnt[c - 97] += 1;
            }

            int maxIdx = 0, maxVal = 0; // 최빈값 인덱스 및 값
            boolean mul = false;    // 최빈값 여러개 여부
            for (int j = 0; j < cnt.length; j++) {
                if (cnt[j] > maxVal) {  // 최빈값 업데이트
                     maxVal = cnt[j];
                     maxIdx = j;
                     mul = false;
                } else if (cnt[j] == maxVal) {  // 최빈값 중복시
                     mul = true;
                }
            }

            if (mul)  answer[i] = '?';    // 여러개일 경우
            else    answer[i] = (char)(maxIdx + 97);  // 한 개일 경우
        }

        for(char c: answer) System.out.println(c);  // 정답 출력
    }
}