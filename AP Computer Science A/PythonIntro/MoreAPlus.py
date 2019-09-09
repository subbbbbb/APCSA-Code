print("Welcome to the moreAPlus calculator!")
print("Enter your string:")
string1 = input()
x = str(string1).count("aplus")
if x > 1:
    print("there is more than one aplus")
else:
    print("there is no aplus in this string")
