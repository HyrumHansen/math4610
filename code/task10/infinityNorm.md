# Matrix Infinity-Norm

**Routine Name:** infinityNorm(matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the infinity-norm of a matrix. In other words, the maximum of the row sums.

**Input:** The infinityNorm() function takes one input:
1. matrix: a matrix

**Output:** The function outputs a value which should be the maximum row sum of the passed in matrix.

**Usage:** Call the function with the required input. See below for usage and output.

```python
matrix = [[1,2,3],[5,11,6],[9,13,1]]

print("Matrix Infinity Norm:")
print("------------")
print(MO.infinityNorm(matrix))
```

And corresponding example output:

```python
Matrix Infinity Norm:
------------
23
```

**Implementation:**

```python
def infinityNorm(matrix):
    rowSums = []
    for i in range(len(matrix)):
        sum = 0
        for j in range(len(matrix[i])):
            sum += abs(matrix[i][j])
        rowSums.append(sum)
    return max(rowSums)
```


