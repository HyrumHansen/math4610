# Random Square Matrix Generator

**Routine Name:** squareRandomMatrix()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates a random square matrix.

**Input:** The squareRandomMatrix() function takes no inputs. Simply call the method and you will be walked through the necessary inputs.

**Usage:** Usage is straightforward, just call the function.

**Implementation:**

```python
def squareRandomMatrix():
    matrix = []
    dimension = int(input("Enter the dimension of the square matrix: "))
    for i in range(dimension):
        row = []

        for j in range(dimension):
            row.append(random.randint(0,9))

        matrix.append(row)

    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.squareRandomMatrix()

for row in myMatrix:
    print(row)
```

and the corresponding output:

```
Enter the dimension of the square matrix: 5
[3, 8, 7, 4, 6]
[6, 0, 2, 6, 4]
[3, 1, 3, 4, 2]
[4, 8, 3, 8, 9]
[8, 9, 2, 5, 3]
```


