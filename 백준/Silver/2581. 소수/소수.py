import sys


sosulist = []

def issosu():
    m = int(sys.stdin.readline())
    n = int(sys.stdin.readline())

    cnt = 0
    for checknum in range(m, n+1):
        for num in range(2,10000):
            if checknum % num == 0:
                cnt += 1
                if cnt > 1:
                    break
        if cnt == 1:
            sosulist.append(checknum)

        cnt = 0

issosu()



sosulist.sort()
if len(sosulist) > 0:
    print(sum(sosulist))
    print(min(sosulist))

else:
    print(-1)

