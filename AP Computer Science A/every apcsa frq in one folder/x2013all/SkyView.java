package x2013all;

public class SkyView
{
  /** A rectangular array that holds the data representing a rectangular area of the sky. */
  private double[][] view;

  // Part(a)

  /** Constructs a SkyView object from a 1-dimensional array of scan data.
   *  @param numRows the number of rows represented in the view
   *         Precondition: numRows > 0
   *  @param numCols the number of columns represented in the view
   *         Precondition: numCols > 0
   *  @param scanned the scan data received from the telescope, stored in telescope order
   *         Precondition: scanned.length == numRows * numCols
   *  Postcondition: view has been created as a rectangular 2-dimensional array
   *                 with numRows rows and numCols columns and the values in
   *                 scanned have been copied to view and are ordered as
   *                 in the original rectangular area of sky.
   */
  public SkyView(int numRows, int numCols, double[] scanned)
  {
    view = new double[numRows][numCols];
    int row = 0, col = 0, step = 1;
    for (double amtLight : scanned)
    {
      view[row][col] = amtLight;
      int nextCol = col + step;
      if (nextCol >= 0 && nextCol < numCols)
        col = nextCol;
      else
      {
        row++;
        step = -step;
      }
    }

/* Or:

    view = new double[numRows][numCols];
    int row = 0, col = 0;
    for (double amtLight : scanned)
    {
      view[row][col] = amtLight;
      int nextCol = col + 1 - 2*(row % 2);
      if (nextCol >= 0 && nextCol < numCols)
        col = nextCol;
      else
        row++;
    }
Or:

    view = new double[numRows][numCols];
    int row = 0, col = 0;
    for (double amtLight : scanned)
    {
      view[row][col] = amtLight;
      int nextCol = col;
      if (row % 2 == 0)
        nextCol++;
      else
        nextCol--;
      if (nextCol >= 0 && nextCol < numCols)
        col = nextCol;
      else
        row++;
    }

Or:

    view = new double[numRows][numCols];
    for (int row = 0; row < numRows; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        int i = row * numCols;
        if (row % 2 == 0)
          i += col;
        else
          i += numCols - col - 1;
        view[row][col] = scanned[i];
      }
    }
*/
  }

  // Part(b)

  /** Returns the average of the values in a rectangular section of view.
   *  @param startRow the first row index of the section
   *  @param endRow the last row index of the section
   *  @param startCol the first column index of the section
   *  @param endCol the last column index of the section
   *  Precondition: 0 <= startRow <= endRow < view.length
   *  Precondition: 0 <= startCol <= endCol < view[0].length
   *  @return the average of the values in the specified section of view
   */
  public double getAverage(int startRow, int endRow,
                           int startCol, int endCol)
  {
    double sum = 0.0;
    for (int r = startRow; r <= endRow; r++)
      for (int c = startCol; c <= endCol; c++)
        sum += view[r][c];
    return sum / ((endRow - startRow + 1) * (endCol - startCol + 1));
  }

  /*******************************************************************************/

  public static void main(String[] args)
  {
    double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};

    SkyView test = new SkyView(4, 3, scanned);

    for (int r = 0; r < 4; r++)
    {
      for (int c = 0; c < 3; c++)
      {
        System.out.printf("%3.1f ", test.view[r][c]);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Average = " + test.getAverage(1, 2, 0, 1));
  }
}