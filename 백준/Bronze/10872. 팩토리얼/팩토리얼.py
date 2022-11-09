n = int(input())

num = n
def factorial(n,num):
    num -= 1
    if n ==0:
        return 1
    if num == 0:
        return n

    n = n * num


    return factorial(n, num)


print(factorial(n,num))