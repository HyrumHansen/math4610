# Diagonal Matrix System Solver:

**Routine Name:** diagonalSolver()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function solves a system of equations taking a diagonal matrix and a solution vector as input.

**Input:** The diagonalSolver() takes two inputs:
1. matrix: A square, diagonal matrix
2. b: The right hand side vector

**Usage:** Usage is straightforward; simply input the matrix and corresponding right hand side vector then run the function.

**Implementation:**

```python
def diagonalSolver(matrix, b):
    x = []

    for i in range(len(b)):
        x.append(b[i] / matrix[i][i]) 

    return x
```

Example Implementation:

```python
import matrixGenerator
import linearSolver
import numpy as np


myMatrix = matrixGenerator.randomDiagonalMatrix()

for row in myMatrix:
    print(row)

print(linearSolver.diagonalSolver(myMatrix, [1,1,1,1,1]))
```

and the corresponding output:

```python
Enter the dimension of the square matrix: 5
[1, 0, 0, 0, 0]
[0, 1, 0, 0, 0]
[0, 0, 3, 0, 0]
[0, 0, 0, 3, 0]
[0, 0, 0, 0, 9]
[1.0, 1.0, 0.3333333333333333, 0.3333333333333333, 0.1111111111111111]
```


