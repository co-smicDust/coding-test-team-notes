import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        int sum = 0;    // 9난쟁이의 키 합
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }
        int over = sum - 100;   // 초과값
        List<Integer> result = new ArrayList<>();

        Loop1:
        for (int i = 0; i < 8; i++) {   // 0번 ~ 7번
            for (int j = i+1; j < 9; j++) { // 1번 ~ 8번 (j > i)
                if (height[i] + height[j] == over) {    // i번 + j번의 키가 초과값일 때
                    for (int h = 0; h < 9; h++) {
                        if (h != i && h != j) {
                            result.add(height[h]);
                        }
                    }
                    break Loop1;
                }
            }
        }

        Collections.sort(result);
        for (int r: result) {
            System.out.println(r);
        }
    }
}