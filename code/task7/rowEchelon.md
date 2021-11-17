# Row Echelon Matrix Reducer:

**Routine Name:** rowEchelon()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function takes as input a matrix and mutates that matrix. The resultant matrix is in reduced-row-echelon form.

**Usage:** Usage is straightforward; simply input the matrix and it will be reduced.

**Implementation:**

```python
def rowEchelon(matrix):

    for i in range(len(matrix) - 1):
        for j in range(i + 1, len(matrix)):
            scalar = matrix[j][i] / matrix[i][i]
            for k in range(i, len(matrix)):
                matrix[j][k] = matrix[j][k] - scalar * matrix[i][k]
    
    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.squareRandomMatrix()

print("ORIGINAL MATRIX")
for row in myMatrix:
    print(row)

rowEchelon(myMatrix)

print("REDUCED MATRIX")
for row in myMatrix:
    print(row)
```

and the corresponding output:

```python
Enter the dimension of the square matrix: 5
ORIGINAL MATRIX
[3, 3, 7, 5, 1]
[1, 4, 3, 2, 4]
[8, 8, 8, 9, 2]
[4, 3, 4, 7, 3]
[9, 2, 4, 1, 7]
REDUCED MATRIX
[3, 3, 7, 5, 1]
[0.0, 3.0, 0.666666666666667, 0.3333333333333335, 3.6666666666666665]
[0.0, 0.0, -10.666666666666664, -4.333333333333332, -0.6666666666666665]
[0.0, 0.0, 0.0, 2.520833333333333, 3.208333333333333]
[0.0, 0.0, -1.7763568394002505e-15, -8.881784197001252e-16, 22.363636363636363]
```


