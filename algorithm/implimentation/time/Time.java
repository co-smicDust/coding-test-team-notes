import java.util.*;

public class Time {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("23이하 정수 N 입력: ");
    int n = sc.nextInt();
    int cnt = 0;
    
    // 시, 분, 초
    for (int h = 0; h <= n; h++){
      String hour = Integer.toString(h);
      for (int m = 0; m < 60; m++){
        String mnt = Integer.toString(m);
        for (int s = 0; s < 60; s++){
          String sec = Integer.toString(s);
          String time = hour + mnt + sec;

          // 문자열로 형변환한 시각에 3이 포함되어 있으면 경우의 수 증가
          if(time.contains("3")){
            cnt++;
          }
        }
      }
    }

    System.out.println(cnt);
  }
}