import time
import sys
num = int(sys.stdin.readline())

div = 2 
while num != 1:
    if num % div  ==0: 
        print(div )
        num //= div
    else:
        div += 1