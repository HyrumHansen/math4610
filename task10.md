### MATH 4610: Fundamentals of Computational Mathematics 
***

## TASK 10:

### Question 1:

The power method was implemented to calculate the largest eigenvalue of a matrix. It was compared to numpy's built in eigenspaces calculator to confirm accuracy. Example output is given below:

```python
import matrixOperations as MO
import matrixGenerator as MG
import numpy as np

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
