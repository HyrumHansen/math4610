# L2 Error

**Routine Name:** l2Error(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the L2 norm of the difference between two vectors. In other words, the L2 error.

**Input:** The vlError() function takes two vectors as input
1. vec1: a vector
2. vec2: a vector of the same length as vec1

**Output:** The function outputs a scalar which corresponds to the L2 norm of the difference between the two passed vectors

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.l2Error(vec1, vec2)

print(newVec)
```

And corresponding example output:

```python
8.426149773176359
```

**Implementation:**

```python
def l2Error(vec1, vec2):
    differenceVec = vectorSub(vec1, vec2)
    error = l2Norm(differenceVec)
    return error
```


