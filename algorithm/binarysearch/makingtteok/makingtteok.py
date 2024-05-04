def makingtteok(start, end, arr, req, l):
    h = (end - start) // 2 + start
    result = 0
    
    for i in arr:
        ih = i - h
        if ih >= 0:
            result += ih
          
    if result >= req: 
        l.append(h)
        if h + 1 >= end: return 1
        makingtteok(h + 1, end, arr, req, l)
    else:
        makingtteok(start, h - 1, arr, req, l)
  

n, m = map(int, input().split())
tteok = list(map(int, input().split()))
maxh = []

makingtteok(0, max(tteok), tteok, m, maxh)
print(max(maxh))