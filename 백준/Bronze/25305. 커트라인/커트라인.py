list = []




n , cut = map(int,input().split())

score = map(int,input().split())

for i in score:
    list.append(i)

list.sort(reverse=True)


print(list[cut-1])