# Upper Triangular Matrix System Solver:

**Routine Name:** upperTriSolver()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function solves a system of equations taking an upper triangular matrix and a solution vector as input.

**Input:** The upperTriSolver() takes two inputs:
1. matrix: A square, upper triangular matrix
2. b: The right hand side vector

**Usage:** Usage is straightforward; simply input the matrix and corresponding right hand side vector then run the function.

**Implementation:**

```python
import numpy as np

def upperTriSolver(matrix, b):
    nRows = len(matrix)
    nCols = len(matrix[1])
    x = np.zeros(nCols)

    x[len(x) - 1] = b[len(b) - 1] / matrix[nRows - 1][nCols - 1]

    for i in reversed(range(len(b) - 1)):
        xNew = b[i]
        j  = len(b) - 1
        
        while j > i:
            xNew -= matrix[i][j] * x[j]
            j -= 1

        xNew = xNew / matrix[i][i]
        x[i] = xNew

    return x
```

Example Implementation:

```python
import matrixGenerator
import linearSolver
import numpy as np

myMatrix = matrixGenerator.upperTri()
myB = np.zeros(len(myMatrix) - 1)

solution = linearSolver(myMatrix, myB)
print(solution)
```

and the corresponding output:

```
Enter the number of rows: 5
Enter the number of columns: 5
[0.2031746  0.05079365 0.02539683 0.01587302 0.11111111]
```


