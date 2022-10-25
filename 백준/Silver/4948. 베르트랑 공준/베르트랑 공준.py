import math
list = []
def issosu(checknum):
    sq = int(math.sqrt(checknum))
    for num in range(2, sq+1):
        # 제곱근범위에서 나눠지면 소수가 아님
        if checknum % num == 0:
            return False
    return True



for checknum in range(2, 123456*2+1):
    if issosu(checknum):
        list.append(checknum)




while True:
    n = int(input())
    if n ==0:
        break
    elif n ==1:
        print(1)
    else:
        cnt = 0
        for one in list:
            if n < one <= n * 2:
                cnt += 1
        print(cnt)