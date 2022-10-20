import math
import time
def issosu(checknum):
    if checknum ==1 :
        return False

    sq = int(math.sqrt(checknum))

    for num in range(2, sq + 1):
        # 제곱근범위에서 나눠지면 소수가 아님
        if checknum % num == 0:
            return False
    return True


m, n = map(int, input().split())

for checknum in range(m, n + 1):
    if issosu(checknum):
        print(checknum)