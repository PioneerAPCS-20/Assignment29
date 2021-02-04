# Assignment 29

For this assignment you will perform basic matrix operations (addition, subtraction, and scalar multiplication).

## Initializing

You can give initial values for arrays. Ex: `int[] arr = {3, -1, 9, 10};`

You can also do this for 2D arrays. Ex: `int[][] arr = {{1, 2, 3}, {3, -1 , 9}};`

This would give you the following Matrix:

```
[1  2  3]
[3 -1  9]
```

## Specifications

You will create one class that has 3 methods: one for adding matrices, one for multiplying a matrix by a scalar (a number), one for subtracting matrices (this is the same as multiplying the second matrix by -1 and then adding, so utilize the two previous methods), and one for printing a matrix.

Each method should print the result. 

Note: use regular `for` loops in the `sum` and `product` methods.

### Sample Outputs

Don't need to print each matrix again. Just print the result.

```
[2  3]
[4  10]

+

[1  -1]
[3  -4]

=

[3  2]
[7  6]
```

```
[2  3]
[4  10]

*

-3

=

[-6  -9]
[-12  -30]
```

```
[2  3]
[4  10]

-

[1  -1]
[3  -4]

=

[1  4]
[1  14]
```
### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.

