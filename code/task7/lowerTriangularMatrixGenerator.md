# Lower Triangular Matrix Generator

**Routine Name:** lowerTri()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates a lower triangular matrix.

**Input:** The lowerTri() function take sno inputs. Simply call the method and you will be walked through the necessary inputs.

**Usage:** Usage is straightforward, just call the function.

**Implementation:**

```python
def lowerTri():
    myMatrix = upperTri()
    myMatrix = [[myMatrix[j][i] for j in range(len(myMatrix))] for i in range(len(myMatrix[0]))]
    return myMatrix
```

Example Implementation:

```python
import matrixGenerator
import linearSolver
import numpy as np


transposedMatrix = matrixGenerator.lowerTri()

for row in transposedMatrix:
    print(row)
```

and the corresponding output:

```
Enter the number of rows: 5
Enter the number of columns: 5
[1, 0, 0, 0, 0]
[2, 3, 0, 0, 0]
[3, 4, 5, 0, 0]
[4, 5, 6, 7, 0]
[5, 6, 7, 8, 9]
```


