n = int(input())

list = []
list2 = []
for i in range(n):
    list.append(input())
#중복제거
[list2.append(x) for x in list if x not in list2]
#길이순, 길이가 같으면 사전순
list2.sort()
list2.sort(key= lambda x : len(x))

for i in range (len(list2)):
    print(list2[i])