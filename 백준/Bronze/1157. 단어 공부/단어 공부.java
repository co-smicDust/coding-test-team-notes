import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] count = new int['z' - 'a' + 1];
        Arrays.fill(count, 0);
        int maxIdx = 0, max = 0;
        boolean dup = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            char s = word.charAt(i);
            if (Character.isUpperCase(s)){
                count[s - 'A'] += 1;
            } else {
                count[s - 'a'] += 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                dup = false;
                maxIdx = i;
                max = count[i];
            } else if (count[i] == max) {
                dup = true;
            }
        }

        if (dup) System.out.print("?");
        else System.out.print(Character.toString(maxIdx + 'A'));
    }
}