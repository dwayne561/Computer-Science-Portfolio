# DWAYNE FRASER

############## Problem 4. Function Visualization ##############################

import math
import numpy as np
import matplotlib.pyplot as plt

# Defines Plot Function
def plot_function(fun_str, domain, ns):
    
    # Computes x-list
    interval = (domain[1] - domain[0]) / ns
    xs = []
    for i in range(ns):
        xs.append(domain[0] + interval * i)
        
    # Computes y-list
    ys = []
    for x in xs:
        y = eval(fun_str)
        ys.append(y)
        
    # Displays Values
    print("x            y")
    print("------------------")
    for i in range(ns):
        print('{:.3f}       {:.3f}'.format(xs[i],ys[i]))
        
    # Displays Graph
    plt.xlabel('X')
    plt.ylabel('y')
    plt.title(fun_str)
    plt.plot(xs, ys, color='blue', marker= 'o')
    plt.show()

# Gets User Input
fun_str = input('Enter function with variable x: ')
ns = int(input('Enter number of samples: '))
xmin = float(input('Enter xmin: '))
xmax = float(input('Enter xmax: '))
domain = xmin, xmax

plot_function(fun_str, domain, ns)