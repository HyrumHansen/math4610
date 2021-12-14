# Power Method

**Routine Name:** powerMethod(matrix, n, x)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the largest eigenvalue for a square matrix

**Input:** The jacobi() function takes four inputs:
1. matrix: a square, diagonally dominant matrix
2. n: the number of iterations
3. x: some initial guess at the eigenvector associated with the largest eigenvalue.

**Output:** The function outputs a value which should be the system's largest eigenvalue.

**Usage:** Call the function with the required input. See below for usage and output.

```python
matrix = MG.diagonallyDominantMatrix()

print("Power Method:")
print("------------")
print(MO.powerMethod(matrix, 200, [1 for i in range(100)]))
print("Numpy Method")
print("------------")
print(max(np.linalg.eig(matrix)[0]))
```

And corresponding example output:

```python
Enter the dimension of the square matrix: 100
Power Method:
------------ 
804.5038519836337
Numpy Method     
------------
(804.5038519836347+0j)
```

**Implementation:**

```python
def powerMethod(matrix, n, x):
    eigenVector = x

    # Computes the Eigenvector
    for i in range(n):
        eigenVector = matrixVecProd(matrix, eigenVector)
        eigenVector = VO.scalarMult((1/ VO.normMax(eigenVector)), eigenVector)
    
    # Uses Rayleigh quotient to compute the associated eigenvalue
    Au = matrixVecProd(matrix, eigenVector)
    uTAu = VO.dotProd(eigenVector, Au)
    eigenValue = uTAu * (1/VO.dotProd(eigenVector, eigenVector))

    return eigenValue
```


