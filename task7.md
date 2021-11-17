### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 7:

### Question 1:

Two python programs were written for this task:
1. [Upper Triangular Matrix Generator](https://github.com/HyrumHansen/math4610/blob/main/code/task7/upperTri.md): A program that generates an upper diagonal matrix as per the criteria of the question.
2. [Upper Triangular Matrix Solver](https://github.com/HyrumHansen/math4610/blob/main/code/task7/upperTriangularSolver.md): A program that solves Ax = b for an upper triangular matrix using backsubstitution.

The following code uses both the upper triangular matrix generator and the system solver so solve the equation given by the question.

```python
import matrixGenerator
import linearSolver
import numpy as np

myMatrix = matrixGenerator.upperTri()
myB = np.zeros(len(myMatrix) - 1)

solution = linearSolver(myMatrix, myB)
print(solution)
```

This code gives the following output:

```python
Enter the number of rows: 5
Enter the number of columns: 5
[0.2031746  0.05079365 0.02539683 0.01587302 0.11111111]
```






