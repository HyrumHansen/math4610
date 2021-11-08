# Four Methods:

**Routine Name:** Main

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This script implements four root approximation methods for a user-defined function. 

**Input:** This program requires familiarity with the four following packages. Read the documentation for appropriate implementation.
1. [Bisection Method](https://github.com/HyrumHansen/math4610/blob/main/code/task4/BisectionMethod.md)
2. [Fixed Point Iteration](https://github.com/HyrumHansen/math4610/blob/main/code/task4/FixedPointIteration.md)
3. [Secant Method](https://github.com/HyrumHansen/math4610/blob/main/code/task5/SecantMethod.md)
4. [Newton's Method](https://github.com/HyrumHansen/math4610/blob/main/code/task5/NewtonsMethod.md)

**Output:** The method prints the results from the test

**Usage:** Pass the desired values into the functions.

**Implementation:**

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        // BISECTION METHOD:
        //------------------
        BisectionMethod testObject = new BisectionMethod();

        double result = testObject.bisectionRoot(function, -0.25, 0.5, 0.0001, 30);
        System.out.println("\n** Bisection Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with the bisection method.\n",
                testObject.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result);

        // FIXED POINT ITERATION:
        //-----------------------
        FixedPointIteration testObject2 = new FixedPointIteration();

        double result2 = testObject2.fixedPointRoot(function, 0.3, 0.0001, 30);
        System.out.println("\n\n** Fixed Point Iteration Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with fixed point iteration.\n",
                testObject2.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result2);

        // SECANT METHOD:
        //-----------------------
        SecantMethod testObject3 = new SecantMethod();

        double result3 = testObject3.secantRoot(function, -0.25, 0.5,  0.0001, 30);
        System.out.println("\n\n** Secant Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with the secant method.\n",
                testObject3.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result3);

        // NEWTON METHOD:
        //-----------------------
        NewtonsMethod testObject4 = new NewtonsMethod();

        double result4 = testObject4.newtonsRoot(function, 0.3,  0.0001, 30);
        System.out.println("\n\n** Newton's Method **");
        System.out.printf("\tIt took %d iterations to approximate this root with newton's method.\n",
                testObject4.getNumIterations());
        System.out.printf("\tApproximate Root: %f", result4);
    }
}

```

output:

```
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

