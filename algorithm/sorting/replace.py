n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

def quick_sort(arr, order):
  # order가 0이면 asc, 1이면 desc
  if len(arr) <= 1:
    return arr
  pivot = arr[0]
  remain = arr[1:]

  if order == 0:
    left_side = [x for x in remain if x <= pivot]
    right_side = [x for x in remain if x > pivot]
    return quick_sort(left_side, 0) + [pivot] + quick_sort(right_side, 0)

  else:
    left_side = [x for x in remain if x > pivot]
    right_side = [x for x in remain if x <= pivot]
    return quick_sort(left_side, 1) + [pivot] + quick_sort(right_side, 1)
    
a = quick_sort(a, 0)
b = quick_sort(b, 1)

for i in range(k):
  if a[i] >= b[i]: break
  else: a[i], b[i] = b[i], a[i]

print(sum(x for x in a))