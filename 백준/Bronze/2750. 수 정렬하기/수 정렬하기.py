num = int(input())




list  = []
for i in range(0,num):
    subnum = int(input())
    list.append(subnum)


    sortedlist = sorted(list)

for i in range(0,num):
    print(sortedlist[i])