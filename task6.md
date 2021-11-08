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

There are a few possible reasons why Newton's method fails to converge for this function. First, f'(x) evaluates quite near to zero. Due to the finite precision of real number representation, the computer cannot accurately store the value and the results become garbage. In addition, the values x = 6 and x=-5 are very far from the roots in question. Newton's method requires initial guesses that are sufficiently close to a root in order to converge. 




