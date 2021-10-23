# Hybrid Method:

**Routine Name:** HybridMethod

**Author:** Hyrum Hansen

**Language:** Java

**Description:** This method will approximate the root of a single-variable function (i.e. the place where y is equal to zero) using a hybrid method. 

**Input:** The .secantRoot() method in the SecantMethod class takes five arguments:
1. **a**: A lower bound for the interval
2. **b**: An upper bound for the interval
3. **x0**: An initial guess for the root
4. **tolerance**: How much error we can tolerate
5. **maxIteration:** An upper limit for iteration count

**Output:** The method returns a value of type double, which is the x-value of the approximated root.

**Usage:** Function usage is straigtforward: simply run the script with the desired values input to the hybridMethod function. Be sure to define function and derivative accordingly.

**Implementation:**

```python
import numpy as np

def function(x):
    return x * np.exp(3 * np.power(x, 2)) - 7 * x


def derivative(x):
    return np.exp(3 * np.power(x, 2)) + 6 * np.exp(3 * np.power(x, 2)) * np.power(x, 2) - 7


def hybridMethod(a, b, x0, tolerance, maxIteration):
    count = 1
    while count < maxIteration:
        x1 = x0 - function(x0) / derivative(x0)
        x0 = x1
        count += 1
        error1 = np.abs(x1 - x0)

        while error1 > tolerance:
            a_n = a
            b_n = b
            midpoint = x0
            error2 = np.abs(- function(midpoint) / derivative(midpoint))

            if error2 < tolerance:
                break

            for n in range(0, 3):
                midpoint = (a_n + b_n) / 2

                if function(a_n) * function(midpoint) < 0:
                    b_n = midpoint

                elif function(b_n) * function(midpoint) < 0:
                    a_n = midpoint

                elif function(midpoint) == 0:
                    return function(midpoint)

        if np.abs(function(x1)) < tolerance:
            break

    return x1
```

output:

```
0.8053980642331949
```

