import java.util.*;

public class AdventurerGuild{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("모험가 수: ");
    int n = sc.nextInt();

    System.out.println("공포도: ");
    ArrayList<Integer> fearRate = new ArrayList<>();
    for (int i = 0; i < n; i++){
      fearRate.add(sc.nextInt());
    }

    Collections.sort(fearRate);
    int guild = 0;
    int personnel = 0;

    for (int i = 0; i < n; i++){
      personnel += 1;
      if (personnel >= fearRate.get(i)){
        guild += 1;
        personnel = 0;
      }
    }

    System.out.println(guild);
  }
}