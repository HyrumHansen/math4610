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

A function was written to generate hilbert matrices of dimension n = 4, 5, ..., 10. Implementation details are given [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/generateHilbertMatrix.md). When attempting to solve the system using LU-factorization with rounded entries, divide by zero errors occur. Rounding code was ommitted and the process worked adequatly; that is, results were consistent up to some rounding errors. Given below are the results for the computations:

n = 4
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

The solution vector (should be all ones):
0.9999999999999758
1.0000000000002716
0.999999999999344
1.0000000000004274
```

n = 5
```python
Enter the dimension of the Hilbert matrix: 5

The Hilbert Matrix: 
[1.0, 0.5, 0.3333333333333333, 0.25, 0.2]
[0.5, 0.3333333333333333, 0.25, 0.2, 0.16666666666666666]
[0.3333333333333333, 0.25, 0.2, 0.16666666666666666, 0.14285714285714285]
[0.25, 0.2, 0.16666666666666666, 0.14285714285714285, 0.125]
[0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111]

The Right-Hand Side vector (each entry is the sum of the corresponding row):
2.283333333333333
1.45
1.0928571428571427
0.8845238095238095
0.7456349206349207

The solution vector (should be all ones):
0.9999999999999756
1.0000000000003417
0.9999999999988194
1.0000000000014766
0.999999999999388
```
.
.
.

n = 10
```python
Enter the dimension of the Hilbert matrix: 10
The Hilbert Matrix: 
[1.0, 0.5, 0.3333333333333333, 0.25, 0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1]
[0.5, 0.3333333333333333, 0.25, 0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091]
[0.3333333333333333, 0.25, 0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333]
[0.25, 0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693]
[0.2, 0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142]
[0.16666666666666666, 0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142, 0.06666666666666667]       
[0.14285714285714285, 0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142, 0.06666666666666667, 0.0625]
[0.125, 0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142, 0.06666666666666667, 0.0625, 0.058823529411764705]
[0.1111111111111111, 0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142, 0.06666666666666667, 0.0625, 0.058823529411764705, 0.05555555555555555]     
[0.1, 0.09090909090909091, 0.08333333333333333, 0.07692307692307693, 0.07142857142857142, 0.06666666666666667, 0.0625, 0.058823529411764705, 0.05555555555555555, 0.05263157894736842]   

The Right-Hand Side vector (each entry is the sum of the corresponding row):
2.9289682539682538
2.019877344877345
1.603210678210678
1.3468004218004217
1.168228993228993
1.03489565989566
0.9307289932289933
0.8466953797836152
0.7772509353391707
0.718771403175428

The solution vector (should be all ones):
0.9999999980279533
1.0000001696038614
0.9999963997394877
1.0000326441124818
0.9998446231300473
1.0004263810323253
0.9993014785225113
1.00067417611039
0.9996464584748134
1.0000776725782257
```

As the dimension of the matrix increases, the rounding errors seem to increase a little bit. 

### Question 4:

Gaussian elimination with scaled partial pivoting was implemented to determine if it was more effective than simply solving LUx = b for Hilbert matrices. Implementation details are given [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/GaussianScaledPartialPivoting.md). The function is pretty robust. Comparisons between LUx = b with forward and backward substituion and Ax = b with scaled partial pivoting will be made in the subsequent response.

### Question 5:

Using scaled partial pivoting the error in the resultant x vector for Ax = b on Hilbert matrices was about half the magnitude of the error solving LUx = b with no row swaps. 

