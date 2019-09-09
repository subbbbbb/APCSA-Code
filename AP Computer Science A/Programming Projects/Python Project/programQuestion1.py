print("Welcome to the question1 calculator")
print("Enter your number of miles from the capital:")
numMiles = input()
print("Enter the number of students participating in the parade:")
numStudents = input()
print("Enter the temperature:")
temp = input()
if int(numMiles) >= 0 and int(numMiles) <= 10000:
    print(int(numMiles) * 2)
