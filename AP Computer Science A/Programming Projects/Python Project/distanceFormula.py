import math

print("Welcome to the distance formula calculator!")
print("What is your x1?")
x1 = input()
print("What is your x2?")
x2 = input()
print("What is your y1?")
y1 = input()
print("What is your y2?")
y2 = input()
print("x1 and y1 will be considered 'A' and x2 and y2 will be considered 'B'")
if math.sqrt(float(x1) ** 2 + float(y1) ** 2) < math.sqrt(float(x2) ** 2 + float(y2) ** 2):
    print("A is closer to (0,0) than B is.")
else:
    if math.sqrt(float(x1) ** 2 + float(y1) ** 2) > math.sqrt(float(x2) ** 2 + float(y2) ** 2):
        print("B is closer to (0,0) than A is.")
    else:
        if math.sqrt(float(x1) ** 2 + float(y1) ** 2) == math.sqrt(float(x2) ** 2 + float(y2) ** 2):
            print("Both A and B are the same distance away from (0,0)")
