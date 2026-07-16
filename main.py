import sys
n = int(input())
lis = []
for i in range(n):
    color = input()
    lis.append(color)
visited = []
for i in range(n):
    visited.append(False)
for i in range(n):
    if(visited[i]):
        continue
    count=0
    for j in range(n):
        if(lis[i]==lis[j]):
            count+=1
            visited[j]=True
    if(count%2!=0):
        print(lis[i])
        sys.exit(0)
print("All are Even")