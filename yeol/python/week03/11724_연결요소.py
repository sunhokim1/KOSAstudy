from collections import deque

# 틀렸음 # 예제는 맞음 # 1~N 사이의 key값이 아닌 요소들이 존재.

N, M = map(int, input().split())  # 첫 줄: 정점 수 N, 간선 수 M
edges = [list(map(int, input().split())) for _ in range(M)]

graph = { }
for start,end in edges : 
  if start not in graph :
    graph[start] = []
  if end not in graph :
    graph[end] = []
  
  graph[start].append(end)
    
answer = [] 
stack = []
count = 0
for key, values in graph.items() :
  if stack == [] :
    stack.append(key)

  if stack[-1] == key :
    tmps = []
    flag = False
    for value in values : 
      
      if value not in answer :
        tmps.append(value)
        flag = True 
    if flag == False :
      count += 1
    key = stack.pop()
    answer.append(key)
    for value in tmps :
      stack.append(value)

print(count)