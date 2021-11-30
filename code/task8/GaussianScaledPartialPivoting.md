# Gaussian Elimnation with Scaled Partial Pivoting

**Routine Name:** gaussian_SPP(matrix, b)

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function uses scaled partial pivoting in conjunction with Gaussian elimination to solve a square linear system

**Input:** The gaussian_SPP() function takes two inputs:
1. matrix: a square matrix
2. b: the right hand side vector

**Output:** The function outputs the vector x which solves Ax = b.

**Usage:** Call the function with the required inputs and assign the output to a new variable.

**Implementation:**

```python
import numpy as np
from copy import copy

def gaussian_SPP(matrix, b):

    dim = len(matrix)

    # Creating the augmented matrix for future manipulation
    C = np.zeros((dim, dim + 1))
    C[:, 0:dim],C[:, dim] = matrix, b

    for j in range(dim):

        p = j 
        for i in range(j+1,dim):
            if abs(C[i,j]) > abs(C[p,j]): p = i

        # Swaps rows to put biggest element in the correct position
        C[p,:],C[j,:] = copy(C[j,:]),copy(C[p,:])
        pivot = C[j,j]

        # Scaling the row by the new pivot
        C[j,:] = C[j,:] / pivot

        # A consolidated form of elimination using itertools
        for i in range(dim):
            if i == j: continue
            C[i,:] = C[i,:] - C[i,j]*C[j,:]

    x = C[:, dim]

    return x
```

Example Implementation:

```python
import LU_factorization as lu
import matrixGenerator
from rhs_calc import rhs_calc
from partialpivoting import gaussian_SPP


h4 = matrixGenerator.hilbertMatrix()

h4_RHS = rhs_calc(h4)
print("The Right-Hand Side vector (each entry is the sum of the corresponding row): ")
for i in h4_RHS:
    print(i)


L, U = lu.luFactorization(h4)

y = gaussian_SPP(h4, h4_RHS)

print("The solution vector (should be all ones): ")
for i in y:
    print(i)
```


and the corresponding output:

```python 
Enter the dimension of the Hilbert matrix: 10

The Right-Hand Side vector (each entry is the sum of the corresponding row): 
2.9289682539682538
2.019877344877345
1.603210678210678
1.3468004218004217
1.168228993228993
1.03489565989566
0.9307289932289933
0.8466953797836152
0.7772509353391707
0.718771403175428

The solution vector (should be all ones):
0.9999999989907247
1.0000000867039023
0.9999981614025927
1.0000166550216785
0.9999207951374189
1.000217181992551
0.9996444519400818
1.0003429361561054
0.9998202672529901
1.0000394660715892
```



