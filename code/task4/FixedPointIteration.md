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
        double result = testObject.fixedPointRoot(function, 0.5, 0.001, 30);
        System.out.println(result);
    }
}
```

For the approximation above, the following is output:

```java
0.03448275862068974
```

**Implementation:**

```java
import java.lang.Math;

public class RelError {
    public double calcRelError(double x, double y){
        return Math.abs((x - y) / y);
    }
}
```

