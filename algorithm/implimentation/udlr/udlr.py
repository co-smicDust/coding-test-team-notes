# n, plans 입력받기
n = int(input('공간의 크기: '))
plans = input('여행 계획: ').split()

x, y = 1, 1

# up, down, left, right
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
drt = ["U", "D", "L", "R"]

for plan in plans:
  # 이동 후 좌표 구하기
  for i in range(len(drt)):
    if plan == drt[i]:
      nx = x + dx[i]
      ny = y + dy[i]
      
  # 공간을 벗어나는 경우 무시
  if nx < 1 or ny < 1 or nx > n or ny > n:
    continue
  # 이동 수행
  x, y = nx, ny

print(x, y)