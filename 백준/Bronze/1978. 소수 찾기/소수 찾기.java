import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if(primeNum(Integer.parseInt(st.nextToken()))) result++;
        }
        System.out.print(result);
    }

    public static boolean primeNum(int num) {
        if (num > 1){
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}