import java.util.*;
import java.io.*;

public class Lab2
{
  static Scanner in;

  private int [][] square;
  private int magicConst;
  private int totalCells;
  private boolean[] possible;

  public static void main(String[] args)
  {
    in = new Scanner(System.in);
    int N = in.nextInt();
    System.out.println("N = " + N);
    Main mm = new Main(N);
    mm.fill(0,0);
  }

  // Constructor
  public Main (int N)
  {
    // Default initailized to zeros
    square = new int[N][N];

    // Sum of each row
    magicConst = N*(N*N + 1)/2;
    totalCells = N*N;

    possible = new boolean[totalCells];
    for (int i = 0; i < totalCells; i++)
    {
      possible[i] = true;
    }
  }

  public boolean vaildSquare()
  {
    boolean rowCheck = true;
    boolean colCheck = true;
    boolean diag1Check = true;
    boolean diag2Check = true;

    int rowSum = 0;
    int colSum = 0;

    // Check if row sums to magicConst, go through rows
    for (int r = 0; r < square.length; r++)
    {
      rowSum = 0;

      // Go through cols
      for (int c = 0; c < square.length; c++)
      {
        rowSum = rowSum + square[r][c];
      }

      if (rowSum != magicConst)
        return false;
    }

    // Check if col sums to magicConst
    for (int c = 0; c < square.length; c++)
    {
      colSum = 0;

      for (int r = 0; r < square.length; r++)
      {
        colSum = colSum + square[r][c];
      }

      if (colSum != magicConst)
        return false;

    }
    // Check if diag1 sums to magicConst
    int diagSum = 0;

    for (int i = 0; i < square.length; i++)
    {
      diagSum = diagSum + square[i][i];
    }

    if (diagSum != magicConst)
      return false;

    // Check if diag2 sums to magicConst
    diagSum = 0;

    for (int i = 0; i < square.length; i++)
    {
      diagSum = diagSum + square[i][square.length - 1 - i];
    }

    if (diagSum != magicConst)
      return false;

    // If all checks passed, it's a magic square
      return true;
  }

  // Backtracing
  public void fill(int row, int col)
  {
    // Base case
    if (vaildSquare())
    {
      // output the magicSquare
      System.out.println("Done!!");
      for (int [] i : square)
          System.out.println(Arrays.toString(i));
    }

    // not valid square
    // if(!vaildSquare())
    //   {
    //     return;
    //   }

    // Iterate through all the cells of the matrix
    for (int i = 0; i < totalCells; i++)
    {
      if (possible[i])
      {
        possible[i] = false;
        square[row][col] = i + 1;
        int nextrow = row;
        int nextcol = col + 1;

        // Check to see if we go out of bounds
        // If we do, reset it to the next row
        if (nextcol == square.length)
        {
          nextcol = 0;
          nextrow = nextrow + 1;
        }
        fill(nextrow, nextcol);

        // resetting the cells of the matrix and the numbers to be inserted
        square[row][col] = 0;
        possible[i] = true;
      }
    }
  }
}
