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

The resultant L and U matrices were passed into a new function, **lu.solve()** which solves a system using the LU decomposition. This function takes as input a lower and upper triangular matrix, then solves Ly = b and Ux = y to yield the solution vector x. Implementation details are given [here](). Example output is shown below. 

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
