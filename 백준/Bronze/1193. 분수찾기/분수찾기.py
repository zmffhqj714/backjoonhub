n = int(input())

line = 0
end = 0

while(end < n):
    line +=1
    end += line

diff = end - n

if line%2==0:
     bunja = line - diff
     bunmo = 1+diff

else:
    bunja = 1 + diff
    bunmo = line-diff



print("%d/%d"%(bunja,bunmo))