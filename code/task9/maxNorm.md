# Max norm

**Routine Name:** normMax(vec)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the max norm of a vector

**Input:** The maxNorm() function takes one vector as input
1. vec: a vector

**Output:** The function outputs a scalar which corresponds to the absolute value of the maximum entry in vec.

**Usage:** Call the function with the required input. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.normMax(vec2)

print(newVec)
```

And corresponding example output:

```python
11
```

**Implementation:**

```python
def normMax(vec):
    absArray = []

    # Make all values positive
    for value in vec:
        if value < 0:
            absArray.append(value * -1)
        else:
            absArray.append(value)

    # Find the max value
    currMax = 0
    for value in absArray:
        if value > currMax:
            currMax = value
    return currMax
```


