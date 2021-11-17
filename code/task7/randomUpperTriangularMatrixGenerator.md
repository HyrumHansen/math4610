# Random Upper Triangular Square Matrix Generator

**Routine Name:** upperRandomMatrix()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates a random upper triangular square matrix.

**Input:** The upperRandomMatrix() function takes no inputs. Simply call the method and you will be walked through the necessary inputs.

**Usage:** Usage is straightforward, just call the function.

**Implementation:**

```python
def upperRandomMatrix():
    matrix = []
    dimension = int(input("Enter the dimension of the square matrix: "))
    for i in range(dimension):
        row = []

        for j in range(dimension):
            if j >= i:
                row.append(random.randint(0,9))
            else:
                row.append(0)

        matrix.append(row)

    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.upperRandomMatrix()

for row in myMatrix:
    print(row)
```

and the corresponding output:

```
Enter the dimension of the square matrix: 5
[5, 1, 8, 2, 8]
[0, 3, 2, 7, 9]
[0, 0, 3, 1, 2]
[0, 0, 0, 4, 0]
[0, 0, 0, 0, 6]
```


