### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 7:

### Question 1:

Two python programs were written for this task:
1. [Upper Triangular Matrix Generator](https://github.com/HyrumHansen/math4610/blob/main/code/task7/upperTriangularGenerator.md): A program that generates an upper diagonal matrix as per the criteria of the question.
2. [Upper Triangular Matrix Solver](https://github.com/HyrumHansen/math4610/blob/main/code/task7/upperTriangularSolver.md): A program that solves Ax = b for an upper triangular matrix using backsubstitution.

The following code uses both the upper triangular matrix generator and the system solver to solve the equation given by the question.

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

### Question 2:

A python program was written to generate a lower triangular matrix. The function first calles the upper triangular matrix generation function then tranposes it. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task7/lowerTriangularMatrixGenerator.md). For example output see below:

```python
Enter the number of rows: 5
Enter the number of columns: 5
[1, 0, 0, 0, 0]
[2, 3, 0, 0, 0]
[3, 4, 5, 0, 0]
[4, 5, 6, 7, 0]
[5, 6, 7, 8, 9]
```
A lower triangular matrix solver was written in Python. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task7/lowerTriangularSolver.md). For the three by three case, example output is given below:

```python
Enter the number of rows: 3
Enter the number of columns: 3
[1.0, -0.3333333333333333, -0.13333333333333336]
```

### Question 3:

Four functions were written to accomplish this task:
1. [Square Matrix Generator with Random Entries](https://github.com/HyrumHansen/math4610/blob/main/code/task7/squareRandomMatrix.md): This function takes user input for the matrix dimension and outputs a matrix with random values.
2. [Upper Triangular Matrix Generator with Random Entries](https://github.com/HyrumHansen/math4610/blob/main/code/task7/randomUpperTriangularMatrixGenerator.md): This function takes user input for the matrix dimension and outputs a square, upper triangular matrix with random values
3. [Lower Triangular Matrix Generator with Random Entries](https://github.com/HyrumHansen/math4610/blob/main/code/task7/RandoomLowerTriangularMatrixGenerator.md): This function takes user input for the matrix dimension and outputs a square, lower triangular matrix with random values
4. [Diagonal Matrix with Random Entries](https://github.com/HyrumHansen/math4610/blob/main/code/task7/randomDiagonalMatrix.md): This function takes user input for the matrix dimension and outputs a square, diagonal matrix with random integers between 1 and 9 on the diagonal.


### Question 4: 

A function was written to solve a system involving a diagonal matrix. Implmentation details my be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task7/diagonalMatrixSolver.md). For a 5 by 5 case example output is given below:

```python
Enter the dimension of the square matrix: 5
[1, 0, 0, 0, 0]
[0, 1, 0, 0, 0]
[0, 0, 3, 0, 0]
[0, 0, 0, 3, 0]
[0, 0, 0, 0, 9]
[1.0, 1.0, 0.3333333333333333, 0.3333333333333333, 0.1111111111111111]
```

### Question 5:

A python function was written to reduce a random square matrix into row-echelon form. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task7/rowEchelon.md). Example output is given below:

```python
Enter the dimension of the square matrix: 5

ORIGINAL MATRIX
[3, 3, 7, 5, 1]
[1, 4, 3, 2, 4]
[8, 8, 8, 9, 2]
[4, 3, 4, 7, 3]
[9, 2, 4, 1, 7]

REDUCED MATRIX
[3, 3, 7, 5, 1]
[0.0, 3.0, 0.666666666666667, 0.3333333333333335, 3.6666666666666665]
[0.0, 0.0, -10.666666666666664, -4.333333333333332, -0.6666666666666665]
[0.0, 0.0, 0.0, 2.520833333333333, 3.208333333333333]
[0.0, 0.0, -1.7763568394002505e-15, -8.881784197001252e-16, 22.363636363636363]
```

### Question 6:

The most important critera that makes a system solvable is to have the same number of **independent** equations as you have unknowns. In other words, if there are 5 unknowns your matrix must be a 5 by 5 square matrix with linearly independent columns. A system with fewer equations than unknowns has infinately many solutions or no solution; we call this type an underdetermined system.


