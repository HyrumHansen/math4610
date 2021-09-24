# Double Precision Epsilon:

**Routine Name:** doublePrecisionEpsilon

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This routine will compute the double precision value for the machine epsilon. This is done by examining the number of digits in the representation of a real number. The method takes no arguments and returns void; however, it prints 25 lines to the console which implies that it takes 25 iterations to reach a value which is considered to be zero in terms of single precision accuracy.

**Input:** The method takes no input but is contained in a class and as such must be instantiated before use. For example, after importing the class doublePrecisionEpsilon into your program you would need to include the following as part of your main method to get the desired result:

```java
      singlePrecisionEpsilon obj = new singlePrecisionEpsilon();
      obj.getSinglePrecision();
```
