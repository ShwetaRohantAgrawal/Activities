from email import message


name = input("Enter your name :")
age = input("Enter your age :")
years = 100 - int(age)
yearsToGo = 2022+years

print("name:" +name)
print("Age:" +age)
message ="You will turn 100 years old in {}"
print(message.format(yearsToGo))