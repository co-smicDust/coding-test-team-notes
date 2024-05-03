n,m = map(int,input().split())

graph = []
for i in range(n):
  graph.append(list(map(int,input())))

def dfs(x, y):
  # 지정 범위에서 벗어나면 바로 리턴
  if x < 0 or x >= n or y < 0 or y >= m:
    return False

  # 현재 노드를 아직 방문하지 않았다면
  if graph[x][y] == 0:
    # 방문 처리
    graph[x][y] = 1
    # 현재 노드 기준 상하좌우 재귀 방문
    dfs(x - 1, y)
    dfs(x + 1, y)
    dfs(x, y - 1)
    dfs(x, y + 1)
    return True
  return False

result = 0

for x in range(n):
  for y in range(m):
    if dfs(x, y) == True:
      result += 1

print(result)