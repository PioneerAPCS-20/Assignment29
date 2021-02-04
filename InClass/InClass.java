
// import java.util.Scanner;

public class InClass
{
    public static void main(String[] args)
    {
       String[][] board = new String[3][3];

       for(int r = 0; r < board.length; r++)
       {
           for(int c = 0; c < board[0].length; c++)
           {
                board[r][c] = "" + (r * 3 + c % 3 + 1);
           }
       }

       print(board);

       board[1][2] = "X";

       // Get row and col from player move
       // Scanner in = new Scanner(System.in);
       // int move = in.nextInt();
       // int row = (move - 1) / 3;
       // int col = (move - 1) % 3;
       // board[row][col] = "X";

       print(board);
    }

    /*
    public static void print(String[][] board)
    {
        for(String[] arr : board)
        {
            for(String s : arr)
            {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
    */

    public static void print(String[][] board)
    {
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[0].length; c++)
            {
                System.out.print(board[r][c] + "\t");
            }
            System.out.println();
        }
    }
}

