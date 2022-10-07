t = int(input())
list = [[0 for col in range(15)] for row in range(15)]


for floor in range(15):
    list[floor][0] = 1
    for ho in range(15):
        list[0][ho] = ho+1


for floor in range(1,15):
    for ho in range(1,15):
        list[floor][ho] = list[floor][ho-1]+list[floor-1][ho]



for i in range(t):
    k = int(input())
    n = int(input())




    print(list[k][n-1])