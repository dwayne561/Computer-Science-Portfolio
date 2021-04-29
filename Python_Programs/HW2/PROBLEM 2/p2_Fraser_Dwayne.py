# DWAYNE FRASER
# PROBLEM 2

############################ PART A ##########################################
print("PART A")
n = 100
# The indexes start at 0 so the actual register for the value 100 is index 101
print([(a, b, c) for a in range(1, 1 + n) for b in range(1, 1 + n)
              for c in range(1, 1 + n) if c * c == a * a + b * b])

############################ PART B ##########################################
print("\nPART B")
string = []
print('Enter a string: ') # GETS USER INPUT
first_string = input()
string.append(first_string) # APPENDS TO LIST

answer = 'Y'

while (answer == 'Y'): # LOOP
    print('Do you want to input more? (Y or N)') # GETS USER INPUT
    answer = input()

    if (answer == 'Y'):
        print('Enter next string: ') # GETS USER INPUT
        next_string = input()
        string.append(next_string) # APPENDS TO LIST
    if (answer == 'N'):
        break

for i in string: # Traverse string elements
    if len(i) > 3:
        print(len(i), i.upper()) # PRINTS
        
######################### PART C #############################################
print("\nPART C")
fullname = [] #LIST DECLARATIONS
nextfullname = []
names_list = []
new_names_list = []

print('Enter first name: ') # GETS USER INPUT
first_name = input()

print('Enter last name: ') # GETS USER INPUT
last_name = input()

print()
fullname = (first_name + " " + last_name)
names_list.append(fullname) # APPENDS TO LIST

fullname = (last_name + " " + first_name)
new_names_list.append(fullname) # APPENDS TO LIST

print(names_list[0]) # PRINTS
print(new_names_list[0])

answer = 'Y'

while (answer == 'Y'): # LOOP
    print('\nDo you want to input more? (Y or N)') # GETS USER INPUT
    answer = input()

    if (answer == 'Y'):        
        print('Enter first name: ') # GETS USER INPUT
        next_first_name = input()
        print('Enter last name: ') # GETS USER INPUT
        next_last_name = input()
        
        nextfullname = next_first_name + " " + next_last_name 
        names_list.append(nextfullname) # APPENDS TO LIST
        
        nextfullname = next_last_name + " " + next_first_name
        new_names_list.append(nextfullname) # APPENDS TO LIST
        
    if (answer == 'N'):
        break

print("\nYour old names list is:")
position = 0
while position < len(names_list): # LOOP
    print(names_list[position], end=' ') # PRINTS OLD NAME LIST
    position = position + 1

print("\nYour new names list is:")
position = 0
while position < len(new_names_list): # LOOP
    print(new_names_list[position], end=' ') # PRINTS NEW NAME LIST
    position = position + 1
print()

########################### PART D ###########################################
print("\nPART D")
def concatenate(separator, *arguments):
    """ takes as parameter a string and an arbitrary
    number of additional arguments, all strings, and that returns the 
    concatenation of all given strings using the given separator.
    """    
    string_sum = []
    
    if len(arguments) == 1: # IF LENGTH OF ARGUEMENT EQUAL TO 1
        string_sum.append(arguments[0]) # APPEND TO STRING SUM
        return string_sum
    else:
        position = 0
        while position < len(arguments): # LOOP
            x = arguments[position] + separator # ADDS SEPARATOR
            string_sum.append(x)
            position = position + 1            
    return string_sum

print(concatenate(' and ',"Bonny","Clyde"))
print(concatenate(':',"one","two","three"))              
print(concatenate('and',"single"))