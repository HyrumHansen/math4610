# Inverse Power Method

**Routine Name:** invPowerMethod(matrix, n, x)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the smallest eigenvalue for a square matrix

**Input:** The jacobi() function takes four inputs:
1. matrix: a square, diagonally dominant matrix
2. n: the number of iterations
3. x: some initial guess at the eigenvector associated with the smallest eigenvalue.

**Output:** The function outputs a value which should be the system's smallest eigenvalue.

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO
import matrixGenerator as MG
import vectorOperations as VO
from gaussianElimiantionSystemSolution import solve
import numpy as np

matrix = MG.diagonallyDominantMatrix()

print("Power Method:")
print("------------")
print(MO.invPowerMethod(matrix, 200, [1 for i in range(100)]))
print("Numpy Method")
print("------------")
print(min(np.linalg.eig(matrix)[0]))
```

And corresponding example output:

```python
Enter the dimension of the square matrix: 100
Power Method:
------------
487.88872308867326
Numpy Method
------------
(487.44993918001734+0j)
```

**Implementation:**

```python
def invPowerMethod(matrix, n, x):
    eigenVector = x
    matrixInv = np.linalg.inv(matrix)

    # Computes the Eigenvector
    for i in range(n):
        eigenVector = matrixVecProd(matrixInv, eigenVector)
        eigenVector = VO.scalarMult((1/ VO.l2Norm(eigenVector)), eigenVector)
    
    # Uses Rayleigh quotient to compute the associated eigenvalue
    Au = matrixVecProd(matrix, eigenVector)
    uTAu = VO.dotProd(eigenVector, Au)
    eigenValue = uTAu * (1/VO.dotProd(eigenVector, eigenVector))

    return eigenValue
```


