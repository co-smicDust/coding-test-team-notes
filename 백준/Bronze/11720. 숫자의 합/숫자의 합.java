import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] num = sc.next().split("");
        for(String s: num) {
            sum += Integer.parseInt(s);
        }

        System.out.print(sum);
    }
}