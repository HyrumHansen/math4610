# Vector Subtract

**Routine Name:** vectorSub(vec1, vec2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the difference between two vectors

**Input:** The vectorSub() function takes two inputs, both of which must be vectors of the same length
1. vec1: the first vector
2. vec2: the second vector

**Output:** The function outputs a vector whose entries are the difference of corresponding entries in the input vectors.

**Usage:** Call the function with the required inputs. See below for usage and output.

```python
vec1 = [5, 3, 4, 5]
vec2 = [4, -2, 7, 11]

newVec = VO.vectorSub(vec1, vec2)
print(newVec)
```

And corresponding example output:

```python
[1, 5, -3, -6]
```

**Implementation:**

```python
def vectorSub(vec1, vec2):
    newVec = []
    for i in range(len(vec1)):
        newVec.append(vec1[i] - vec2[i])
    return newVec
```


