# Relative Error:

**Routine Name:** RelError

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will compute the relative error for an approximation. The relative error is the difference between the true value and the approximating value divided by the true value.

**Input:** The calcRelError method contained in the RelError class takes two values of type double. The first value, x, is the approximating value and the second value, y, is the true value.

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
