import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        String[] reading = new String[5];
        int maxLen = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            reading[i] = br.readLine();
            if (maxLen < reading[i].length()) {
                maxLen = reading[i].length();
            }
        }

        for (int i = 0; i < maxLen; i++){
            for (int j = 0; j < 5; j++) {
                if (reading[j].length() <= i) continue;
                System.out.print(reading[j].charAt(i));
            }
        }

    }
}