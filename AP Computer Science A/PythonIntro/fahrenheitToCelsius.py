print("Welcome to the weather degree converter!")
print("Do you want fahrenheit to celsius[1] or celsius to fahrenheit[2]?")
userChoice = input()
if userChoice == "1":
    print("What is your degrees in fahrenheit?")
    dF = input()
    print(dF + " degrees fahrenheit in celsius is " + str((float(dF) - 32)*(5/9)) + " degrees")
elif userChoice == "2":
    print("What is your degrees in celsius?")
    dC = input()
    print(dC + " degrees celsius in fahrenheit is " + str((float(dC) * (9/5)) + 32) + "degrees")
else:
    print("You done goofed fam")
