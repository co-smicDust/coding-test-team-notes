# 나이트의 현위치 입력
cdn = list(input("나이트 현위치 입력: "))
x = ord(cdn[0]) - ord('a') + 1
y = int(cdn[1])

# 경우의 수
cnt = 0

# 이동할 수 있는 8가지 방향
drt = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (-1, 2), (1, -2), (-1, -2)]

# 경우의 수 세기
for d in drt:
  next_x = x + d[0]
  next_y = y + d[1]
  if next_x < 1 or next_x > 8 or next_y < 1 or next_y > 8:
    continue
  cnt += 1

print(cnt)