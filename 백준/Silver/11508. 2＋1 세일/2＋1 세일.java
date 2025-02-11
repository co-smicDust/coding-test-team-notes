import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 유제품 수 입력
        int N = Integer.parseInt(br.readLine());
        
        // 유제품 개수만큼 가격을 저장할 array 생성
        int[] prices = new int[N];
        
        // 유제품 가격 입력
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        
        // 유제품 가격 오름차순 정렬
        Arrays.sort(prices);
        
        // 최소비용 계산하는 함수 이용
        long totalCost = calculateTotalCost(prices, N);
        
        // 결과 출력
        System.out.println(totalCost);
    }
    
    // 최소비용을 계산하는 함수
    private static long calculateTotalCost(int[] prices, int N) {
        long totalCost = 0;  // 최종 비용 초기화
        
        // 유제품 가격 배열을 거꾸로 탐색하면서 최소비용을 계산
        // 한 번의 루프에서 3개의 유제품을 처리
        for (int i = N - 1; i >= 0; i -= 3) {
            if (i == 0) {
                // 세 개씩 묶고 남은 유제품이 1개인 경우, 해당 제품의 가격을 그대로 추가
                totalCost += prices[i];
            } else if (i == 1) {
                // 세 개씩 묶고 남은 유제품이 2개인 경우, 두 제품의 가격을 더하여 추가
                totalCost += prices[i] + prices[i - 1];
            } else {
                // 남은 유제품이 3개 이상인 경우, 가장 저렴한 제품 가격을 빼고 추가
                totalCost += prices[i] + prices[i - 1];
            }
        }
        
        return totalCost;
    }
    
}