print("Welcome to the isThisALeapYear Calculator!")
print("Enter a year:")
yearEntered = input()
if int(yearEntered) % 4 == 0:
    print(yearEntered + " is a leap year!")
else:
    print(yearEntered + " is not a leap year.")
