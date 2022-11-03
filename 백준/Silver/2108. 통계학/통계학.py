import sys
def stastics4(list):
    list2 = [i for i in list]

    print(round(sum(list) / len(list)))

    list2.sort()

    print(list2[len(list2) // 2])

    m = max(vlist)

    maxcnt = vlist.count(m)

    if maxcnt == 1:
        # 1개 최빈값 1/1/1/1
        maxlist = [i for i, v in enumerate(vlist) if m == v]

        if len(maxlist) == len(list):
            get = list[0]+4000
        # 1개 최빈값 3한개 일때
        else:
            # print(max(vlist),66)
            get = vlist.index(max(vlist))




    else:
        # 여러개 최빈값의 두번째로 작은 값

        maxlist = [i for i, v in enumerate(vlist) if m == v]

        mini = min(maxlist)
        for i in maxlist:
            if i > mini:
                get = i  # 2번째 값 나옴
                break

    # print(get,555)

    findvalue = get - 4000

    # print(findvalue)
    for i in list:
        if i == findvalue:
            print(i)
            break

    print(max(list) - min(list))


list = []

vlist = [0] * 8001
for _ in range(int(sys.stdin.readline())):
    one = int(sys.stdin.readline())
    list.append(one)
    vlist[one + 4000] += 1

stastics4(list)