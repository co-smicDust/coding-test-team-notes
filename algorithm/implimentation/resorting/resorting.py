s = list(input("문자열 입력: "))

str = []
num = 0
cnt = False

for s in s:
  if s.isalpha(): str.append(s)
  else:
    num += int(s)
    cnt = True

str.sort()
print("".join(str), end = "")

if cnt: print(num)






