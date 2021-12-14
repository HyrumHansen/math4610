# Condition Number

**Routine Name:** conditionNumber(matrix)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns the condition number for a matrix

**Input:** The conditionNumber() function takes one input:
1. matrix: a square, diagonally dominant matrix

**Output:** The function outputs a value corresponding to the matrix's condition number

**Usage:** Call the function with the required input. See below for usage and output.

```python
matrix = MG.diagonallyDominantMatrix()

print("Matrix Condition Number:")
print("------------")
print(MO.conditionNumber(matrix))
print("Numpy Method")
print("------------")
print(np.linalg.cond(matrix))
```

And corresponding example output:

```python
Matrix Condition Number:
------------
1.6386995143959917
Numpy Method
------------
1.6641666266031336
```

**Implementation:**

```python
def conditionNumber(matrix):
    l_max = powerMethod(matrix, 200, [1 for i in range(len(matrix[0]))])
    l_min = invPowerMethod(matrix, 200, [1 for i in range(len(matrix))])
    return abs(l_max) / abs(l_min)
```


