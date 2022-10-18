import time
from math import floor

import psutil
import os

for exec_num in range(0, 1):
    # Before code RAM usage
    pid = os.getpid()
    current_process = psutil.Process(pid)
    current_process_memory_usage_as_KB = current_process.memory_info()[0] / 2. ** 20
#  print(f"BEFORE CODE: Current memory KB   : {current_process_memory_usage_as_KB: 9.3f} KB")
start_time = time.time()
##########################################################################
# 시간:1초
# 공간 :256MB
# 자료형식: 연산
# 알고리즘: 탐색 30분에 푸는 습관
t = int(input())

count = 0
result = 0

a = map(int, input().split())

for num in a:
    for cnum in range(1, 1001):
            if num % cnum == 0:
              count += 1
    if count == 2:
        result += 1
    count = 0
print(result)



#########################################################################
print('------------------------------------------')
end_time = (time.time())
print('연산시간:', end_time - start_time, '최악의 경우의 수가 적은 빅오표기법이 나오는 걸로 사용하기')
X = [p for p in range(0, 9000000)]
# AFTER  code
pid = os.getpid()
current_process = psutil.Process(pid)
current_process_memory_usage_as_KB2 = current_process.memory_info()[0] / 2. ** 20
print(f"메모리사용량: Current memory KB: {current_process_memory_usage_as_KB2 - current_process_memory_usage_as_KB: 9.3f} KB")

del X
