# 자연수 N, K
n, k = map(int, input("자연수 2개 입력(공백 구분): ").split())

cnt = 0

while True:
  # N이 K로 나누어 떨어지는 수가 될 때까지 빼기
  target = (n // k) * k
  cnt += n - target
  n = target
  # N이 K보다 작을 때 (더이상 나눌 수 없을 때) 탈출
  if n < k:
    break
  # K로 나누기
  n //= k
  cnt += 1

# 마지막으로 남은 수에서 1빼기
cnt += n - 1

print(cnt)