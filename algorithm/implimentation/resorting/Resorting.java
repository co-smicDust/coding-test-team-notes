import java.util.*;

public class Resorting {
  public static void main(String[] args) {

    System.out.println("문자열 입력: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] str = new char[s.length()];
    int num = 0, idx = 0;
    boolean cnt = false;

    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isAlphabetic(ch)) {
        str[idx] = ch;
        idx++;
      }
      else {
        num += ch - '0';
        cnt = true;
      }
    }

    Arrays.sort(str);

    for (int i = 0; i < str.length; i++){
      System.out.print(str[i]);
    }
    if (cnt) System.out.println(num);
  }
}