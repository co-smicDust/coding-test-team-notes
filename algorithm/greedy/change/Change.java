import java.util.Scanner;

public class Change {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("java 거스름돈: ");
    int n = sc.nextInt();
    int cnt = 0;
    int[] coin = {500, 100, 50, 10};
    
    for (int i = 0; i < 4; i++){
      if(n >= coin[i]) {
        cnt += n / coin[i];
        n %= coin[i];
      }
    }

    System.out.println(cnt);
  }
}