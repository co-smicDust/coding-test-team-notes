from collections import deque

n, m = map(int, input().split())

graph = []
for i in range(n):
  graph.append(list(map(int,input())))

def bfs(f, s):
  queue = deque()
  queue.append((f,s))

  def udlr(x, y):
    if x < 0 or x >= n or y < 0 or y >= m:
      return False
    if graph[x][y] == 1:
      queue.append((x, y))
      return True
  
  while queue:
    v = queue.popleft()

    i = v[0]
    j = v[1]
    
    if udlr(i - 1, j):
      graph[i - 1][j] = graph[i][j] + 1
    if udlr(i + 1, j):
      graph[i + 1][j] = graph[i][j] + 1
    if udlr(i, j - 1):
      graph[i][j - 1] = graph[i][j] + 1
    if udlr(i, j + 1):
      graph[i][j + 1] = graph[i][j] + 1

  print(graph[n - 1][m - 1])

bfs(0, 0)


