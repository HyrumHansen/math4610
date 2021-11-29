### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 8:

### Question 1:

A python script was written to solve a square linear system using Gaussian elimnation and backsubstitution. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/gaussianEliminationSystemSolution.md). This function can be used safely with a diagonally dominant matrix. Below is an example of usage. First the randomly generated diagonally-dominant matrix:

```python
myMatrix = matrixGenerator.diagonallyDominantMatrix()

for row in myMatrix:
    print(row)
```

which gives 

```python
[18, 4, 4]
[2, 23, 5]
[2, 2, 16]
```
and the code to print the solution for a randomly chosen vector b with length equal to the matrix dimension:

```python
solution = solve(myMatrix, [2, 4, 3])

print("The solution is:")
for i in range(len(solution)):
    print("X[%d]: %0.2f" % (i, solution[i]))
```

which gives

```python
The solution is:
X[0]: 0.04
X[1]: 0.13
X[2]: 0.17
```

### Question 2:

LU factorization was implemented, the details are available [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/LUdecomposition.md). The function's output was checked against the scipy implementation of LU-factorization and the results were found to be consistent. The following is example output for a randomly-generated diagonally-dominant matrix:

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

The resultant L and U matrices were passed into a new function, **lu.solve()**, which solves a system using the LU decomposition. This function takes as input a lower triangular matrix, an upper triangular matrix, and a right-hand side vector b, then solves Ly = b and Ux = y to yield the solution vector x. Implementation details are given [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/luSolve.md). Example output is shown below. 

```python
The Original Matrix: 
[17, 1, 3]
[5, 16, 1]
[1, 2, 24]

The solution vector:
0.027
0.235
0.104
```

### Question 3:

A function was written to generate hilbert matrices of dimension n = 4, 5, ..., 10. Implementation details are given [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/generateHilbertMatrix.md). When attempting to solve the system using LU-factorization, divide by zero errors occur. For n = 2 and n = 3 the solutions are consistent up to rounding (matrix entries are rounded for presentation purposes though in an application setting the rounding code would be commented out); however, once the dimension is greater than 3 the solution vector cannot be computed by the LU-system solution code. Below is an example of the code functioning properly for a hilber matrix of dimension n = 3:

```python
Enter the dimension of the Hilbert matrix: 3

The Hilbert Matrix: 
[1.0, 0.5, 0.3333333333333333]
[0.5, 0.3333333333333333, 0.25]
[0.3333333333333333, 0.25, 0.2]

The Right-Hand Side vector (each entry is the sum of the corresponding row)
1.8333333333333333
1.0833333333333333
0.7833333333333332

The solution vector (should be all ones):
1.001
0.98
1.028
```

Now here's what happens for n > 4:

```python
Enter the dimension of the Hilbert matrix: 4
The Hilbert Matrix: 
[1.0, 0.5, 0.3333333333333333, 0.25]
[0.5, 0.3333333333333333, 0.25, 0.2]
[0.3333333333333333, 0.25, 0.2, 0.16666666666666666]
[0.25, 0.2, 0.16666666666666666, 0.14285714285714285]

The Right-Hand Side vector (each entry is the sum of the corresponding row):
2.083333333333333
1.2833333333333332
0.9499999999999998
0.7595238095238095

...
RuntimeWarning: divide by zero encountered in double_scalars
  x[i] = val / U[i][i]
...

The solution vector (should be all ones):
nan
nan
inf
-inf
```

This output solution is clearly not correct, and is only given after a runtime error. Thus, we assume that another method is needed to compute the solution to this system.


