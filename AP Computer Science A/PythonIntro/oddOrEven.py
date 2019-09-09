print("Welcome to the odd or even calculator!")
print("Enter a number:")
numEntered = input()
if int(numEntered) % 2 == 0:
    print(numEntered + " is an even number")
else:
    print(numEntered + " is an odd number")
