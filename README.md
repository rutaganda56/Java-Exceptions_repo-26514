# INTRODUCTION
## Names
### Rutaganda jean Valentin
## ID
### 26514
# PROJECT SUMMARY
This project was about exception handling in java which is going to be explained below --->>>
# EXCEPTIONS
## IOException:

### What it is:
This exception occurs when there is a problem with input/output operations, such as reading or writing data to a file or network.
### Example:
Trying to read from a file that is not accessible.
## FileNotFoundException:

### What it is: 
This is a specific type of IOException. It occurs when a program attempts to access a file that doesn't exist or cannot be found.
### Example: 
Trying to open a file that doesn't exist in the specified location.
## EOFException (End of File Exception):

### What it is:
This exception is thrown when an input stream reaches the end of a file or data unexpectedly, meaning there is no more data to read.
### Example:
Reading data from a file, but the end is reached before the expected amount of data.
## SQLException:

### What it is:
This exception occurs when there is an error with SQL queries or the interaction with a database.
### Example:
Trying to execute an invalid SQL query or connecting to a database that isn't available.
## ClassNotFoundException:

### What it is:
This exception happens when Java tries to load a class that cannot be found (e.g., a class file is missing).
### Example:
Trying to load a class dynamically, but the class file is missing or unavailable.
## ArithmeticException:

### What it is: 
This exception is thrown when an arithmetic operation goes wrong, like dividing by zero.
### Example:
int result = 10 / 0; will throw an ArithmeticException.
## NullPointerException:

### What it is:
This exception occurs when trying to use an object reference that is null (i.e., not pointing to any object).
### Example:
Attempting to call a method on a null object.
## ArrayIndexOutOfBoundsException:

### What it is:
This exception happens when trying to access an array index that doesn't exist (e.g., an index outside the array’s size).
### Example: 
Accessing the 10th element in an array that only has 5 elements.
## ClassCastException:

### What it is:
This exception is thrown when trying to cast an object to a type it doesn't belong to.
### Example:
Trying to cast an object of class String to class Integer.
## IllegalArgumentException:

### What it is:
This exception occurs when a method is passed an argument that is not appropriate or valid.
### Example:
Passing a negative number when a method requires a positive number.
## NumberFormatException:

### What it is:
This exception happens when trying to convert a string to a numeric type (like an integer or float) and the string doesn't represent a valid number.
### Example:
Trying to convert the string "abc" to an integer with Integer.parseInt("abc").
# Conclusion
Java exceptions are used to handle errors or unusual situations that occur during the execution of a program. They help in making the program more robust by allowing it to continue running even when an error occurs, instead of crashing immediately.
