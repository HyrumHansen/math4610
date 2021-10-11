# Secant Method:

**Routine Name:** SecantMethod

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using the Secant method. 

**Input:** The .secantRoot() method in the SecantMethod class takes five arguments:
1. **FunctionObject f:** An object of class FunctionObject. This class contains a .functionValue(double x) method which returns the value of the function at x.
2. **double x0:** A lower bound on the interval for which we want to find a root.
3. **double x1:** An upper bound on the interval.
4. **double tolerance:** The while loop will terminate and output the approximate x-value if the error is less than the tolerance.
5. **double maxIterations:** The maximum number of iterations.

**Output:** The method returns a value of type double, which is the x-value of the approximated root.

**Usage:** After importing the NewtonsMethod class into your program you need to instantiate it and call the .secantRoot() method. Note that a FunctionObject is instantiated, then passed into the testObject.newtonsRoot() method as the function. Be sure to define this class with a .functionValue() method.

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        SecantMethod testObject = new SecantMethod();
        double result = testObject.secantRoot(function, -1, 1.1, 0.0001, 30);
        System.out.printf("\n\nRoot: %f", result);
    }
}
```

The output for the code above (which approximates the root of xe^{3x^2} - 7x) is shown below. The while loop does not continue until reaching the maximum iteration; rather, it terminates once the error is less than the tolerance (0.0001).

```java
 Error 1: 0.586299
 Error 2: 1.619374
 Error 3: 0.881131
 Error 4: 0.503317
 Error 5: 0.464616
 Error 6: 0.016057
 Error 7: 0.002814
 Error 8: 0.000000

 Root: -0.000000
```

**Implementation:**

```java
public class SecantMethod {
    public double secantRoot(FunctionObject f, double x0, double x1, double tolerance, double maxIterations) {

        // Initialize variables
        double error = 10 * tolerance;
        int iterations = 0;
        double xNew = 0;

        // The workhorse of the method
        while (error > tolerance && iterations < maxIterations) {
            iterations++;

            // Calculate the new X value for the new approximation
            // ---------------------------------------------------
            xNew = x1 - f.functionValue(x1) * ((x1 - x0) / (f.functionValue(x1) - f.functionValue(x0)));

            // Find its error using the difference between iterates
            // ----------------------------------------------------
            error = Math.abs(xNew - x0);

            // Print the error for the current iteration
            // -----------------------------------------
            System.out.printf("\n Error %s: %f", iterations, error);

            // Set the input value to the new approximation
            // --------------------------------------------
            x0 = x1;
            x1 = xNew;
        }
        return xNew;
    }
}

```

