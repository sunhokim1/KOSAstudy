import sys
N, M = map(int, input().split())  # 첫 줄: 정점 수 N, 간선 수 M
A = [list(map(int, input().split())) for _ in range(M)]

# dfs 함수
def dfs(graph, v, visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

graph = [[] for _ in range(n+1)]
for u,v in A:
  graph[u].append(v)
  graph[v].append(u)

count = 0 # 연결 노드의 수
visited = [False] * (n+1)
count = -1
for i in range(0, n+1):
    if not visited[i]:
        dfs(graph, i, visited)
        count += 1
print(count)