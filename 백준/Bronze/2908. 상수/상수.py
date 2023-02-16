n,m = map(int,input().split())

reversed_n = "".join(reversed(str(n)))
reversed_m = "".join(reversed(str(m)))

answer = 0
if reversed_n > reversed_m:
    answer = reversed_n
else:
    answer = reversed_m
print(answer)