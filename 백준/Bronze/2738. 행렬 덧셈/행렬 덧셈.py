n,m  = map(int, input().split())

a = []
b = []
result =[]

for i in range(n):
    a.append(list(map(int, input().split())))

for i in range(n):
    b.append(list(map(int, input().split())))



for i in range(n):
    temp = [] 
    for j in range(m):
        temp.append(a[i][j]+b[i][j])
    result.append(temp)

for i in result:
    f = ' '.join(str(s) for s in i)
    print(f)