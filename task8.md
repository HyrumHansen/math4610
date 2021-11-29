### MATH 4610: Fundementals of Computational Mathematics 
***

## TASK 8:

### Question 1:

A python script was written to solve a square linear system using Gaussian elimnation and backsubstitution. Implementation details may be found [here](https://github.com/HyrumHansen/math4610/blob/main/code/task8/gaussianEliminationSystemSolution.md). This function can be used safely with a diagonally dominant matrix. Below is an example of usage. First the randomly generated diagonally-dominant matrix:

```python
myMatrix = matrixGenerator.diagonallyDominantMatrix()

for row in myMatrix:
    print(row)
```

which gives 

```python
[18, 4, 4]
[2, 23, 5]
[2, 2, 16]
```
and the code to print the solution for a randomly chosen vector b with length equal to the matrix dimension:

```python
solution = solve(myMatrix, [2, 4, 3])

print("The solution is:")
for i in range(len(solution)):
    print("X[%d]: %0.2f" % (i, solution[i]))
```

which gives

```python
The solution is:
X[0]: 0.04
X[1]: 0.13
X[2]: 0.17
```
