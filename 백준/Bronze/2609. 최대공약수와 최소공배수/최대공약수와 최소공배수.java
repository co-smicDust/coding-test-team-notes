import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int gcd, lcm;

        gcd = num1 > num2? getGcd(num1, num2): getGcd(num2, num1);
        lcm = num1 * num2 / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) return a;
        return getGcd(b, a % b);
    }
}