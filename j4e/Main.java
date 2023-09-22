/* COP 3503C Assignment 2
This program is written by: Delali Ekpeh */

import java.util.*;

public class Main
{

  static Scanner in = new Scanner(System.in);
  static boolean visited[][];
  static char solution [][];

  public static void main(String [] args)
  {
    // Number of rows in matrix
    int m = in.nextInt();

    // Number of columns
    int n = in.nextInt();

    // Words you need to find from matrix
    int s = in.nextInt();

    solution = new char[m][n];

    char[][] matrix = new char[m][n];
    boolean answer;

    // Collects empty line
    in.nextLine();

    // Fils Matrix
    for (int i = 0; i < m; i++)
    {
      String line = in.nextLine();
      String [] characters = line.split(" ");
      for (int j = 0; j < n; j++)
      {
        matrix[i][j] = characters[j].charAt(0);
      }
    }

    // Search for each word in matrix
    for (int i = 0; i < s; i++)
    {
      String word = in.nextLine();
      System.out.println("Looking for " + word);
      answer = exist(matrix,word, m, n);

      if(answer)
      {
        printWord(matrix);
        System.out.println();
      }
      else
      {
        System.out.println(word + " not found!");
        System.out.println();
      }
    }
    // for (int i = 0; i < m; i++)
    // {
    //   for (int j = 0; j < n; j++)
    //   {
    //     System.out.print(matrix[i][j] + " ");
    //   }
    //   System.out.println();
    // }
  }

  public static boolean exist(char[][]matrix, String word, int rows, int cols)
  {
    //System.out.println(word);
    //System.out.println();
    char [] letters = word.toCharArray();
    visited = new boolean[rows][cols];
  //  System.out.println(letters);

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
      {
        // Depth-First Search
        if (word.charAt(0) == matrix[i][j] && dfs(i,j,0,word,matrix))
          //System.out.println("letter is " + matrix[i][j]);
          return true;
      }
    }
    // Unable to find
    return false;
  }

  public static boolean dfs(int currentRow, int currentCol, int currentIndex, String word, char[][]matrix)
  {
    // Base case
    if (currentIndex == word.length())
      return true;

    if(currentRow < 0 || currentRow >= matrix.length)
      return false;

    if(currentCol < 0 || currentCol >= matrix[currentRow].length)
      return false;

    if (word.charAt(currentIndex) != matrix[currentRow][currentCol] || visited[currentRow][currentCol])
      return false;

      // Place has been visited
      visited[currentRow][currentCol] = true;
    // Depth Search for all 4 directions
      if (dfs(currentRow, currentCol + 1, currentIndex + 1,word,matrix) ||
          dfs(currentRow, currentCol - 1, currentIndex + 1,word,matrix) ||
          dfs(currentRow + 1, currentCol, currentIndex + 1,word,matrix) ||
          dfs(currentRow - 1, currentCol, currentIndex + 1,word,matrix) ||
          dfs(currentRow + 1, currentCol + 1, currentIndex + 1, word, matrix) ||
          dfs(currentRow - 1, currentCol - 1, currentIndex + 1, word, matrix) ||
          dfs(currentRow - 1, currentCol + 1, currentIndex + 1, word, matrix) ||
          dfs(currentRow + 1, currentCol - 1, currentIndex + 1, word, matrix) )
          return true;
       // boolean right = dfs(currentRow, currentCol + 1, currentIndex + 1,word,matrix);
       // boolean left = dfs(currentRow, currentCol - 1, currentIndex + 1,word,matrix);
       // boolean bottom = dfs(currentRow + 1, currentCol, currentIndex + 1,word,matrix);
       // boolean top = dfs(currentRow - 1, currentCol, currentIndex + 1,word,matrix);
       // boolean bottomRight = dfs(currentRow + 1, currentCol + 1, currentIndex + 1, word, matrix);
       // boolean topLeft = dfs(currentRow - 1, currentCol - 1, currentIndex + 1, word, matrix);
       // boolean topRight = dfs(currentRow - 1, currentCol + 1, currentIndex + 1, word, matrix);
       // boolean bottomLeft = dfs(currentRow + 1, currentCol - 1, currentIndex + 1, word, matrix);

       // boolean answer = top || bottom || left || right || topLeft || topRight || bottomLeft || bottomRight;
       // if (answer == false)
        visited[currentRow][currentCol] = false;
      return false;
  }

  public static void printWord(char [][] matrix)
  {
    for(int i  = 0; i < visited.length; i++)
    {
      for(int j = 0; j < visited[i].length; j++)
      {
        // When visited is true in the matrix
        if(visited[i][j])
        {
          solution[i][j] = matrix[i][j];
        }
        // When it's false
        else
        {
          solution[i][j] = ' ';
        }
      }
    }
    // Print Matrix
    for(char [] c : solution)
      System.out.println(Arrays.toString(c));
  }
}
