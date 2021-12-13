### MATH 4610: Fundamentals of Computational Mathematics 
***

## TASK 9:

### Question 1:

The following fucntions were written in Python to compute vector operations:
1. [Vector Addition](https://github.com/HyrumHansen/math4610/blob/main/code/task9/vectorAdd.md)
2. [Vector Subtraction](https://github.com/HyrumHansen/math4610/blob/main/code/task9/vectorSubtract.md)
3. [Vector/Scalar Multiplication](https://github.com/HyrumHansen/math4610/blob/main/code/task9/scalarMultiplication.md)
4. [Dot Product](https://github.com/HyrumHansen/math4610/blob/main/code/task9/dotProduct.md)
5. [Outer Product](https://github.com/HyrumHansen/math4610/blob/main/code/task9/outerProduct.md)

### Question 2:

The following functions were written in Python to compute vector norms and errors:
1. [L1 Norm](https://github.com/HyrumHansen/math4610/blob/main/code/task9/l1norm.md)
2. [L2 Norm](https://github.com/HyrumHansen/math4610/blob/main/code/task9/l2norm.md)
3. [Max Norm](https://github.com/HyrumHansen/math4610/blob/main/code/task9/maxNorm.md)
4. [L1 Error](https://github.com/HyrumHansen/math4610/blob/main/code/task9/l1Error.md)
5. [L2 Error](https://github.com/HyrumHansen/math4610/blob/main/code/task9/l2Error.md)
6. [Max Error](https://github.com/HyrumHansen/math4610/blob/main/code/task9/maxError.md)

### Question 3:

The following functions were written in Python to compute matrix operations. 
1. [Matrix Addition](https://github.com/HyrumHansen/math4610/blob/main/code/task9/matrixAdd.md)
2. [Matrix Subtraction](https://github.com/HyrumHansen/math4610/blob/main/code/task9/matrixSub.md)
3. [Scalar/Matrix Multiplication](https://github.com/HyrumHansen/math4610/blob/main/code/task9/scalarMatrixMult.md)
4. [Matrix Transpose](https://github.com/HyrumHansen/math4610/blob/main/code/task9/matrixTranspose.md)
5. [Matrix/Vector Multplication](https://github.com/HyrumHansen/math4610/blob/main/code/task9/matVecMult.md)
6. [Matrix/Matrix Multiplication](https://github.com/HyrumHansen/math4610/blob/main/code/task9/matrixMult.md)

### Question 4:

Jacobi iteration was implemented to find the solution to a linear system of equations for square diagonally dominant matrices. To demonstrate the function's behavior, jacobi() prints the current x vector each iteration. This function was tested against numpy's np.linalg.solve() to confirm the validity of the solution. Here is an example of the function's usage:

```python
import matrixOperations as MO

matrix1 = [[11, 2, 3],[5, 11, 6],[2, 6, 14]]
MO.jacobi(matrix1, [1, 6, 3], [0, 0, 0], 50)
```


with corresponding output:
```python
Iteration 1:[0.09090909090909091, 0.5454545454545454, 0.21428571428571427]   
Iteration 2:[-0.06670602125147579, 0.38724911452184185, -0.03246753246753244]
Iteration 3:[0.029354942578083052, 0.5934850273693248, 0.05785123966942148]     
Iteration 4:[-0.03277488852244675, 0.5005561680993688, -0.04425857495515108]    
.
.
.
Iteration 48:[-0.004145937761811703, 0.5613598659748101, -0.025704810313001345]
Iteration 49:[-0.004145936455510576, 0.5613598682442789, -0.025704808594659845]
Iteration 50:[-0.004145937336779835, 0.5613598667132284, -0.02570480975390372]
```

### Question 5:

Jacobi Iteration was compared to Gaussian Elimination for a 100x100 diagonally dominant matrix with a solution vector of ones. The L2 norm was used to compare the two solutions. Both converged to values very near zero, but Gaussian elimination got so near zero that due to the finite precision of data, the output error was reported to be zero. The code to compute the error is given below:

```python
import matrixOperations as MO
import matrixGenerator as MG
import vectorOperations as VO
from gaussianElimiantionSystemSolution import solve

matrix = MG.diagonallyDominantMatrix()
ones = [1 for i in range(100)]
guess = [0 for i in range(100)]
solutionVector = MO.matrixVecProd(matrix, ones)

jacobiSolution = MO.jacobi(matrix, solutionVector, guess, 50)
gaussSolution = solve(matrix, solutionVector)

errorJacobi = VO.l2Error(jacobiSolution, ones)
errorGauss = VO.l2Error(gaussSolution, ones)

print("ERROR COMPARISION")
print("-----------------")
print(f"The Error for the Jacobi Iteration is: {errorJacobi}")
print(f"The Error for the Gaussian Method is: {errorGauss}")
```

and the corresponding output:

```python
ERROR COMPARISION
-----------------
The Error for the Jacobi Iteration is: 1.6714675969431367e-11
The Error for the Gaussian Method is: 0.0
```

