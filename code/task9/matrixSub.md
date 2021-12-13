# Matrix Subtraction

**Routine Name:** matrixSub(m1, m2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the difference between two matrices

**Input:** The matrixSub() function takes two inputs
1. m1: a matrix
2. m2: another matrix with the same dimension

**Output:** The function outputs a matrix corresponding to the componentwise difference of the two input matrices

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO

matrix1 = [[1, 2, 3],[5, 11, 6],[14, 6, 9]]
matrix2 = [[-1, 2, 9],[4, 16, 3],[1, 7, 4]]

newMatrix = MO.matrixSub(matrix1, matrix2)
for row in newMatrix:
    print(row)
```

And corresponding example output:

```python
[2, 0, -6]
[1, -5, 3]
[13, -1, 5]
```

**Implementation:**

```python
def matrixSub(m1, m2):
    newMatrix = []
    for i in range(len(m1)):
        row = []
        for j in range(len(m1[i])):
            row.append(m1[i][j] - m2[i][j])
        newMatrix.append(row)
    return newMatrix
```


