import time
import sys
from math import floor

import psutil
import os

##########################################################################
# 시간:1초
# 공간 :256MB
# 자료형식: 연산
# 알고리즘: 탐색 30분에 푸는 습관

##* input의 시간 1.6 -> 2.8
starttime2 = time.time()

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

print(time.time() - starttime2)