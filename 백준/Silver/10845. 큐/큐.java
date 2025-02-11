import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    last = Integer.parseInt(command[1]);
                    q.offer(last);
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : last).append("\n");
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}