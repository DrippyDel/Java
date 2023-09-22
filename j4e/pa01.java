/*=============================================================================
| Assignment: pa01 - Encrypting a plaintext file using the Hill cipher
|
| Author: Delali Ekpeh
| Language: Java
|
| To Compile: javac pa01.java
| gcc -o pa01 pa01.c
| g++ -o pa01 pa01.cpp
| go build pa01.go
|
| To Execute: java -> java pa01 kX.txt pX.txt
| or c++ -> ./pa01 kX.txt pX.txt
| or c -> ./pa01 kX.txt pX.txt
| or go -> ./pa01 kX.txt pX.txt
| or python -> python3 pa01.py kX.txt pX.txt
| where kX.txt is the keytext file
| and pX.txt is plaintext file
|
| Note: All input files are simple 8 bit ASCII input
|
| Class: CIS3360 - Security in Computing - Summer 2023
| Instructor: McAlpin
| Due Date: 6/23/23
|
+=============================================================================*/
public class pa01
{
  public static void main(String[] args)
  {

    // Checks if correct number of command line arguments was entered.
    if (args.length != 2)
    {
      System.err.print("Invaild number of command line arguments!\n");
      System.exit(1);
    }

    // Reads key in file
    String fileName = args[0];
    int[][] keyMatrix = readKeyMatrix(fileName);

    // Reads text file
    String txtFileName = args[1];
    String txt = readText(txtFileName)

    // // Getting block size of the Hill matrix
    // // Used to see how much to pad text with
    // int blockLength = keyMatrix.length;
    // int txtLength = txt.length();
    // int padLength = (blockLength - (txtLength % blockLength));
    //
    // // Padding the text with x at the end
    // txt = txt + "x".repeat(padLength);
    //
    // List<String> blocks = divideToBlocks(txt,blockLength);
    // StringBuilder cipherTxt = new StringBuilder();
    //
    //   // Advance for loop blook in blocks
    //   for (String block : blocks)
    //   {
    //     int[] colVector = strColVector(block);
    //     int[] encryptColVector = matrixColVector(keyMatrix, colVector);
    //     cipherTxt.append(co)
    //   }

    System.out.print("Key Matrix: \n");
    // Formating Matrix
    for (int i = 0; i < keyMatrix.length; i++)
    {
      // System.out.print("Here" + keyMatrix[i]);
      for (int j = 0; j < keyMatrix[i].length; j++)
      {
        // System.out.print("Here" + keyMatrix[i][j] + " ");
        System.out.print(keyMatrix[i][j] + " ");
      }
      System.out.print("\n");
    }

    System.out.print("Text: \n");
    // Process text
    for (int i = 0; i < txt.length(); i++)
    {
      System.out.print(txt.charAt(i));
      // 80 letters per row
      if ((i + 1) % 80 == 0)
      {
        System.out.print("\n");
      }
    }
    System.out.print("\n\n");
    //Encrypting text
    String cipher = encrypt(keyMatrix, txt);


    System.out.print("Cipher Text: \n");
    // Output Cipher Text
    for (int i = 0; i < cipher.length(); i++)
    {
      System.out.print(cipher.charAt(i));
      // 80 letters per row
      if ((i + 1) % 80 == 0)
      {
        System.out.print("\n");
      }
    }

  }

  // Reads text from file
  // Returns text
  public static String readText(String fileName)
  {
    String text = "";

    // Opens and scans file
    Scanner sc = new Scanner(new File(fileName));

    // Traverse file line by line
    while (sc.hasNext())
    {
      // Makes each char lowercase
      String line = sc.nextLine().toLowerCase();

      for (int i = 0; i < line.length(); i++)
      {
        // Ignores punctuation and spaces
        if (Character.isLetter(line.charAt(i)))
        {
          text = text + line.charAt(i);
        }
      }
    }
    // Closes file
    sc.close();

    return text;
  }

  // Read Matrix from file.
  // Returns key matrix
  public static int[][] readKeyMatrix(String fileName)
  {
    int[][] matrix = NULL;

    // Opens and scans file
    Scanner sc = new Scanner(new File(fileName));

    // Matrix size
    int matrixSize = sc.nextInt();
    matrix = new int[matrixSize][matrixSize];

    // Reads Matrix
    for (int i = 0; i < matrixSize; i++)
    {
      for (int j = 0; j < matrixSize; j++)
      {
        // System.out.println(matrix[i][j]);
        matrix[i][j] = sc.nextInt();
      }
    }
    // Closes file
    sc.close();

    return matrix;
  }

  // Encrypts text with given matrix
  // Returns cipher text
  public static String encrypt(int[][] keyMatrix, String text)
  {
    String cipher = "";

    // Padding the text with x at the end
    while (text.length() % keyMatrix.length != 0)
      text = text + 'x';

    // Encrypting the text
    for (int i = 0; i < text.length; i = i + keyMatrix.length)
    {
      int cipherBlock = new int[keyMatrix.length];
      int txtBlock = new int[keyMatrix.length];

      // Creates text block
      for (int j = 0; j < keyMatrix.length; j++)
      {
        // Got to be lowercase
        txtBlock[j] = text.charAt(i + j) - 'a';
      }

      for (int j = 0; j < keyMatrix.length; j++)
      {
        for (int index = 0; index < keyMatrix.length; index++)
        {
          cipherBlock[j] = cipherBlock + (keyMatrix[j][index] * txtBlock[index]);
        }
        // All letters
        cipherBlock[j] = cipherBlock % 26;
        cipher = cipher + (char)(cipherBlock[j] + 'a');
      }
    }

    return cipher;
  }
}
/*=============================================================================
| I Delali Ekpeh (de770238) affirm that this program is
| entirely my own work and that I have neither developed my code together with
| any another person, nor copied any code from any other person, nor permitted
| my code to be copied or otherwise used by any other person, nor have I
| copied, modified, or otherwise used programs created by others. I acknowledge
| that any violation of the above terms will be treated as academic dishonesty.
+=============================================================================*/
