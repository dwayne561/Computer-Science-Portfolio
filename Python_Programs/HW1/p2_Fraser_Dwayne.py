# DWAYNE FRASER

############## Problem 2. Pythagorean Numbers ####################################
# Function to find all possible pythagorean triples of given value n
def find_Pythagorean(n):
    n = int(n)
    # For a in range n
    for a in range(n):
        # For b in range n
        for b in range(n):
            # For c in range n
            for c in range(n):
                # Displays all possible Pythagorean triples (a,b,c), where 0<a,b,c<=n.
                if (a != 0 and b != 0 and c != 0) and a ** 2 + b ** 2 == c ** 2:
                    print(a, b, c)

find_Pythagorean(25)