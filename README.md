# Binary Conversion Java Assignment

## Overview

This Java program converts an integer number into its binary representation. It fulfills three parts:

* **Part (a):** Takes an integer input and converts it to binary.
* **Part (b):** Uses a user-defined function to return binary digits as an integer array.
* **Part (c):** Uses a user-defined function to return binary digits as a string.

---

## Features

* Accepts user input from the console
* Converts decimal numbers to binary
* Demonstrates use of arrays and strings
* Implements reusable functions

---

## Program Structure

### `binaryArray(int number)`

* Converts a number into binary
* Stores each bit in an integer array
* Returns the array

### `binaryString(int number)`

* Converts a number into binary
* Stores bits in a string
* Returns the binary string

### `main()`

* Takes user input
* Calls both functions
* Displays results

---

## How to Run

1. Save the file as:

   ```
   BinaryConversionAssignment.java
   ```

2. Compile:

   ```
   javac BinaryConversionAssignment.java
   ```

3. Run:

   ```
   java BinaryConversionAssignment
   ```

---

## Sample Run

### Input

```
27
```

### Output

```
Binary using string function: 11011
Binary using integer array function: 11011
```

---

## Test Cases

| Decimal | Binary |
| ------- | ------ |
| 32      | 100000 |
| 27      | 11011  |
| 26      | 11010  |

> ⚠️ Note: The correct binary of **32** is **100000**.

---

## Concepts Used

* Loops (`while`, `for`)
* Arrays
* Strings
* Functions (methods)
* User input using `Scanner`

---

## Author

Your Name

---

## License

This project is for educational purposes.
