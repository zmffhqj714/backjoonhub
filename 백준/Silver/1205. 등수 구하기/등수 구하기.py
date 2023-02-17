n,new , p = map(int,input().split())
answer = 1
if n>0:
    rank = list(map(int,input().split()))
    if  p <= len(rank) and new <= min(rank) :
        answer = -1
    else:
        rank.append(new)
        sortedrank = sorted(rank, reverse=True)
        answer = sortedrank.index(new) + 1



print(answer)