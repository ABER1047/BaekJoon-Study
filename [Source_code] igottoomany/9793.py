n = int(input())
arr = [0] * 76

while n > 0:
    a = input()
    l = a.split()
    arr[len(l)] += 1
    n -= 1

for i in range(0, 76):
    if arr[i] != 0:
        print(i, arr[i])
