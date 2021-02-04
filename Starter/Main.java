
public class Main
{
    public static void main(String[] args)
    {
        int[][] mat1 = {{2, 3}, {4, 10}};
        int[][] mat2 = {{1, -1}, {3, -4}};

        System.out.println("\nYour \"Results\" should match the \"Solutions\" at the bottom.\n");

        System.out.println("Results:");
        print(sum(mat1, mat2));
        System.out.println();
        print(product(mat1, -3));
        System.out.println();
        print(difference(mat1, mat2));

        System.out.println("\nSolutions: ");
        System.out.println("[3\t2]\n[7\t6]\n\n[-6\t-9]\n[-12\t-30]\n\n[1\t4]\n[1\t14]");
    }

    /**
     * Calculate the sum of two matrices. The two matrices must have the same dimensions.
     *
     * @param  mat1 one of the two matrices to be added
     * @param  mat2 one of the two matrices to be added
     * @return the resulting matrix that is the sum of mat1 and mat2
     */
    public static int[][] sum(int[][] mat1, int[][] mat2)
    {



    }

    /**
     * Calculate the product of a matrix and a scalar.
     *
     * @param  mat1 the matrix
     * @param  a    the scalar
     * @return the resulting matrix that is the product of mat1 and a
     */
    public static int[][] product(int[][] mat1, int a)
    {
    




    }

    /**
     * Calculate the difference of the two matrices.
     *
     * @param  mat1 the minuend matrix
     * @param  mat2 the subtrahend matrix
     * @return the resulting matrix this is the difference between mat1 and mat2
     */
    public static int[][] difference(int[][] mat1, int[][] mat2)
    {

        // mat1 - mat2 = mat1 + (-1 * mat2)

    }


    /**
     * Prints the matrix to the console.
     *
     * @param matrix - the matrix, as 2D integer array, to be printed.
     */
    public static void print(int[][] matrix)
    {
        for(int r = 0; r < matrix.length; r++)
        {
            System.out.print("[");
            for(int c = 0; c < matrix[0].length; c++)
            {
                System.out.print(matrix[r][c]);

                if(c == matrix[0].length - 1)
                {
                    System.out.print("]");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

