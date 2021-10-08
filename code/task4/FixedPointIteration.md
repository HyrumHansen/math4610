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

The output for the code above (which approximates the root of 0.1x^2 - 7) is shown below.

```java
 Error 1: 2.975000
 Error 2: 0.587562
 Error 3: 0.256320
 Error 4: 0.103328
 Error 5: 0.043234
 Error 6: 0.017830
 Error 7: 0.007399
 Error 8: 0.003062
 Error 9: 0.001269
 Error 10: 0.000526

 Root: 7.070914
```

**Implementation:**

```java
import java.lang.Math;

public class FixedPointIteration {

    public double fixedPointRoot(FunctionObject f, double x0, double tolerance, double maxIterations) {

        // Initialize variables
        double error = 10000000;
        int iterations = 0;
        double xNew = 0;

        // The workhorse of the method
        while (error > tolerance && iterations < maxIterations) {
            iterations++;
            xNew = x0 - f.functionValue(x0);
            error = Math.abs(xNew - x0);
            System.out.printf("\n Error %s: %f", iterations, error);
            x0 = xNew;

        }

        return xNew;

    }
}
```

