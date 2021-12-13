# L1 norm

**Routine Name:** l1Norm(vec)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the L1 norm of a vector

**Input:** The vl1Norm() function takes one vector as input
1. vec: a vector

**Output:** The function outputs a scalar which corresponds to the L1 norm of the passed vector

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.l1Norm(vec2)

print(newVec)
```

And corresponding example output:

```python
24
```

**Implementation:**

```python
def l1Norm(vec):
    total = 0
    for value in vec:
        if value < 0:
            total += -1 * value 
        else:
            total += value
    return total
```


