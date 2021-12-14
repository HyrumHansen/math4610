### MATH 4610: Fundamentals of Computational Mathematics 
***

## TASK 10:

### Question 1:

The power method was implemented to calculate the largest eigenvalue of a matrix. Implementation may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task10/powerMethod.md) It was compared to numpy's built in eigenspaces calculator to confirm accuracy. Example usage is given below:

```python
matrix = MG.diagonallyDominantMatrix()

print("Power Method:")
print("------------")
print(MO.powerMethod(matrix, 50, [1 for i in range(100)]))
print("Numpy Method")
print("------------")
print(max(np.linalg.eig(matrix)[0]))
```

and the corresponding output:

```python
Power Method:
------------
800.9924178671603
Numpy Method
------------
(800.9924178670964+0j)
```

You can see that the two values are arbitrarily close to one another.

### Question 2:

The inverse power method was implmented to find the smallest eigenvalue of a matrix. The function performed well for small systems, but the 100x100 matrix proved to be a little more challenging. For larger systems, this method returned an approximate eigenvalue which was slightly off from numpy's value. Increasing the number of iterations did not improve accuracy, which makes me think that the initial eigenvector guess was too imprecise for perfect convergence. You can see that the custom method is off by about 0.44 after 200 iterations. Click [here](https://github.com/HyrumHansen/math4610/blob/main/code/task10/invPowerMethod.md) for implementation details. Example implementation is given below:

```python
matrix = MG.diagonallyDominantMatrix()

print("Power Method:")
print("------------")
print(MO.invPowerMethod(matrix, 200, [1 for i in range(100)]))
print("Numpy Method")
print("------------")
print(min(np.linalg.eig(matrix)[0]))
```

and the corresponding output

```python
Enter the dimension of the square matrix: 100
Power Method:
------------
487.88872308867326
Numpy Method
------------
(487.44993918001734+0j)
```

### Question 3:

Code was written to calculate the 1-norm of a matrix (in other words, the maximum of the column sums). Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task10/1matrixNorm.md). The function was tested on a 100x100 diagonally dominant matrix and compared to numpy's norm function. The two were found to be consistend. Example usage is given below:

```python
matrix = MG.diagonallyDominantMatrix()

print("Custom Method:")
print("------------")
print(MO.oneMatrixNorm(matrix))
print("Numpy Method")
print("------------")
print(np.linalg.norm(matrix, 1))
```

and the corresponding output:

```python
Enter the dimension of the square matrix: 100
Custom Method:
------------
847
Numpy Method
------------
847.0
```

### Question 4:

Code was written to calculate the infinit-norm of a matrix (in other words, the maximum of the row sums). Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task10/1matrixNorm.md). The function was tested on a 100x100 diagonally dominant matrix and compared to numpy's norm function. The two were found to be consistend. Example usage is given below:

```python
matrix = MG.diagonallyDominantMatrix()

print("Custom Method:")
print("------------")
print(MO.infinityNorm(matrix))
print("Numpy Method")
print("------------")
print(np.linalg.norm(matrix, np.inf))
```

and the corresponding output:

```python
Enter the dimension of the square matrix: 100
Custom Method:
------------
839
Numpy Method
------------
839.0
```

### Question 5: 

Code was written to compute the condition number of a matrix. The function estimated eigenvalues using the power method and inverse power method functions defined above. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task10/conditionNumber.md). The method was compared to numpy's condition number function to assess accuracy. The two values were fairly close to one another. An example is given below:

```python
matrix = MG.diagonallyDominantMatrix()

print("Matrix Condition Number:")
print("------------")
print(MO.conditionNumber(matrix))
print("Numpy Method")
print("------------")
print(np.linalg.cond(matrix))
```

and the corresponding output:

```python
Enter the dimension of the square matrix: 100
Matrix Condition Number:
------------
1.6386995143959917
Numpy Method
------------
1.6641666266031336
```



