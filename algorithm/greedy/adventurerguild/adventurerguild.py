n = int(input('모험가 수: '))
fear_rate = list(map(int, input('공포도: ').split()))

fear_rate.sort()
guild = 0
personnel = 0

for i in fear_rate:
  personnel += 1
  if personnel >= i:
    guild += 1
    personnel = 0

print(guild)