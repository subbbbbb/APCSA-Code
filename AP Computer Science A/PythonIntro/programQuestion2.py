import math

print("Welcome the King Arthur calculator:")
print("Enter the diameter")
d = input()
print("Enter the width")
w = input()
print("Enter the number of knights")
n = input()
if (int(d) * math.pi) / int(n) >= int(w):
    print("YES")
else:
    print("NO")
