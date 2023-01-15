elements = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0

for number in elements:
  sum += int(number)

print(sum)