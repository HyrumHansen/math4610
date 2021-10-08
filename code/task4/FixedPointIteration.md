# Fixed Point Iteration:

**Routine Name:** FixedPointIteration

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using the fixed point iteration method. 

**Input:** The fixedPointRoot method in the FixedPointIteration class takes four arguments:
1. **FunctionObject f:** This parameter must be an object of class FunctionObject. This class contains a .functionValue(double x) method which returns the value of the function at x.

**Output:** The method returns a value of type double.

**Usage:** After importing the RelError class into your program you need to instantiate it and call the calcRelError() method. For example,

```java
public class test {
    public static void main(String[] args) {
        RelError obj = new RelError();
        System.out.println(obj.calcRelError(9, 8.7))
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

