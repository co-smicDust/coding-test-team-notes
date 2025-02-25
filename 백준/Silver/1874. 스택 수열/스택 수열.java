import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int pushN = 1;

        Loop:
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (stack.isEmpty() || stack.peek() < num) {    // 스택이 비었거나 최상단값이 num보다 작을 때
                for (int j = pushN; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                    pushN++;
                }
                if (stack.isEmpty()) {
                    sb.replace(0, sb.length(), "NO");
                    break;
                }
                stack.pop();
                sb.append("-\n");
            } else if (stack.peek() > num) {    // 스택 최상단값이 num보다 클 때
                for (int j = stack.peek(); j > num - 1; j--) {
                    if (stack.isEmpty()) {
                        sb.replace(0, sb.length(), "NO");
                        break Loop;
                    }
                    stack.pop();
                    sb.append("-\n");
                }
            } else {    // 같을 때
                if (stack.isEmpty()) {
                    sb.replace(0, sb.length(), "NO");
                    break;
                }
                stack.pop();
                sb.append("-\n");
            }
        }

        System.out.println(sb);
    }
}