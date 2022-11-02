import sys
def counting_sort():
    n = int(sys.stdin.readline())
    countnum = [0] * 10001



    for i in range(n):
        countnum[int(sys.stdin.readline())] += 1

    for i in range(len(countnum)):
            for _ in range(countnum[i]):
                print(i)



counting_sort()