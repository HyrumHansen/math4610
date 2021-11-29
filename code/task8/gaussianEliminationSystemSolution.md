# System Solution via Gaussian Elimination and Backsubstitution

**Routine Name:** gaussianElimiantionSystemSolution.solve(matrix, b)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This uses Gaussian Elimination and backsubstitution to solve a linear system.

**Input:** The solve() function takes two inputs:
1. matrix: a square matrix
2. b: a solution vector whose length matches the dimension of the matrix

**Usage:** Call the function with the required inputs. The function outputs the solution vector so assign it to a new variable for visualisation.

**Implementation:**

```python
import numpy as np

def solve(matrix, b):
    dim = len(matrix[0])
    x = np.zeros(dim)

    # Append the coefficients to the augmented matrix
    for i in range(dim):
        matrix[i].append(b[i])

    # Doing the Gaussian elimination
    for i in range(dim):

        for j in range(i + 1, dim):
            scalar = matrix[j][i]/matrix[i][i]

            for k in range(dim + 1):
                matrix[j][k] = matrix[j][k] - scalar * matrix[i][k]
    
    # Doing the backsubstitution
    x[dim-1] = matrix[dim-1][dim]/matrix[dim-1][dim-1]

    for i in range(dim - 2, -1, -1):
        x[i] = matrix[i][dim]
        
        for j in range(i + 1,dim):
            x[i] = x[i] - matrix[i][j]*x[j]
        
        x[i] = x[i]/matrix[i][i]

    # Rounding for presentation purposes
    for i in range(len(x)):
        x[i] = round(x[i], 3)


    return x
```

Example Implementation:

```python
from gaussianElimiantionSystemSolution import solve
import matrixGenerator

myMatrix = matrixGenerator.diagonallyDominantMatrix()

for row in myMatrix:
    print(row)

solution = solve(myMatrix, [2, 4, 3])

print("The solution is:")
for i in range(len(solution)):
    print("X[%d]: %0.2f" % (i, solution[i]))
```


and the corresponding output:

```python 
Enter the dimension of the square matrix: 3
[18, 4, 4]
[2, 23, 5]
[2, 2, 16]

The solution is:
X[0]: 0.04
X[1]: 0.13
X[2]: 0.17
```



