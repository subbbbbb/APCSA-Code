import math  # used for pi
print("Welcome to the cone volume calculator!")
print("What is your radius?")
radius = input()
print("What is your height?")
height = input()
print("The volume of your cone is " + str((1/3)*math.pi*(float(radius)**2)*float(height)))
