import sys
list = [int(sys.stdin.readline()) for _ in range(int(input()))]


for i in sorted(list):
    print(i)
