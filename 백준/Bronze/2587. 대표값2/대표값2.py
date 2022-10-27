list = []



for _ in range(5):
    n = int(input())
    list.append(n)

list.sort()
# print(list)

len2 =len(list)

print(sum(list) // len2)
print(list[round(len2 // 2)])