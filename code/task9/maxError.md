# Max Error

**Routine Name:** maxError(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the max norm of the difference between two vectors. In other words, the max error.

**Input:** The vlError() function takes two vectors as input
1. vec1: a vector
2. vec2: a vector of the same length as vec1

**Output:** The function outputs a scalar which corresponds to the L1 norm of the difference between the two passed vectors

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.maxError(vec1, vec2)

print(newVec)
```

And corresponding example output:

```python
6
```

**Implementation:**

```python
def maxError(vec1, vec2):
    differenceVec = vectorSub(vec1, vec2)
    error = normMax(differenceVec)
    return error 
```


