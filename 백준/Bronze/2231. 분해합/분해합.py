t = int(input())

answer = 0
for i in range(1, t):
    make = i

    myinsert = make

    for e in str(make):
        myinsert += int(e)

    if myinsert == t:
        answer = make
        break

print(answer)