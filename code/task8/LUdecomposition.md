# LU decomposition

**Routine Name:** lufactorization(matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function computes the LU-factorization of a square matrix

**Input:** The lufactorization() function takes one input:
1. matrix: a square matrix

**Output:** The function outputs two matrices:
1. L: the lower triangular half of the decomposition
2. U: the upper triangular half of the decomposition

**Usage:** Call the function with the required inputs.

**Implementation:**

```python
import numpy as np

def luFactorization(matrix):

    dim = len(matrix) 
    L = np.eye(dim, dim) 
    U = np.zeros((dim, dim))

    # Do the first row and column (value assignments are trivial)
    for j in range(0, dim):
        U[0][j] = matrix[0][j]
    for i in range(1, dim):
        L[i][0] = matrix[i][0]/U[0][0]

    # The remaining entries are computed as follows
    for k in range(1, dim):
        for j in range(k, dim):
            U[k][j] = matrix[k][j] - sum(L[k, 0:k] * U[0:k, j])
        for i in range(k+1, dim):
            L[i][k] = (matrix[i][k] - sum(L[i, 0:k] * U[0:k, k]))/U[k][k]

    # Round for presentation purposes
    for i in range(dim):
        for j in range(dim):
            L[i][j] = np.round(L[i][j], 3)
            U[i][j] = np.round(U[i][j], 3)

    return L, U
```

Example Implementation:

```python
myMatrix = matrixGenerator.diagonallyDominantMatrix()

print("The Original Matrix: ")
for row in myMatrix:
    print(row)

L, U = luFactorization(myMatrix)

print("Lower Triangular Matrix: ")
for row in L:
    print(row)

print("Upper Triangular Matrix: ")
for row in U:
    print(row)
```


and the corresponding output:

```python 
The Original Matrix: 
[20, 2, 3]
[5, 18, 3]
[2, 5, 22]

Lower Triangular Matrix:
[1. 0. 0.]
[0.25 1.   0.  ]
[0.1   0.274 1.   ]

Upper Triangular Matrix:
[20.  2.  3.]
[ 0.   17.5   2.25]
[ 0.     0.    21.083]
```



