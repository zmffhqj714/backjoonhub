n = int(input())


member = []
for i in range(n):
    (age,name) = input().split()


    member.append((age,name))

member.sort( key = lambda x : int((x[0])))

for one in member:
    print(one[0],one[1])