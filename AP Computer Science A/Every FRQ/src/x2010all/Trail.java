package x2010all;

public class Trail
{
  /** Representation of the trail. The number of markers on the trail is markers.length. */
  private int[] markers;

  /** Constructs a new Trail object. */
  public Trail(int[] markers)
  {
    int n = markers.length;
    this.markers  = new int[n];
    for (int i = 0; i < n; i++)
      this.markers[i] = markers[i];
  }

  // Part (a)

  /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
   *  an ending marker, and all markers between those two markers.
   *  A trail segment is level if it has a difference between the maximum elevation
   *  and minimum elevation that is less than or equal to 10 meters.
   *  @param start the index of the starting marker
   *  @param end the index of the ending marker
   *  Precondition: 0 <= start < end <= markers.length - 1
   *  @return true if the difference between the maximum and minimum
   *  elevation on this segment of the trail is less than or equal to 10 meters;
   *  false otherwise.
   */
  public boolean isLevelTrailSegment(int start, int end)
  {
    int max = markers[start];
    int min = markers[start];

    for (int i = start + 1; i <= end; i++)
    {
      if (markers[i] > max)
        max = markers[i];
      if (markers[i] < min)
        min = markers[i];
    }

    return max - min <= 10;
  }

  // Alternative solution:

/*
  public boolean isLevelTrailSegment(int start, int end)
  {
    for (int i = start; i < end; i++)
      for (int j = i+1; j <= end; j++)
        if (Math.abs(markers[i] - markers[j]) > 10)
          return false;
    return true;
  }
*/

  // Part (b)

  /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
   * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
   * with 3 or more such changes is rated difficult.
   * @return true if the trail is rated difficult; false otherwise.
   */
  public boolean isDifficult()
  {
    int count = 0;

    for (int i = 0; i < markers.length - 1; i++)
    {
      if (Math.abs(markers[i+1] - markers[i]) >= 30)
        count++;
    }

    return count >= 3;
  }

  public static void main(String[] args)
  {
    int[] elevations = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
    Trail t = new Trail(elevations);
    System.out.println(t.isLevelTrailSegment(7, 10));
    System.out.println(t.isLevelTrailSegment(2, 12));
    System.out.println(t.isDifficult());
  }
}