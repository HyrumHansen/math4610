# Lower Triangular Matrix System Solver:

**Routine Name:** lowerTriSolver()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function solves a system of equations taking an upper triangular matrix and a solution vector as input.

**Input:** The lowerTriSolver() takes two inputs:
1. matrix: A square, lower triangular matrix
2. b: The right hand side vector

**Usage:** Usage is straightforward; simply input the matrix and corresponding right hand side vector then run the function.

**Implementation:**

```python
def lowerTriSolver(matrix, b):
    x = []

    x.append(b[0] / matrix[0][0])

    for i in range(len(b) - 1):
        i += 1
        xNew = b[i]
        j = 0

        while j < i:
            xNew -= matrix[i][j] * x[j]
            j+= 1

        xNew = xNew / matrix[i][i]
        x.append(xNew)   

    return x
```

Example Implementation:

```python
import matrixGenerator
import linearSolver
import numpy as np


transposedMatrix = matrixGenerator.lowerTri()

solution = linearSolver.lowerTriSolver(transposedMatrix, [1,1,1])

print(solution)
```

and the corresponding output:

```python
Enter the number of rows: 3
Enter the number of columns: 3
[1.0, -0.3333333333333333, -0.13333333333333336]
```


