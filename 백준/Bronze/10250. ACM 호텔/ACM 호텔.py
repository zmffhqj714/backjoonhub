num = int(input())


for i in range(num):
    h, w, n = map(int, input().split())


    ch = n%h
    if ch == 0:
        ch = h

    elif h > n:
        ch = ch
    elif n < h:
        ch = n

    ho = n/h
    if n <=h:
        ho = 1
    elif n%h ==0:
        ho = int(ho)
    else:
        ho = int(ho) + 1


    if ho <10:
        ho = "0"+str(int(ho))





    #print(ch)
    #print(ho)
    print(str(ch)+str(ho))