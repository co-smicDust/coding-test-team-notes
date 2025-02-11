import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> stack = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }
        br.close();
    }

    public static void push(int num) {
        stack.add(num);
    }
    public static void pop() {
        if (stack.isEmpty()) System.out.println(-1);
        else {
            System.out.println(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
    }
    public static void size() {
        System.out.println(stack.size());
    }
    public static void empty() {
        if (stack.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }
    public static void top() {
        if (stack.isEmpty()) System.out.println(-1);
        else System.out.println(stack.get(stack.size()-1));
    }
}