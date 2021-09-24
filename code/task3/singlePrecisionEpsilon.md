# Single Precision Epsilon:

**Routine Name:** singlePrecisionEpsilon

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will compute the single precision value for the machine epsilon. This is done by examining the number of digits in the representation of a real number. The method takes no arguments and returns void; however, on my machine it prints 25 lines to the console which implies that it takes 25 iterations to reach a value which is considered to be zero in terms of single precision accuracy.

**Input:** The method takes no input but is contained in a class and as such must be instantiated before use. 

**Output:** The method prints a new line for each loop iteration, halving epsilon and subtracting 1 + epsilon from the floating-point number 1.0.

**Usage:** After importing the class doublePrecisionEpsilon into your program you need to instantiate the class and call the getSinglePrecision() method. For example,

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
...
Counter: 25     Epsilon 0.00000006
```

**Implementation:**

```java
public class singlePrecisionEpsilon {

    public void getSinglePrecision(){
        float one = 1.0f;
        float epsilon = 1.0f;

        for(int i = 1; i < 1000; i++){
            float difference = one - (one + epsilon);

            System.out.printf("Counter: %d     Epsilon %1.8f", i, epsilon);
            System.out.println();

            if(difference == 0) break;
            epsilon *= 0.5;
        }
    }
}
```
