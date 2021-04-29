# DWAYNE FRASER

############## Problem 3. Duplicated Substrings ###############################

###################### PART A ################################################
# Finds Duplicated Substring of Length n
def find_dup_str(s,n):  
    i = 0 # Increment
    empty_string = ""

    # While Loop
    while True:
        # Slice
        sub_string = slice(i, i+n)
        sub_string = s[sub_string]
        # Remaining String
        remaining_string = slice(i+n, len(s))
        remaining_string = s[remaining_string]
        # Check for Duplicate String
        if sub_string in remaining_string:
            return sub_string
        i += 1
        
    return empty_string

s = "abcdefbcdgh"
n = 3

print("Duplicate String is: ", find_dup_str(s,n))

###################### PART B ################################################

# Find Longest Duplicated Substring
def find_max_dup(s):
    # set length of substring to the max length
    n = len(s)
    # set variables to empty
    empty_string = ""
    max_dup = ""
    
    # while Loop
    while True:
        # calls find duplicate substring function
        max_dup = find_dup_str(s, n)
        # returns if substring was found
        if max_dup != "":
            return max_dup
        # decrement the length of substring
        n -= 1
    # returns empty string if no substring was found
    return empty_string

s = "abcdefbcdgh"

print("Max Duplicate is: ", find_max_dup(s))