### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 6:

### Question 1:

A Java program was written which implemented four methods to approximate the root nearest to zero for the given function. The program may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task6/FourMethods.md). Given below is the program's output:

```java
** Bisection Method **
	It took 13 iterations to approximate this root with the bisection method.
	Approximate Root: 0.483612

** Fixed Point Iteration Method **
	It took 30 iterations to approximate this root with fixed point iteration.
	Approximate Root: 0.482302

** Secant Method **
	It took 5 iterations to approximate this root with the secant method.
	Approximate Root: 0.483611

** Newtons Method **
	It took 4 iterations to approximate this root with newton's method.
	Approximate Root: 0.483611
```

All methods performed as expected. The bisection method was slow but reliable, the secant method and Newton's method quickly found the location of the root, and fixed point iteration was so slow that it reached the maximum number of iterations before reducing error below the given tolerance (0.0001).


### Question 2:

Newton's method failed to converge for the points x0 = -5 and x0 = 6. Code chunks are given for the input and output of this question.

Input: x0 = 6:
```java
	NewtonsMethod testObject4 = new NewtonsMethod();

        double result4 = testObject4.newtonsRoot(function, 6,  0.0001, 30);
        System.out.println("\n\n** Newton's Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with newton's method.\n",
                testObject4.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result4);
```

Output:
```java
 Error 1: 14916475432423.209000
 Error 2: Infinity
 Error 3: NaN
```

Input: x0 = -5
```java
	NewtonsMethod testObject4 = new NewtonsMethod();

        double result4 = testObject4.newtonsRoot(function, -5,  0.0001, 30);
        System.out.println("\n\n** Newton's Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with newton's method.\n",
                testObject4.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result4);
```

Output:
```java
 Error 1: 316985795.086903
 Error 2: Infinity
 Error 3: NaN
```

There are a few possible reasons why Newton's method fails to converge for this function. First, f'(x) evaluates quite near to zero. Due to the finite precision of real number representation, the computer cannot accurately store the value and the results become garbage. In addition, the values x = 6 and x=-5 are very far from the roots in question. Newton's method requires initial guesses that are sufficiently close to a root in order to converge, so it is not altogether surprising that Newton's method did not converge here.

### Question 3: 

A hybrid bisection-newton method was written in python to compute the root of the given function. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task5/HybridMethod.md). Given the interval [-5,6], the method was able to find the root. Example output is given below:

```python
** Hybrid Method (Bisection-Newton)**
0.48361069860654926
```

### Question 4:

An attempt was made to write a hybrid secant-bisection method the method could only find roots if the given interval was close enough to a root. Otherwise it would converge to either extrama on the interval. The code is given below:

```python
import numpy as np


def function(x):
    return np.exp(-np.power(x, 2)) * np.sin((4 * np.power(x, 2)) - 1) + 0.051


def derivative(x):
    return -2 * x * np.exp(-np.power(x, 2)) * (np.sin((4 * np.power(x, 2)) - 1) - 4 * np.cos((4 * np.power(x, 2)) - 1))


def hybridMethod(x0, x1, tolerance, maxIteration):
    count = 1
    error1 = 10 * tolerance
    error2 = 10 * tolerance
    xMid = x1
    xLow = x0

    while error1 > tolerance and count < maxIteration:

        # Create a couple variables to keep the inputs pure
        count += 1

        # Compute an iteration of secant method
        xNew = xMid - function(xMid) * ((xMid - xLow) / (function(xMid) - function(xLow)))
        error1 = np.abs(xNew - xLow)

        if error1 < np.abs(x1 - x0):
            xLow = xMid
            xMid = xNew

        print("Post-Secant Error is:" + str(error1))

        if error2 < error1:
            print("Begin Bisection...")

            for i in range(3):
                midpoint = 0.5 * (xMid + xLow)
                value = function(xLow) * function(midpoint)

                if value < 0:
                    xLow = midpoint
                else:
                    xMid = midpoint
                if value == 0:
                    return function(midpoint)

            error2 = np.abs(xMid - xLow)

            print("Post-Bisection Error:" + str(error2))


    return xMid


print("** Hybrid Method (Bisection-Newton)**")
print(hybridMethod(-5, 6, 0.00001, 30))

```

### Question 6:

It seems like the majority of methods for finding multiple roots require the use of complex numbers. The Durand-Kerner method is used to find the roots of polynomials. As far as simpler methods are concerned, an adaptation for Newton's method can be done but it requries the user provide a set of intervals that each contain a root.

### Source:

[https://en.wikipedia.org/wiki/Secant_method](https://en.wikipedia.org/wiki/Secant_method)




