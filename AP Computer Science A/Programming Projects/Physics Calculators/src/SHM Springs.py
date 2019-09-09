print("Are you using springs or pendulums?")  # intro-project
sOrp = input()
if sOrp == "s":
    print("What is your mass value?")
    mass = input()
    print("What is your k value?")
    k = input()
    print("Period is:")
    print(2*3.14*(int(mass)/int(k))**1/2)
elif sOrp == "p":
    print("What is your L value?")
    l = input()
    print("Period is:")
    print(2*3.14*(int(l)/int(9.8))**1/2)


