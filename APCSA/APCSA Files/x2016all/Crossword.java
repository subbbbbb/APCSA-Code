package x2016all;

public class Crossword
{
  private Square[][] puzzle;

  /* Part (b) */

  public Crossword(boolean[][] blackSquares)
  {
    int rows = blackSquares.length;
    int cols = blackSquares[0].length;

    puzzle = new Square[rows][cols];
    int num = 1;

    for (int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        if (toBeLabeled(r, c, blackSquares))
        {
          puzzle[r][c] = new Square(false, num);
          num++;
        }
        else
          puzzle[r][c] = new Square(blackSquares[r][c], 0);
      }
    }
  }

  /* Part (a) */

  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
  {
    return !blackSquares[r][c] &&
        (r == 0 || blackSquares[r-1][c] || c == 0 || blackSquares[r][c-1]);
  }

  public Square getSquare(int r, int c) { return puzzle[r][c]; }
}
