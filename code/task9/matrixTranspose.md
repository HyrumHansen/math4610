# Matrix Transpose

**Routine Name:** matrixTranspose(matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the tranpose of a matrix

**Input:** The matrixTranspose() function takes one input
1. matrix: a matrix

**Output:** The function outputs a matrix corresponding to the tranpose of the passed matrix

**Usage:** Call the function with the required input. See below for usage and output.

```python
import matrixOperations as MO

matrix2 = [[-1, 2, 9],[4, 16, 3],[1, 7, 4], [1, 2, 3]]

newMatrix = MO.matrixTranspose(matrix2)
for row in newMatrix:
    print(row)
```

And corresponding example output:

```python
[-1, 4, 1, 1]
[2, 16, 7, 2]
[9, 3, 4, 3]
```

**Implementation:**

```python
def matrixTranspose(matrix):
    # Build a new matrix of the transposed size but with zero entries
    newMatrix = []
    row = []
    for i in range(len(matrix)): 
        row.append(0)
    for j in range(len(matrix[0])):
        newMatrix.append(row)
    
    # Transpose the matrix   
    newMatrix = [[matrix[j][i] for j in range(len(matrix))] for i in range(len(matrix[0]))]
    return newMatrix
```


