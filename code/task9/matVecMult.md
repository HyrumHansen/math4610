# Matrix Multiplication (by a vector)

**Routine Name:** matRectProd(matrix, vector)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the product of a matrix and a vector where dimensions are compatible for multiplication

**Input:** The matrixVecProd() function takes two inputs
1. matrix: the matrix
2. vec: the vector

**Output:** The function outputs a vector corresponding to the compatible product

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO

matrix1 = [[1, 2, 3],[5, 11, 6],[14, 6, 9]]
matrix2 = [[-1, 2, 9, 4],[4, 16, 3, 7],[1, 7, 4, 8]]

newMatrix = MO.matrixVecProd(matrix1, [3, -1, 2])
for row in newMatrix:
    print(row)
```

And corresponding example output:

```python
7
16
54
```

**Implementation:**

```python
def matrixVecProd(matrix, vector):
    newVec = []
    for i in range(len(matrix)):
        value = 0
        for j in range(len(vector)):
            value += matrix[i][j] * vector[j]
        newVec.append(value)
    return newVec
```


