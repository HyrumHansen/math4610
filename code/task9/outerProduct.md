# Outer Product

**Routine Name:** outerProd(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the outer product of two vectors

**Input:** The outerProd() function takes two inputs, both of which must be vectors of the same length
1. vec1: the first vector
2. vec2: the second vector

**Output:** The function outputs a matrix which represents the outer product of the given vectors

**Usage:** Call the function with the required inputs. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.outerProd(vec2, vec1)

for row in newVec:
    print(row)
```

And corresponding example output:

```python
[20, 12, 16, 20]
[-10, -6, -8, -10]        
[35, 21, 28, 35]
[55, 33, 44, 55]
```

**Implementation:**

```python
def outerProd(vec1, vec2):
    matrix = []
    for value1 in vec1:
        row = []
        for value2 in vec2:
            row.append(value1 * value2)
        matrix.append(row)
    return matrix
```


