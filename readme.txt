Console:
isaac@isaac-IdeaPad-3-15ALC6:~/Documents/GitHub/Project-1$  cd /home/isaac/Documents/GitHub/Project-1 ; /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -cp /home/isaac/.config/Code/User/workspaceStorage/ddfff6c3ab07486957795970685941c3/redhat.java/jdt_ws/Project-1_cbc84f1f/bin Main 
It took 2072 milliseconds to put 50,000,000 elements in the array list
It took 34669 ms to sort the Array List;
It took 1638 milliseconds to put 50,000,000 elements in the vector
It took 35602 milliseconds to sort the Vector
It took 1265 milliseconds to put 50,000,000 elements in the array
It took 35858 milliseconds to sort the Array

Result 1:
Fastest Initialization: Array
Fastest Sort: Array List

Result 2:
Fastest Initialization: Array
Fastest Sort: Vector

Result 3:
Fastest Initialization: Array
Fastest Sort: Vector

Result 4:
Fastest Initialization: Array
Fastest Sort: Array List

Result 5:
Fastest Initialization: Array
Fastest Sort: Vector

Result 6:
Fastest Initialization: Array
Fastest Sort: Array

Result 7:
Fastest Initialization: Array
Fastest Sort: Vector

Result 8:
Fastest Initialization: Array
Fastest Sort: Vector

Result 9:
Fastest Initialization: Array
Fastest Sort: Array

Result 10:
Fastest Initialization: Array
Fastest Sort: Array List

Looking through the results we can see that the Array tends to initialize with values the quickest of the 3, likely due to declaring the size of it from the start. The vector usually fell behind the array, initializing quicker than the Array List. When it came to sorting, the Vectors and Array Lists usually came out neck and neck (with the Vector usually slightly ahead) and the array usually falling behind. Just as a test I also ran a few iterations of my code with sizes declared in all of the collection, and saw that they all usually fell within a 100ms cushion of each other.