# DWAYNE FRASER

import math
import matplotlib.pyplot as plt
import numpy as np

############## Problem 1. Quadratic Equations ####################################

# LOOP
while True:
    # GETS USER INPUT FOR: a,b,c
    print("Enter a:")
    a = input()
    # Will Exit Loop if user presses 'Enter'
    if not a:
        break
    print("Enter b:")
    b = input()
    
    print("Enter c:")
    c = input()
    
    a = float(a)
    
    b = float(b)
    
    c = float(c)
    
    # Calculates the discriminant
    discriminant = (b**2) - (4*a*c);
      
    # Computing Solutions
    if discriminant < 0:
        print("This equation has no real solutions")
        
        # Plotting Graph
        x = np.linspace(-10, 10, 150)                
        y = (a*x**2 + b*x + c);
        plt.plot(x,y)
        plt.grid(True)
        plt.axhline(0, color='black')
        plt.axvline(0, color='black')
        plt.show()
        
    elif discriminant == 0:
        x1 = (-b  + math.sqrt(discriminant))/(2*a)        
        print("One solution: ")
        print("x1 = ", x1)
        
        # Plotting Graph
        x = np.linspace(-10, 10, 150)                
        y = (a*x**2 + b*x + c);
        plt.plot(x,y)
        plt.grid(True)
        plt.axhline(0, color='black')
        plt.axvline(0, color='black')
        plt.show()
        
    elif discriminant > 0:
        x1 = (-b  + math.sqrt(discriminant))/(2*a)
        x2 = (-b  - math.sqrt(discriminant))/(2*a)
        
        print("Two solutions: ")
        print("x1 = ", x1)
        print("x2 = ", x2)
        
        # Plotting Graph
        x = np.linspace(-10, 10, 150)      
        y = (a*x**2 + b*x + c);        
        plt.plot(x,y)
        plt.grid(True)
        plt.axhline(0, color='black')
        plt.axvline(0, color='black')
        plt.show()
