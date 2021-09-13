import numpy as np
from matplotlib import pyplot as plt
from scipy.stats import linregress

incrementValues = [1, 0.5]

for i in range(1, 17):
    incrementValues.append(10**-i)

errorValues = [0.0335433542, 0.0085977997, 0.0003466735, 0.0000034679, 0.0000000346, 0.0000000195, 0.0000002802,
               0.0001462692, 0.0223912582, 0.6940761881, 55.0950043947, 5550.6989762892, 555111.0961657410,
               0.4161468365, 5551115122.709628, 1665334536938.1484, 277555756156288.28, 0.4161468365]

plt.plot(np.log(incrementValues), np.log(errorValues))
plt.title("Error in the Difference Quotient of the Derivative")
plt.xlabel("Increment Values: h")
plt.ylabel("Approximation Error")
plt.savefig('plot1.png')
plt.show()


print(linregress(np.log(incrementValues[0:5]), np.log(errorValues[0:5])))
