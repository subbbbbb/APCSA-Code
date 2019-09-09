package x2011all;

public class RouteCipher
{
  /** A two-dimensional array of single-character strings, instantiated in the constructor */
  private String[][] letterBlock;

  /** The number of rows of letterBlock, set by the constructor */
  private int numRows;

  /** The number of columns of letterBlock, set by the constructor */
  private int numCols;

  // Part (a)

  /** Places a string into letterBlock in row-major order.
   *  @param str the string to be processed
   *  Postcondition:
   *    if str.length() < numRows * numCols, "A" is placed in each unfilled cell
   *    if str.length() > numRows * numCols, trailing characters are ignored
   */
  private void fillBlock(String str)
  {
    int i = 0;

    for (int r = 0; r < numRows; r++)
    {
      for (int c = 0; c < numCols; c++)
      {
        if (i < str.length())
          letterBlock[r][c] = str.substring(i, i+1);
        else
          letterBlock[r][c] = "A";
        i++;
      }
    }
  }

  /** Extracts encrypted string from letterBlock in column-major order.
   *  Precondition: letterBlock has been filled
   *  @return the encrypted string from letterBlock
   */
  private String encryptBlock()
  {
    String str = "";

    for (int c = 0; c < numCols; c++)
      for (int r = 0; r < numRows; r++)
        str += letterBlock[r][c];

    return str;
  }

  // Part (b)

  /** Encrypts a message.
   * @param message the string to be encrypted
   * @return the encrypted message;
   *         if message is the empty string, returns the empty string
   */
  public String encryptMessage(String message)
  {
    String code = "";
    while (message.length() > 0)
    {
      int n = numRows * numCols;
      if (n > message.length())
        n = message.length();
// Or: int n = Math.min(numRows * numCols, message.length());
      fillBlock(message.substring(0, n));
// Or: fillBlock(message);
      code += encryptBlock();
      message = message.substring(n);
    }
    return code;
  }

  public static void main (String[] args)
  {
    RouteCipher c = new RouteCipher();
    c.numRows = 2;
    c.numCols = 3;
    c.letterBlock = new String[c.numRows][c.numCols];
    System.out.println("[" + c.encryptMessage("Meet at midnight") +"]");
  }
}