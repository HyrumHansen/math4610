# L1 Error

**Routine Name:** l1Error(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the L1 norm of the difference between two vectors. In other words, the L1 error.

**Input:** The vlError() function takes two vectors as input
1. vec1: a vector
2. vec2: a vector of the same length as vec1

**Output:** The function outputs a scalar which corresponds to the L1 norm of the difference between the two passed vectors

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.l1Error(vec1, vec2)

print(newVec)
```

And corresponding example output:

```python
15
```

**Implementation:**

```python
def l1Error(vec1, vec2):
    differenceVec = vectorSub(vec1, vec2)
    error = l1Norm(differenceVec)
    return error
```


