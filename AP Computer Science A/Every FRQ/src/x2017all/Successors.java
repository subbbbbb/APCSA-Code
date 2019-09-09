package x2017all;

public class Successors
{
  /**************** Part (a) ****************/

  public static Position findPosition(int num, int[][] intArr)
  {
    for (int r = 0; r < intArr.length; r++)
      for (int c = 0; c < intArr[0].length; c++)
        if (intArr[r][c] == num)
          return new Position(r, c);
    return null;
  }

  /**************** Part (b) ****************/

  public static Position[][] getSuccessorArray(int[][] intArr)
  {
    int rows = intArr.length;
    int cols = intArr[0].length;

    Position[][] succ = new Position[rows][cols];
    for (int r = 0; r < rows; r++)
      for (int c = 0; c < cols; c++)
      {
        int num = intArr[r][c];
        succ[r][c] = findPosition(num + 1, intArr);
      }
    return succ;
  }
}
