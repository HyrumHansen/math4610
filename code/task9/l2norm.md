# L2 norm

**Routine Name:** l2Norm(vec)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the L2 norm of a vector

**Input:** The l2Norm() function takes one vector as input
1. vec: a vector

**Output:** The function outputs a scalar which corresponds to the L2 norm of the passed vector

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.l2Norm(vec2)

print(newVec)
```

And corresponding example output:

```python
13.784048752090222
```

**Implementation:**

```python
def l2Norm(vec):
    total = 0
    for value in vec:
        total += value * value
    return total ** (1/2)
```


