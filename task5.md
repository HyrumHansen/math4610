### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 5:

### Question 1:

Newton's method was implemented to approximate the root of the function given in tasksheet 4. Newton's method 
approximated roots much faster than did functional iteration or the bisection method. With a tolerance of 0.0001,
Newton's method found a root in just five steps. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task5/NewtonsMethod.md). See below for example usage and output.

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

produces

```java
 Error 1: 0.097947
 Error 2: 0.066814
 Error 3: 0.026410
 Error 4: 0.003399
 Error 5: 0.000050

Root: -0.805380
```

### Question 2:

The secant method was implemented to approximate the root of the function given in tasksheet four. The secant method was not quite as fast as Newton's
method but was still much faster than functional iteration. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task5/SecantMethod.md). See below for example usage and output.

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

produces

```java
 Error 1: 0.586299
 Error 2: 1.619374
 Error 3: 0.881131
 Error 4: 0.503317
 Error 5: 0.464616
 Error 6: 0.016057
 Error 7: 0.002814
 Error 8: 0.000000

 oot: -0.000000
```

