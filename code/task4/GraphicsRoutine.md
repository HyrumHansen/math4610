# Graphics Routine:

**Routine Name:** graphicsRoutine

**Author:** Hyrum Hansen

**Language:** Python

**Description:** This is a Python script which takes in user data (entered to the console) and outputs a graph.

**Input:** The user must first specify the number of functions they would like to plot. An upper bound of 5 is suggested. An attempt to plot more functions will exceed the index limit of the color vector.

**Output:** The script outputs a plot with all the points plotted.

**Usage:** The program will prompt the user to input the data. Here is an example:

```
How many functions would you like to graph? (maximum of 5) 3

Enter values for function 1:
Enter an ordered pair separated by a space (Ex:1 2):0 1
Would you like to enter another value? (y/n)
Enter an ordered pair separated by a space (Ex:1 2):1 4
...
Enter values for function 2:
Enter an ordered pair separated by a space (Ex:1 2):0 5
Would you like to enter another value? (y/n)
Enter an ordered pair separated by a space (Ex:1 2):1 4
...
Enter values for function 3:
Enter an ordered pair separated by a space (Ex:1 2):0 0
...
```
Which outputs the following plot:

**Implementation:**

```python
import matplotlib.pyplot as plt

listNumber = int(input("How many functions would you like to graph? (maximum of 5)"))

# To store all the input values
dataArray = []

for i in range(listNumber):

    print("\nEnter values for function " + str(i + 1) + ":")

    finished = False
    while not finished:

        # Take the user input data
        x, y = input("Enter an ordered pair separated by a space (Ex:1 2):").split()

        # Enter another point for this function?
        finishedProxy = input("Would you like to enter another value? (y/n)")

        # Conditional termination
        if finishedProxy == "n":
            finished = True

        dataArray.append([i, int(x), int(y)])

# To keep track of the function number
function = 0
colors = ['r', 'g', 'b', 'c', 'm']

while function < listNumber:

    x_coordinates = []
    y_coordinates = []

    for i in range(len(dataArray)):
        if function == dataArray[i][0]:
            x_coordinates.append(dataArray[i][1])
            y_coordinates.append(dataArray[i][2])

    plt.plot(x_coordinates, y_coordinates, color=colors[function], label="Function" + str(function))
    function += 1

plt.xlabel("x-value")
plt.ylabel("y-value")
plt.legend()
plt.show()
```
