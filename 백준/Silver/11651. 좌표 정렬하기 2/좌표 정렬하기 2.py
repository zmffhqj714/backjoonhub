n = int(input())

list = []
for i in range(n):
    (a,b)= map(int,input().split())
    list.append((a,b))

list.sort( key = lambda x : (x[1],x[0]))


for x in list:
    print(x[0], x[1])