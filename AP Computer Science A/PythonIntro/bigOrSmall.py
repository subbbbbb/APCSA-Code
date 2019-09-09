print("Welcome to the big or small calculator!")
print("What is your first value?")
x = input()
print("What is your second value?")
y = input()
if float(x) > float(y):
    print("The first value is greater.")
elif float(x) < float(y):
    print("The second value is greater.")
else:
    print("aplus - they are the same")
    