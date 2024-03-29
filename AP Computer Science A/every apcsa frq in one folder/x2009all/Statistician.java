package x2009all;

import java.util.Arrays;

public class Statistician
{
  // Part (a)

  /** Returns an array of the values obtained by tossing a number cube numTosses times.
   *  @param cube a NumberCube
   *  @param numTosses the number of tosses to be recorded
   *         Precondition: numTosses > 0
   *  @return an array of numTosses values
   */
  public static int[] getCubeTosses(NumberCube cube, int numTosses)
  {
    int[] values = new int[numTosses];
    for (int i = 0; i < numTosses; i++)
      values[i] = cube.toss();
    return values;
  }

  // *************************************************

  // Part (b)

  /** Returns the starting index of a longest run of two or more consecutive repeated values
   *  in the array values.
   *  @param values an array of integer values representing a series of number cube tosses
   *         Precondition: values.length > 0
   *  @return the starting index of a run of maximum size;
   *          -1 if there is no run
   */
  public static int getLongestRun(int[] values)
  {
    int maxRunStart = -1, maxRunLength = 1;
    int runStart = 0, runLength = 1;

    for (int i = 1; i <= values.length; i++)
    {
      if (i < values.length && values[i] == values[i - 1])
      {
        runLength++;
      }
      else
      {
        if (runLength > maxRunLength)
        {
          maxRunStart = runStart;
          maxRunLength = runLength;
        }
        runStart = i;
        runLength = 1;
      }
    }

    return maxRunStart;
  }

  // *************************************************

  public static void main(String[] args)
  {
    NumberCube cube = new NumberCube();
    for (int count = 1; count < 10; count++)
    {
      int[] values = getCubeTosses(cube, 18);
      int maxRunStart = getLongestRun(values);
      System.out.println(Arrays.toString(values) + " ==> " + maxRunStart);
    }
  }
}
