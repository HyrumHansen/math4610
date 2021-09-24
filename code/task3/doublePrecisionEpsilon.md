# Double Precision Epsilon:

**Routine Name:** doublePrecisionEpsilon

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will compute the double precision value for the machine epsilon. This is done by examining the number of digits in the representation of a real number. The method takes no arguments and returns void; however, on my machine it prints 25 lines to the console which implies that it takes 25 iterations to reach a value which is considered to be zero in terms of single precision accuracy.

**Input:** The method takes no input but is contained in a class and as such must be instantiated before use. 

**Output:** The method prints a new line for each loop iteration, halving epsilon and subtracting 1 + epsilon from the floating-point number 1.0.

**Usage:**
After importing the class doublePrecisionEpsilon into your program you need to instantiate the class and call the getSinglePrecision() method. For example,

```java
public class test {
    public static void main(String[] args) {
        singlePrecisionEpsilon obj = new singlePrecisionEpsilon();
        obj.getSinglePrecision();
    }
}
```

The method will return some variation of the following:

```java
Counter: 1      Epsilon 1.00000000
Counter: 2      Epsilon 0.50000000
Counter: 3      Epsilon 0.25000000
Counter: 4      Epsilon 0.12500000
Counter: 5      Epsilon 0.06250000
Counter: 6      Epsilon 0.03125000
Counter: 7      Epsilon 0.01562500
Counter: 8      Epsilon 0.00781250
Counter: 9      Epsilon 0.00390625
Counter: 10     Epsilon 0.00195313
Counter: 11     Epsilon 0.00097656
Counter: 12     Epsilon 0.00048828
Counter: 13     Epsilon 0.00024414
Counter: 14     Epsilon 0.00012207
Counter: 15     Epsilon 0.00006104
Counter: 16     Epsilon 0.00003052
Counter: 17     Epsilon 0.00001526
Counter: 18     Epsilon 0.00000763
Counter: 19     Epsilon 0.00000381
Counter: 20     Epsilon 0.00000191
Counter: 21     Epsilon 0.00000095
Counter: 22     Epsilon 0.00000048
Counter: 23     Epsilon 0.00000024
Counter: 24     Epsilon 0.00000012
Counter: 25     Epsilon 0.00000006
```

**Implementation:**
