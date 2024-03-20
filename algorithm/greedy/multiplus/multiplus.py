s = input('공백없이 자연수 입력: ')

result = int(s[0])

for i in range(1, len(s)):
  num = int(s[i])
  if result <= 1 or num <= 1:
    result += num
  else:
    result *= num

print(result)