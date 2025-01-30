import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        System.out.println(change(amount));

    }

    public static int change(int amt) {
        int cnt = 0;

        if (amt > 4) {
            int quot5 = amt / 5;
            int rmd5 = amt % 5;
            if (rmd5 % 2 == 0) {   // 5원 거스른 뒤 남은 돈이 짝수면
                cnt += quot5;
                amt = rmd5;

                if (amt == 0) return cnt;   // 5원으로 끝낼수 있는 경우

            } else {    // 홀수면
                cnt += quot5 - 1;
                amt = rmd5 + 5;
            }
        }

        if (amt < 2 || amt == 3) return -1;
        cnt += amt / 2;
        return cnt;
    }
}