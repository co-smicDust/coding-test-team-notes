import java.util.Scanner;

public class Knight {
  public static void main(String[] args) {
    System.out.println("knight의 현위치 입력: ");
    Scanner sc = new Scanner(System.in);
    String cdn = sc.next();
    int x = cdn.charAt(0) - (int)'a' + 1;
    int y = Integer.parseInt(String.valueOf(cdn.charAt(1)));

    int[][] drt 
      = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
    int cnt = 0;

    for (int i = 0; i < 8; i++){
      int next_x, next_y;
      next_x = x + drt[i][0];
      next_y = y + drt[i][1];

      if (next_x > 0 && next_x < 9 && next_y > 0 && next_y < 9) cnt++;
    }

    System.out.println(cnt);
  }
}