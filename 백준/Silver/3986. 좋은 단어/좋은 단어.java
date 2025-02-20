import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;
        String[] wd = new String[n];
        for (int i = 0; i < n; i++) {
            wd[i] = br.readLine();
        }

        for (String word: wd) {     // 좋은 단어인지 확인하기
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < word.length(); j++) {   // 단어의 각 글자 순환
                char w = word.charAt(j);    // 단어의 j+1번째 글자
                if (stack.isEmpty() || stack.peek() != w) {    // 스택이 비어있거나 최상단 값이 다른 글자면 삽입
                    stack.push(w);
                } else {    // 스택 최상단 값이 같은 글자면 꺼내기
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) result--;
        }

        System.out.print(result);
        br.close();
    }
}