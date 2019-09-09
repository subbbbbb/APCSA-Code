import java.util.ArrayList;

public class Digits
{
  /** The list of digits from the number used to construct this object.
   *  The digits appear in the list in the same order in which they appear in the original number.
   */
  private ArrayList<Integer> digitList;

  /**************** Part (a) ****************/

  /** Constructs a Digits object that represents num.
   *  Precondition: num >= 0
   */

  public Digits(int num)
  {
    digitList = new ArrayList<Integer>();
    while (num > 0)
    {
      digitList.add(0, num % 10);
      num /= 10;
    }
    if (digitList.size() == 0)
      digitList.add(0);
  }

  /* Or take care of num = 0 first:

  public Digits(int num)
  {
    digitList = new ArrayList<Integer>();

    if (num == 0)
    {
      digitList.add(0);
      return;
    }

    while (num > 0)
    {
      digitList.add(0, num % 10);
      num /= 10;
    }
  }

  Or use a do-while loop:

  public Digits(int num)
  {
    digitList = new ArrayList<Integer>();
    do
    {
      digitList.add(0, num % 10);
      num /= 10;
    } while (num > 0);
  }

  */

  public String toString()
  {
    return digitList.toString();
  }

  /**************** Part (b) ****************/

  /** Returns true if the digits in this Digits object are in strictly increasing order;
   *  false otherwise.
   */
  public boolean isStrictlyIncreasing()
  {
    for (int k = 1; k < digitList.size(); k++)
    {
      if (digitList.get(k).intValue() <= digitList.get(k-1).intValue())
      // Or simply:
      // if (digitList.get(k) <= digitList.get(k-1))
        return false;
    }
    return true;
  }

  public static void main(String[] args)
  {
    Digits d1 = new Digits(15704);
    System.out.println(d1);

    Digits d2 = new Digits(0);
    System.out.println(d2);

    System.out.println((new Digits(7)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1356)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1336)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(1536)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(65310)).isStrictlyIncreasing()); // false
  }
}