package x2005all;

public class StudentRecord
{
  private int[] scores; // contains scores.length values
                        // scores.length > 1

  public StudentRecord(int[] nums)
  {
    scores = new int[nums.length];
    for (int k = 0; k < nums.length; k++)
      scores[k] = nums[k];
  }

  /*** Part (a) ***/

  // returns the average (artithmetic mean) of the values in scores
  // whose subscripts are between first and last inclusive
  // precondition:  0 <= first <= last < scores.length
  private double average(int first, int last)
  {
    double sum = 0;
    for (int k = first; k <= last; k++)
      sum += scores[k];
    return sum / (last - first + 1);
  }

  /*** Part (b) ***/

  // returns true if each successive value in scores is greater
  // than or equal to the previous value;
  // otherwise, returns false
  private boolean hasImproved()
  {
    for (int k = 1; k < scores.length; k++)
      if (scores[k] < scores[k-1])
        return false;
    return true;
  }

  /*** Part (c) ***/

  // if the values in scores have improved, returns the average
  // of the elements in scores with indexes greater than or equal
  // to scores.length/2;
  // otherwise, returns the average of all of the values in scores
  public double finalAverage()
  {
    if (!hasImproved())
      return average(0, scores.length - 1);
    else
      return average(scores.length/2, scores.length - 1);
  }
}
