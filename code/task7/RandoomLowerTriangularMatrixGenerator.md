# Random Lower Triangular Square Matrix Generator

**Routine Name:** lowerRandomMatrix()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates a random lower triangular square matrix.

**Input:** The lowerRandomMatrix() function takes no inputs. Simply call the method and you will be walked through the necessary inputs.

**Usage:** Usage is straightforward, just call the function.

**Implementation:**

```python
def lowerRandomMatrix():
    matrix = []
    dimension = int(input("Enter the dimension of the square matrix: "))
    for i in range(dimension):
        row = []

        for j in range(dimension):
            if j <= i:
                row.append(random.randint(0,9))
            else:
                row.append(0)

        matrix.append(row)

    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.lowerRandomMatrix()

for row in myMatrix:
    print(row)
```

and the corresponding output:

```
Enter the dimension of the square matrix: 5
[1, 0, 0, 0, 0]
[9, 4, 0, 0, 0]
[4, 0, 8, 0, 0]
[3, 5, 9, 1, 0]
[7, 5, 2, 7, 7]
```


