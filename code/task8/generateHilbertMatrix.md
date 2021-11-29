# Hilbert Matrix Generator

**Routine Name:** hilbertMatrix()

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This function generates the Hilbert matrix of a given dimension

**Input:** hilbertMatrix() function takes no inputs, simply call the function and assign it to a variable

**Output:** The function outputs a Hilbert matrix

**Usage:** Call the function.

**Implementation:**

```python
def hilbertMatrix():
    matrix = []
    dimension = int(input("Enter the dimension of the Hilbert matrix: "))
    for i in range(dimension):
        row = []
        for j in range(dimension):
            denominator = (i + 1) + (j + 1) - 1
            row.append(1/denominator)
        matrix.append(row)
    return matrix
```

Example Implementation:

```python
myMatrix = matrixGenerator.hilbertMatrix()

print("The Hilbert Matrix: ")
for row in myMatrix:
    print(row)
```


and the corresponding output:

```python 
Enter the dimension of the Hilbert matrix: 4

The Hilbert Matrix: 
[1.0, 0.5, 0.3333333333333333, 0.25]
[0.5, 0.3333333333333333, 0.25, 0.2]
[0.3333333333333333, 0.25, 0.2, 0.16666666666666666] 
[0.25, 0.2, 0.16666666666666666, 0.14285714285714285]
```



