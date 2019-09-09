package x2018all;

public class CodeWordChecker implements StringChecker
{
  private int minLength, maxLength;
  private String excluded;

  public CodeWordChecker(int min, int max, String str)
  {
    minLength = min;
    maxLength = max;
    excluded = str;
  }

  public CodeWordChecker(String str)
  {

    minLength = 6;
    maxLength = 20;
    excluded = str;

    // Or (will get full credit even though not in the AP CS subset):
    // this(6, 20, s);
  }

  public boolean isValid(String str)
  {
    return str.length() >= minLength && str.length() <= maxLength && str.indexOf(excluded) == -1;
  }

  public static void main(String[] args)
  {
    StringChecker sc1 = new CodeWordChecker(5, 8, "$");
    String[] sc1Strings = {"happy", "happy$", "Code", "happyCode"};
    for (String str : sc1Strings)
      System.out.println(str + " " + sc1.isValid(str));

    StringChecker sc2 = new CodeWordChecker("pass");
    String[] sc2Strings = {"MyPass", "Mypassport", "happy", "1,000,000,000,000,000"};
    for (String str : sc2Strings)
      System.out.println(str + " " + sc2.isValid(str));
  }
}
