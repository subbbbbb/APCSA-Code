package x2015all;// Part (b)

public class Range implements NumberGroup
{
  private int minValue, maxValue;

  public Range(int min, int max)
  {
    minValue = min;
    maxValue = max;
  }
  
  public boolean contains (int num)
  {
    return num >= minValue && num <= maxValue;
  }
}
