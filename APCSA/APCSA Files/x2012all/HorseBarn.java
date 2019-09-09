package x2012all;

import java.util.Arrays;

public class HorseBarn
{
  /** The spaces in the barn. Each array element holds a reference to the horse
   * that is currently occupying the space. A null value indicates an empty space.
   */
  private Horse[] spaces;

  public HorseBarn(Horse[] horses)
  {
    int n = horses.length;
    spaces = new Horse[n];
    for (int i = 0; i < n; i++)
      spaces[i] = horses[i];
  }

  // Part (a)

  /** Returns the index of the space that contains the horse with the specified name.
   * Precondition: No two horses in the barn have the same name.
   * @param name the name of the horse to find
   * @return the index of the space containing the horse with the specified name;
   * -1 if no horse with the specified name is in the barn.
   */
  public int findHorseSpace(String name)
  {
    for (int i = 0; i < spaces.length; i++)
      if (spaces[i] != null && spaces[i].getName().equals(name))
        return i;
    return -1;
  }

  // Part (b)

  /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
   * starting at index 0, with no empty space between any two horses.
   * Postcondition: The order of the horses is the same as before the consolidation.
   */
  public void consolidate()
  {
    Horse[] temp = new Horse[spaces.length];  // Values initialized to null by default
    int j = 0;
    for (int i = 0; i < spaces.length; i++)
    {
      if (spaces[i] != null)
      {
        temp[j] = spaces[i];
        j++;
      }
    }
    spaces = temp;
  }

/*
  public void consolidate()
  {
    // 1. Find the first empty space:
    int emptySpaceIndex = 0;
    while (emptySpaceIndex < spaces.length && spaces[emptySpaceIndex] != null)
      emptySpaceIndex++;

    // 2. Move horses:
    int i = emptySpaceIndex + 1;
    while (i < spaces.length)
    {
      if (spaces[i] != null)
      {
        spaces[emptySpaceIndex] = spaces[i];
        spaces[i] = null;
        emptySpaceIndex++;
      }
      i++;
    }
  }
*/

/*
  public void consolidate()
  {
    int emptySpaceIndex = 0;
    for (int i = 0; i < spaces.length; i++)
    {
      if (spaces[i] != null)
      {
        // Find the first empty space, if any, preceeding i:
        while (emptySpaceIndex < i && spaces[emptySpaceIndex] != null)
          emptySpaceIndex++;
        if (i != emptySpaceIndex)
        {
          spaces[emptySpaceIndex] = spaces[i];
          spaces[i] = null;
        }
      }
    }
  }
*/

  public String toString()
  {
    return Arrays.toString(spaces);
  }
}