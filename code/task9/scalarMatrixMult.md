# Scalar Multiplication (with a matrix)

**Routine Name:** matrixAdd(a, matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the matrix resulting from multiplication by a scalar

**Input:** The scalarMult() function takes two inputs
1. a: a scalar
2. matrix: a matrix
**Output:** The function outputs a matrix corresponding to the componentwise multiplication by a scalar

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO

matrix1 = [[1, 2, 3],[5, 11, 6],[14, 6, 9]]
matrix2 = [[-1, 2, 9],[4, 16, 3],[1, 7, 4]]

newMatrix = MO.scalarMult(5, matrix2)
for row in newMatrix:
    print(row)
```

And corresponding example output:

```python
[-5, 10, 45]
[20, 80, 15]
[5, 35, 20]
```

**Implementation:**

```python
def scalarMult(a, matrix):
    newMatrix = []
    for i in range(len(matrix)):
        row = []
        for j in range(len(matrix[i])):
            row.append(a * matrix[i][j])
        newMatrix.append(row)
    return newMatrix
```


