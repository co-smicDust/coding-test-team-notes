from bisect import bisect_left, bisect_right

n, x = map(int, input().split())
array = list(map(int, input().split()))

count = bisect_right(array, x) - bisect_left(array, x)
if count == 0:
    count = -1

print(count)