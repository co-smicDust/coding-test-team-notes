import java.util.Scanner;

public class Multiplus{
  public static void main(String[] args){

    System.out.println("공백없이 자연수 입력: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    // 0의 ASCII CODE 빼기
    int result = s.charAt(0) - '0';
    
    for(int i = 1; i < s.length(); i++){
      int num = Character.getNumericValue(s.charAt(i));
      if(num <= 1 || result <= 1)
        result += num;
      else
        result *= num;
    }
    System.out.println(result);
  }
}