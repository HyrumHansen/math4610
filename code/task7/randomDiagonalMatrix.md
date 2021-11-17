# Random Lower Triangular Square Matrix Generator

**Routine Name:** randomDiagonalMatrix()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates a square matrix with random integers between 1 and 9 on the diagonal and zeros elsewhere.

**Input:** The randomDiagonalMatrix() function takes no inputs. Simply call the method and you will be walked through the necessary inputs.

**Usage:** Usage is straightforward, just call the function.

**Implementation:**

```python
def randomDiagonalMatrix():
    matrix = []
    dimension = int(input("Enter the dimension of the square matrix: "))
    for i in range(dimension):
        row = []

        for j in range(dimension):
            if j == i:
                row.append(random.randint(1,9))
            else:
                row.append(0)

        matrix.append(row)

    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.randomDiagonalMatrix()

for row in myMatrix:
    print(row)
```

and the corresponding output:

```
Enter the dimension of the square matrix: 5
[2, 0, 0, 0, 0]
[0, 8, 0, 0, 0]
[0, 0, 5, 0, 0]
[0, 0, 0, 4, 0]
[0, 0, 0, 0, 5]
```


