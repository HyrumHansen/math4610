# Dot Product

**Routine Name:** dotProd(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the dot product of two vectors

**Input:** The dotProd() function takes two inputs, both of which must be vectors of the same length
1. vec1: the first vector
2. vec2: the second vector

**Output:** The function outputs a scalar which is the dot product of the corresponding vectors

**Usage:** Call the function with the required inputs. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.dotProd(vec2, vec1)
print(newVec)
```

And corresponding example output:

```python
97
```

**Implementation:**

```python
def dotProd(vec1, vec2):
    total = 0
    for i in range(len(vec1)):
        total += vec1[i] * vec2[i]
    return total
```


