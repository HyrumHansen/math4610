### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 4:

### Question 1:

Two Java classes were built. One calculates the absolute error of an approximation while the other calculates the relative error. 

1. **Relative Error:** Computes the relative error of an approximation. Details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/RelativeError.md).
2. **Absolute Error:** Computes the absolute error of an approximation. Details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/AbsoluteError.md).

### Question 3: 

A Java program was written to approximate a function's root using the fixed-point-iteration method. The method .fixedPointRoot() is contained in class FixedPointIteration. This function is not reliable for every function; the error increases for some. Only when |g'(x)| < 1 will the fixed-point iteration method converge to a root which can be proven via Taylor Series expansion.

click [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/FixedPointIteration.md) for details.

### Question 4:

Fixed point iteration was applied to the function f(x) = xe^{3x^2} - 7x. The algorithm did not return a solution. Because |g'(x)| > 1 at x = 0, we have to include  an appropriate value of *e* such that xNew = x0 - *e* * f(x).

