import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            int num = Character.isAlphabetic(n.charAt(i)) ? n.charAt(i) - 'A' + 10 : Character.getNumericValue(n.charAt(i));

            result += num * (int)Math.pow(b, n.length() - i - 1);
        }

        System.out.println(result);
    }
}