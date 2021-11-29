# LU System Solution

**Routine Name:** lu.solve(L, U, b)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function solves a system using the L and U matrices resulting from an LU-decomposition.

**Input:** The lu.solve() function takes three inputs:
1. L: the lower triangular portion of an LU-decomposition
2. U: the upper triangular portion of an LU-decomposition
3. b: a right-hand side vector

**Output:** The function outputs a solution vector x to the system LUx = b. 

**Usage:** Call the function with the required inputs.

**Implementation:**

```python
def solve(L, U, b):
    y = np.zeros(len(b))
    x = np.zeros(len(b))

    # Forward Substitution
    for i in range(len(b)):
        val = b[i]
        for j in range(i):
           val -= L[i][j] * y[j]
        y[i] = val / L[i][i]
    
    # Backward Substitution
    for i in range(len(b) - 1, -1, -1):
        val = y[i]
        for j in range(i, len(b)):
            val -= U[i][j] * x[j]
        x[i] = val / U[i][i]

    # Rounding for presentation purposes
    for i in range(len(x)):
        x[i] = np.round(x[i], 3)

    return x
```

Example Implementation:

```python
import LU_factorization as lu
import matrixGenerator


myMatrix = matrixGenerator.diagonallyDominantMatrix()

print("The Original Matrix: ")
for row in myMatrix:
    print(row)

L, U = lu.luFactorization(myMatrix)

y = lu.solve(L, U, [1, 4, 3])

print("The solution vector:")
for i in y:
    print(i)
```


and the corresponding output:

```python 
Enter the dimension of the square matrix: 3

The Original Matrix: 
[17, 1, 3]
[5, 16, 1]
[1, 2, 24]

The solution vector:
0.027
0.235
0.104
```



