firstList = ["yea", "oh", "rekt"]  # making lists (basically an arrayList from Java)

print(firstList)

print(firstList[2])  # finds the second item (basically .get() from java)

firstList[2] = "shreya"  # changes the value at specified index
print(firstList)

print(len(firstList))  # returns length

# miscellaneous other methods for lists
'''
append()	Adds an element at the end of the list
clear()	Removes all the elements from the list
copy()	Returns a copy of the list
count()	Returns the number of elements with the specified value
extend()	Add the elements of a list (or any iterable), to the end of the current list
index()	Returns the index of the first element with the specified value
insert()	Adds an element at the specified position
pop()	Removes the element at the specified position
remove()	Removes the item with the specified value
reverse()	Reverses the order of the list
sort()	Sorts the list
'''


if "yea" in firstList:
    print("oh yeah yeah, oh yeah yeah yeah yeah")  # checks if specified string is anywhere in the list





