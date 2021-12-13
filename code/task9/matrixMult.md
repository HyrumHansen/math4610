# Matrix Multiplication

**Routine Name:** matRectProd(matrix1, matrix2)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the product of two rectangular (or square) matricies of valid operation size.

**Input:** The matRectProd() function takes two inputs
1. matrix1: the first matrix
2. matrix2: the second matrix

**Output:** The function outputs a matrix corresponding to the valid product of two matrices

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO

matrix1 = [[1, 2, 3],[5, 11, 6],[14, 6, 9]]
matrix2 = [[-1, 2, 9, 4],[4, 16, 3, 7],[1, 7, 4, 8]]

newMatrix = MO.matrixRectProd(matrix1, matrix2)
for row in newMatrix:
    print(row)
```

And corresponding example output:

```python
[10, 55, 27, 42]
[45, 228, 102, 145]
[19, 187, 180, 170]
```

**Implementation:**

```python
def matrixRectProd(matrix1, matrix2):
    newMatrix = [[0 for x in range(len(matrix2[0]))] for y in range(len(matrix1))] 
  
    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            for k in range(len(matrix2)):
                newMatrix[i][j] += matrix1[i][k] * matrix2[k][j]

    return newMatrix
```


