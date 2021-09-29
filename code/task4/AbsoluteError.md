# Absolute Error:

**Routine Name:** AbsError

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will compute the absolute error for an approximation. The absolute error is the difference between the true value and the approximating value.

**Input:** The calcAbsError method contained in the AbsError class takes two values of type double. The first value, x, is the approximating value and the second value, y, is the true value.

**Output:** The method returns a value of type double.

**Usage:** After importing the AbsError class into your program you need to instantiate it and call the calcAbsError() method. For example,

```java
public class test {
    public static void main(String[] args) {
        AbsError obj = new AbsError();
        System.out.println(obj.calcAbsError(9, 8.7));
    }
}
```

For the approximation above, the following is output:

```java
0.3000000000000007
```

**Implementation:**

```java
import java.lang.Math;

public class AbsError {
    public double calcAbsError(double x, double y){
        return Math.abs(x - y);
    }
}
```
