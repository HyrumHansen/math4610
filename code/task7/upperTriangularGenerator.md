# Upper Triangular Matrix Generator:

**Routine Name:** upperTri()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function returns an upper triangular matrix.

**Input:** The upperTri() function takes no arguments. Simply call the function and input the requested information to the console.

**Usage:** When the function is called it will request user input. Enter the number of columns and the number of rows and the function will handle the rest.

**Implementation:**

```python
import numpy as np

def upperTri():
    matrix = []
    numRows = int(input("Enter the number of rows: "))
    numCols = int(input("Enter the number of columns: "))

    for i in range(numRows):
        i += 1
        row = []
        for j in range(numCols):
            j += 1
            if j < i:
                row.append(0)
            else:
                row.append(j + i - 1)
        matrix.append(row) 
    return matrix
```

Example Implementation:

```python
import matrixGenerator

myMatrix = matrixGenerator.upperTri()

for i in range(len(myMatrix) - 1):
    print(myMatrix[i])
```

and the corresponding output:

```
Enter the number of rows: 5
Enter the number of columns: 5
[1, 2, 3, 4, 5]
[0, 3, 4, 5, 6]
[0, 0, 5, 6, 7]
[0, 0, 0, 7, 8]
```


