print("Welcome to the Add, Subtract, Multiply Calculator!")
print("What is your first value?")
x = input()
print("What is your second value?")
y = input()
if float(x) > float(y):
    print(float(x) - float(y))
elif float(x) < float(y):
    print(float(y) - float(x))
else:
    print(float(x) * float(y))
