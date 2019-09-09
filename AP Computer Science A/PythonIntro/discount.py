print("Welcome to the discount after $2000 calculator!")
print("Enter the original bill amount:")
billAmount = input()
if float(billAmount) > 2000:
    print("Bill after discount: " + str(float(billAmount) * 0.85))
else:
    print("Bill after discount: " + billAmount)
