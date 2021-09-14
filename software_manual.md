# Math 4610 Software Manual

### Task 2:

#### The First One

This program is a hello world style program that outputs a quote from Monty Python.

[Hello World]()

#### The Approximator

This simple program approximates the value of f''(x) = -cos(x) at x = 2. Using h values that range from 1 to 10e-16, the main method returns a table of values. 
Column 1 gives the h-value, column 2 gives the value of -cos(2), column 3 gives the approximate value (obtained using the central difference approximation) and 
column 4 provides the error.

[The Approximator](code/task2/approximator.java)

#### The Plot Generator

This program uses the output from The Approximator to generate a graph of the logged h value vs the logged error with Python. The purpose of this graph is to demonstrate the
disparity between the expected error and the actual error. We expect smaller values of h to result in higher accuracy, which is true up to a threshold. Around 10e-5 
error sharply increases due to computational limitations. The program also calculates the slope of the line for the first 6 values of h, which is about 1.99 suggesting a 
second order approximation.

[The Plot Generator](code/task2/plot.py)
