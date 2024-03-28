# n 입력
n = int(input('0 <= 정수 <= 23: '))

# 경우의 수
cnt = 0

# h(시), m(분), s(초)
for h in range(n + 1):
  for m in range(60):
    for s in range(60):
      if '3' in str(h) + str(m) + str(s):
        cnt += 1

print(cnt)
