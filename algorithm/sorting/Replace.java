import java.util.*;

public class Replace {

  public static void quickSort(int[] arr, int start, int end, int order) {
      // order가 0이면 asc, 1이면 desc
      if (start >= end) return; // 원소가 1개인 경우 종료
      int pivot = start; // 피벗은 첫 번째 원소
      int left = start + 1;
      int right = end;
      while (left <= right) {
        if (order == 0) {
          // 피벗보다 큰 데이터를 찾을 때까지 반복
          while (left <= end && arr[left] <= arr[pivot]) left++;
          // 피벗보다 작은 데이터를 찾을 때까지 반복
          while (right > start && arr[right] >= arr[pivot]) right--;
        }
        else {
          while (left <= end && arr[left] >= arr[pivot]) left++;
          while (right > start && arr[right] <= arr[pivot]) right--;
        }

          // 엇갈렸다면 작은 데이터와 피벗을 교체
          if (left > right) {
              int temp = arr[pivot];
              arr[pivot] = arr[right];
              arr[right] = temp;
          }
          // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
          else {
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
          }

      }
      
      // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
      quickSort(arr, start, right - 1, order);
      quickSort(arr, right + 1, end, order);
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n, k;
    n = sc.nextInt();
    k = sc.nextInt();
    sc.nextLine();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    quickSort(a, 0, n - 1, 0);
    quickSort(b, 0, n - 1, 1);

    for (int i = 0; i < k; i++) {
      if (a[i] < b[i]) {
        int temp;
        temp = a[i];
        a[i] = b[i];
        b[i] = temp;
      }
      else break;
    }

    int result = 0;
    
    for (int i = 0; i < n; i++) {
      result += a[i];
    }

    System.out.println(result); 
  }
  
}