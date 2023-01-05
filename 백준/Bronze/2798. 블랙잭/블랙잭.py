from itertools import  combinations
n , max = map(int , input().split())
num = map(int , input().split())

comb = list(combinations(num,3))

answer = 0
for  idx, i in enumerate(comb):
    temp = sum(comb[idx][:3])
    if  temp <= max and answer < temp:
        answer = temp
print(answer)