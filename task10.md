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
