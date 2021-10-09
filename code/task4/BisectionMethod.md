# Bisection Method:

**Routine Name:** BisectionMethod

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using the bisection method. 

**Input:** The fixedPointRoot method in the FixedPointIteration class takes five arguments:
1. **FunctionObject f:** An object of class FunctionObject. This class contains a .functionValue(double x) method which returns the value of the function at x.
2. **double a:** A lower bound for the interval.
3. **double b:** An upper bound for the interval
4. **double tolerance:** The while loop will terminate and output the approximate x-value if the error is less than the tolerance.
5. **double maxIterations:** The maximum number of iterations.

**Output:** The method returns a value of type double, which is the x-value of the approximated root.

**Usage:** After importing the BisectionMethod class into your program you need to instantiate it and call the .bisectionRoor() method. Note that a FunctionObject is instantiated, then passed into the testObject.bisectionRoot() method as the function. Be sure to define this class with a .functionValue() method.

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        BisectionMethod testObject = new BisectionMethod();
        double result = testObject.bisectionRoot(function, -4, 5, 0.01, 30);
        System.out.printf("\n\nRoot: %f", result);
    }
}
```

The output for the code above (which approximates the root of xe^{3x^2} - 7x) is shown below. The while loop does not continue until reaching the maximum iteration; rather, it terminates once the error is less than the tolerance (0.01).

```java
Error 1: 4.500000
Error 2: 2.250000
Error 3: 1.125000
Error 4: 0.562500
Error 5: 0.281250
Error 6: 0.140625
Error 7: 0.070313
Error 8: 0.035156
Error 9: 0.017578
Error 10: 0.008789

Root: 0.807617
```

**Implementation:**

```java
public class BisectionMethod {
    public double bisectionRoot(FunctionObject f, double a, double b, double tolerance, int maxiteration){

        // Initialize parameters
        double c = 0;

        // Check the endpoints
        if(f.functionValue(a) == 0) return a;
        if(f.functionValue(b) == 0) return b;

        // Check for a root on the interval [a, b]
        if(f.functionValue(a) * f.functionValue(b) >= 0) System.exit(0);

        // Perform the iterations
        double error = 10 * tolerance;
        int iteration = 0;

        while(error > tolerance && iteration < maxiteration){
            iteration++;
            c = 0.5 * (a + b);

            // Compute sign change value
            double val = f.functionValue(a) * f.functionValue(c);

            // Reassign the endpoint based on root location
            if(val < 0){
                b = c;
            } else {
                a = c;
            }

            error = b - a;
            System.out.printf("\nError %s: %f", iteration, error);

        // Return midpoint

        }
    return c;
    }
}

```

