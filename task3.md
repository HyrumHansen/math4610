### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 3:

### Question 1:

For this task, it was verified computationally that the central difference approximation for the second derivative approximation defined in Task Sheet 2 is second order accurate. 
This was done by obtaining a table of values describing the difference between the true function value and its central difference approximation. Verification was completed 
by calculating the slope of the line between the third and fifth data points, or the slope of the line between log(h) = log(1e^-1) and log(h) = log(1e^-3). The value was approximately 2.0004, suggesting second order accuracy.

The values shown in the following table include the value of h,
the true value of f '' (2), CDA of f '' (x) at x = 2 + h, and the difference
between the approximate and true value (error). 

```java
                   h                Value         Approximate value                Error
                (ΔX)               f''(2)                     (CDA)       (CDA - cos(2))
                   -                -----         -----------------       --------------
            1.00e+00         0.4161468365         0.3826034824         0.0335433542
            5.00e-01         0.4161468365         0.4075490369         0.0085977997
            1.00e-01         0.4161468365         0.4158001631         0.0003466735
            1.00e-02         0.4161468365         0.4161433687         0.0000034679
            1.00e-03         0.4161468365         0.4161468019         0.0000000346
            1.00e-04         0.4161468365         0.4161468170         0.0000000195
            1.00e-05         0.4161468365         0.4161471168         0.0000002802
            1.00e-06         0.4161468365         0.4160005673         0.0001462692
            1.00e-07         0.4161468365         0.4385380947         0.0223912582
            1.00e-08         0.4161468365         1.1102230246         0.6940761881
            1.00e-09         0.4161468365         55.511151231         55.095004394
            1.00e-10         0.4161468365         5551.1151231         5550.6989762
            1.00e-11         0.4161468365         555111.51231         555111.09616
            1.00e-12         0.4161468365         0.00                 0.4161468365
            1.00e-13         0.4161468365         5.55e9               5.55e9
            1.00e-14         0.4161468365        -1.66e12             -1.66e12
            1.00e-15         0.4161468365         2.77e14              2.77e14
            1.00e-16         0.4161468365         0.00                 0.4161468365
```

### Question 2:

A log-log plot of the error was produced using matplotlib, the code for which may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task2/plot.py). As discussed above, the slope of the line suggests second order accuracy over a range where h > 0. The approximation begins to fail when h = 1e^-6 due to finite precision of arithmetic. 

![alt text](images/task2/plot1.png)

### Question 3: 

Two separate Java classes were built, one to test the single precision setting of my machine and the other to test double precision. The following table gives the results from the single precision test function. The code for the function is available [here]().

```java
Counter: 1     Epsilon 1.00000000
Counter: 2     Epsilon 0.50000000
Counter: 3     Epsilon 0.25000000
Counter: 4     Epsilon 0.12500000
Counter: 5     Epsilon 0.06250000
Counter: 6     Epsilon 0.03125000
Counter: 7     Epsilon 0.01562500
Counter: 8     Epsilon 0.00781250
Counter: 9     Epsilon 0.00390625
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

After 26 iterations of the loop, the primitive float datatype no longer had sufficient precision to continue calculation. The program determined that epsilon was equal to zero and broke out of the loop. The following table gives the results for the double precision test. The code for the function is available [here]().

```java
Counter: 1     Epsilon 1.0000000000000000
Counter: 2     Epsilon 0.5000000000000000
Counter: 3     Epsilon 0.2500000000000000
Counter: 4     Epsilon 0.1250000000000000
Counter: 5     Epsilon 0.0625000000000000
Counter: 6     Epsilon 0.0312500000000000
Counter: 7     Epsilon 0.0156250000000000
Counter: 8     Epsilon 0.0078125000000000
Counter: 9     Epsilon 0.0039062500000000
Counter: 10     Epsilon 0.0019531250000000
Counter: 11     Epsilon 0.0009765625000000
Counter: 12     Epsilon 0.0004882812500000
Counter: 13     Epsilon 0.0002441406250000
Counter: 14     Epsilon 0.0001220703125000
Counter: 15     Epsilon 0.0000610351562500
Counter: 16     Epsilon 0.0000305175781250
Counter: 17     Epsilon 0.0000152587890625
Counter: 18     Epsilon 0.0000076293945313
Counter: 19     Epsilon 0.0000038146972656
Counter: 20     Epsilon 0.0000019073486328
Counter: 21     Epsilon 0.0000009536743164
Counter: 22     Epsilon 0.0000004768371582
Counter: 23     Epsilon 0.0000002384185791
Counter: 24     Epsilon 0.0000001192092896
Counter: 25     Epsilon 0.0000000596046448
Counter: 26     Epsilon 0.0000000298023224
Counter: 27     Epsilon 0.0000000149011612
Counter: 28     Epsilon 0.0000000074505806
Counter: 29     Epsilon 0.0000000037252903
Counter: 30     Epsilon 0.0000000018626451
Counter: 31     Epsilon 0.0000000009313226
Counter: 32     Epsilon 0.0000000004656613
Counter: 33     Epsilon 0.0000000002328306
Counter: 34     Epsilon 0.0000000001164153
Counter: 35     Epsilon 0.0000000000582077
Counter: 36     Epsilon 0.0000000000291038
Counter: 37     Epsilon 0.0000000000145519
Counter: 38     Epsilon 0.0000000000072760
Counter: 39     Epsilon 0.0000000000036380
Counter: 40     Epsilon 0.0000000000018190
Counter: 41     Epsilon 0.0000000000009095
Counter: 42     Epsilon 0.0000000000004547
Counter: 43     Epsilon 0.0000000000002274
Counter: 44     Epsilon 0.0000000000001137
Counter: 45     Epsilon 0.0000000000000568
Counter: 46     Epsilon 0.0000000000000284
Counter: 47     Epsilon 0.0000000000000142
Counter: 48     Epsilon 0.0000000000000071
Counter: 49     Epsilon 0.0000000000000036
Counter: 50     Epsilon 0.0000000000000018
Counter: 51     Epsilon 0.0000000000000009
Counter: 52     Epsilon 0.0000000000000004
Counter: 53     Epsilon 0.0000000000000002
Counter: 54     Epsilon 0.0000000000000001
```

Double precision data took twice as many iterations to reach an epsilon that the machine determined was equal to zero, which is no deviation from expectation.


