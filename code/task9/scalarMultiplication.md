# Scalar Multiplication by a Vector

**Routine Name:** vectorAdd(a, vec)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the vector that results from a scalar multiplication

**Input:** The scalarMult() function takes two inputs, both of which must be vectors of the same length
1. vec: a vector
2. a: a scalar

**Output:** The function outputs a vector whose entries are the result of an entriewise product with the given scalar.

**Usage:** Call the function with the required inputs. See below for usage and output.

```python
import vectorOperations as VO

vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.scalarMult(5, vec1)
print(newVec)
```

And corresponding example output:

```python
[25, 15, 20, 25]
```

**Implementation:**

```python
def scalarMult(a, vec):
    newVec = []
    for i in range(len(vec)):
        newVec.append(a * vec[i])
    return newVec
```


