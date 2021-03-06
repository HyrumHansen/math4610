# Fixed Point Iteration:

**Routine Name:** FixedPointIteration

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using the fixed point iteration method. 

**Input:** The fixedPointRoot method in the FixedPointIteration class takes four arguments:
1. **FunctionObject f:** An object of class FunctionObject. This class contains a .functionValue(double x) method which returns the value of the function at x.
2. **double x0:** An initial "guess" at the function's root. 
3. **double tolerance:** The while loop will terminate and output the approximate x-value if the error is less than the tolerance.
4. **double maxIterations:** The maximum number of iterations.

**Output:** The method returns a value of type double, which is the x-value of the approximated root.

**Usage:** After importing the FixedPointIteration class into your program you need to instantiate it and call the .fixedPointRoot() method. Note that a FunctionObject is instantiated, then passed into the testObject.fixedPointRoot() method as the function. Be sure to define this class with a .functionValue() method.

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        FixedPointIteration testObject = new FixedPointIteration();
        double result = testObject.fixedPointRoot(function, 4.5, 0.001, 30);
        System.out.printf("\n\nRoot: %f", result);
    }
}
```

The output for the code above (which approximates the root of 0.1x^2 - 7) is shown below. The while loop does not continue until reaching the maximum iteration; rather, it terminates once the error is less than the tolerance (0.0001).

```java
 Error 1: 4.975000
 Error 2: 1.977562
 Error 3: 1.378843
...
 Error 20: 0.001577
 Error 21: 0.001062
 Error 22: 0.000715

Root: 8.366313
```

**Implementation:**

```java
import java.lang.Math;

public class FixedPointIteration {

    public double fixedPointRoot(FunctionObject f, double x0, double tolerance, double maxIterations) {

        // Initialize variables
        double error = 10 * tolerance;
        int iterations = 0;
        double xNew = 0;

        // The workhorse of the method
        while (error > tolerance && iterations < maxIterations) {
            iterations++;

            // Calculate the new X value for the new approximation
            // ---------------------------------------------------
            xNew = x0 - f.functionValue(x0);
            
            // Find its error using the difference between iterates
            // ----------------------------------------------------
            error = Math.abs(xNew - x0);
            
            // Print the error for the current iteration
            // -----------------------------------------
            System.out.printf("\n Error %s: %f", iterations, error);
            
            // Set the input value to the new approximation
            // --------------------------------------------
            x0 = xNew;

        }

        return xNew;

    }
}
```

