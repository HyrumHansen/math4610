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

** Newton's Method **
	It took 4 iterations to approximate this root with newton's method.
	Approximate Root: 0.483611
```

All methods performed as expected. The bisection method was slow but reliable, the secant method and Newton's method quickly found the location of the root, and fixed point iteration was so slow that it reached the maximum number of iterations before reducing error below the given tolerance (0.0001).
