# Matrix 1-Norm

**Routine Name:** oneMatrixNorm(matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the 1-norm of a matrix. In other words, the maximum of the column sums.

**Input:** The oneMatrixNorm() function takes one input:
1. matrix: a matrix

**Output:** The function outputs a value which should be the maximum column sum of the passed in matrix.

**Usage:** Call the function with the required input. See below for usage and output.

```python
matrix = [[1,2,3],[5,5,66],[9,3,11]]
print(MO.oneMatrixNorm(matrix))
```

And corresponding example output:

```python
80
```

**Implementation:**

```python
def oneMatrixNorm(matrix):
    newMatrix = transpose(matrix)
    colSums = []
    for i in range(len(newMatrix)):
        sum = 0
        for j in range(len(newMatrix[i])):
            sum += abs(newMatrix[i][j])
        colSums.append(sum)
    return max(colSums)
```


