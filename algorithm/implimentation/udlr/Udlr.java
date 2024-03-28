import java.util.*;

public class Udlr{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("공간의 크기: ");
    int n = sc.nextInt();
    sc.nextLine(); // 버퍼(개행문자 \n) 비우기
    System.out.println("여행 계획: ");
    String[] plans = sc.nextLine().split(" ");
    
    // 시작 좌표
    int x = 1, y = 1;

    // 이동 방향 벡터
    String[] plan = {"U", "D", "L", "R"};
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    for (int i = 0; i < plans.length; i++){
      // 이동한 좌표
      int nx = 0, ny = 0;
      for (int j = 0; j < 4; j++){        
        if (plans[i].equals(plan[j])){
          nx = x + dx[j];
          ny = y + dy[j];
          break;
        }
      }
      // 정해진 공간에서 벗어나면 무시
      if (nx < 1 || nx > n || ny < 1 || ny > n) continue;
      x = nx;
      y = ny;
    }

    System.out.println(x + " " + y);
  }
}