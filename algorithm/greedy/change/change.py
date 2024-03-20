# 거스름 돈
n = int(input("거스름돈: "))
# 동전 개수
cnt = 0
# 동전 종류
coin = [500, 100, 50, 10]

for c in coin:
  if n >= c:
    cnt += n // c
    n %= c

print(cnt)