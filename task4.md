### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 4:

### Question 1:

Two Java classes were built. One calculates the absolute error of an approximation while the other calculates the relative error. 

1. **Relative Error:** Computes the relative error of an approximation. Details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/RelativeError.md).
2. **Absolute Error:** Computes the absolute error of an approximation. Details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/AbsoluteError.md).

### Question 3: 

A Java program was written to approximate a function's root using the fixed-point-iteration method. The method .fixedPointRoot() is contained in class FixedPointIteration. This function is not reliable for every function; the error increases for some. Only when |g'(x)| < 1 will the fixed-point iteration method converge to a root which can be proven via Taylor Series expansion.

Click [here](https://github.com/HyrumHansen/math4610/blob/main/code/task4/FixedPointIteration.md) for details.

### Question 4:

Fixed point iteration was applied to the function f(x) = xe^{3x^2} - 7x. The algorithm did not return a solution. Because |g'(x)| > 1 at x = 0, we have to include  an appropriate value of *e* such that xNew = x0 - *e* * f(x). A value which puts us well within the range appropriate for functional iteration is *e* = 0.05. Using this value the approximation was computed as follows:

```java
public class main {
    public static void main(String[] args) {

        FunctionObject function = new FunctionObject();

        FixedPointIteration testObject = new FixedPointIteration();
        double result = testObject.fixedPointRoot(function, 0.1, 0.001, 30);
        System.out.printf("\n\nRoot: %f", result);
    }
}
```

which had as output 

```java
Error 1: 0.029848
 Error 2: 0.038617
 Error 3: 0.049791
 Error 4: 0.063800
 Error 5: 0.080815
 Error 6: 0.100072
 Error 7: 0.118002
 Error 8: 0.123380
 Error 9: 0.090533
 Error 10: 0.013702
 Error 11: 0.004393
 Error 12: 0.001642
 Error 13: 0.000587

Root: 0.805223
```


