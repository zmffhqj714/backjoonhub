def issosu(n1):
    if n1 == 1:
        return False
    for num in range(2, int(n1**0.5)+1):
        if n1 % num == 0:
            return False
    return True


for _ in range(int(input())):
    n = int(input())
    n1 = n//2
    n2 = n1
    check = 0
    while 0<n1:

        if issosu(n1) and issosu(n2):
            print(n1,n2)
            break
        else:
            n1 -= 1
            n2 += 1