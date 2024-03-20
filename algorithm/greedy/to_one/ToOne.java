import java.util.Scanner;

public class ToOne {
  public static void main(String[] args) {
    
    System.out.println("공백으로 구분하여 자연수 두 개 입력: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int cnt = 0;

    while (true) {
      int target = (n / k) * k;
      cnt += n - target;
      n = target;
      
      if (n < k)  break;
      
      n /= k;
      cnt += 1;
    }

    cnt += n - 1;

    System.out.println(cnt);
  }
}