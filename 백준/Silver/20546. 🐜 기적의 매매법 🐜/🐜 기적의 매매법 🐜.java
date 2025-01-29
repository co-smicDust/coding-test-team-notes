import java.util.*;
import java.io.*;

public class Main {
    public static int jCash, sCash; // 각자 보유 현금
    public static int jStocks = 0, sStocks = 0; // 각자 보유 주식 수
    public static int[] price = new int[14];    // 1/1 ~ 1/14 주가
    public static int[] diff = new int[13];     // 주가 상승 및 감소

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cash = Integer.parseInt(br.readLine());
        jCash = cash;
        sCash = cash;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 13; i++) {
            diff[i] = price[i + 1] - price[i];
        }

        for (int i = 0; i < 14; i++) {
            jun(price[i]);
            if (i > 2) {
                sung(i - 1);
            }
        }

        if (jCash + price[13] * jStocks > sCash + price[13] * sStocks) {
            System.out.println("BNP");
        } else if (jCash + price[13] * jStocks < sCash + price[13] * sStocks) {
            System.out.println("TIMING");
        } else System.out.println("SAMESAME");
    }

    public static void jun(int p) {
        if (p <= jCash) {
            jStocks += jCash / p;
            jCash %= p;
        }
    }

    public static void sung(int i) {
        boolean up = false, down = false;
        for (int j = 0; j < 3; j++) {
            if (diff[i - j] > 0) {  // 전일 대비 상승
                if (down) return;
                up = true;
            } else if (diff[i - j] < 0) { // 전일 대비 하락
                if (up) return;
                down = true;
            } else return;
        }
        if (up && sStocks > 0) {   // 3번 연속 상승시
            sCash += sStocks * price[i + 1];
            sStocks = 0;
        } else if (down) {  // 3번 연속 하락시
            if (price[i + 1] <= sCash) {
                sStocks += sCash / price[i + 1];
                sCash %= price[i + 1];
            }
        }
    }
}