# Newton's Method:

**Routine Name:** NewtonsMethod

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using Newton's method. 

**Input:** The newtonRoot method in the NewtonsMethod class takes four arguments:
1. **FunctionObject f:** An object of class FunctionObject. This class contains a .functionValue(double x) method which returns the value of the function at x and a .derivativeValue(double x) method which returns the value of the function's derivative at x.
2. **double x0:** An initial guess at the root's location
3. **double tolerance:** The while loop will terminate and output the approximate x-value if the error is less than the tolerance.
4. **double maxIterations:** The maximum number of iterations.

**Output:** The method returns a value of type double, which is the x-value of the approximated root.

**Usage:** After importing the NewtonsMethod class into your program you need to instantiate it and call the .newtonsRoot() method. Note that a FunctionObject is instantiated, then passed into the testObject.newtonsRoot() method as the function. Be sure to define this class with .functionValue() AND .derivativeValue() methods.

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        NewtonsMethod testObject = new NewtonsMethod();
        double result = testObject.newtonsRoot(function, -1, 0.0001, 30);
        System.out.printf("\n\nRoot: %f", result);
    }
}
```

The output for the code above (which approximates the root of xe^{3x^2} - 7x) is shown below. The while loop does not continue until reaching the maximum iteration; rather, it terminates once the error is less than the tolerance (0.01).

```java
 Error 1: 0.097947
 Error 2: 0.066814
 Error 3: 0.026410
 Error 4: 0.003399
 Error 5: 0.000050

 Root: -0.805380
```

**Implementation:**

```java
public class NewtonsMethod {
    public double newtonsRoot(FunctionObject f, double x0, double tolerance, double maxIterations) {

        // Initialize variables
        double error = 10 * tolerance;
        int iterations = 0;
        double xNew = 0;

        // The workhorse of the method
        while (error > tolerance && iterations < maxIterations) {
            iterations++;

            // Calculate the new X value for the new approximation
            // ---------------------------------------------------
            xNew = x0 - f.functionValue(x0)/f.derivativeValue(x0);

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

