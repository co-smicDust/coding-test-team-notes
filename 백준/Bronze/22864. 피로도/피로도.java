import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int fatigue = 0, done = 0, time = 0;

        while (time < 24) {
            if (fatigue + a <= m) {
                fatigue += a;
                done += b;
            } else {
                if (fatigue - c < 0)
                    fatigue = 0;
                else
                    fatigue -= c;
            }
            time += 1;
        }

        System.out.println(done);
    }
}