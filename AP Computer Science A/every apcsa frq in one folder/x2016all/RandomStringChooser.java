package x2016all;

import java.util.ArrayList;

/* Part (a) */

public class RandomStringChooser
{
  private ArrayList<String> words;

  public RandomStringChooser(String[] wordArray)
  {
    words = new ArrayList<String>();
    for (String w : wordArray)
      words.add(w);
  }

  public String getNext()
  {
    if (words.size() == 0)
      return "NONE";
    int i = (int)(Math.random() * words.size());
    return words.remove(i);
  }
}

/*  Alternative Solution:

public class RandomStringChooser extends ArrayList<String>
{
  public RandomStringChooser(String[] wordArray)
  {
    for (String w : wordArray)
      add(w);
  }

  public String getNext()
  {
    if (size() == 0)
      return "NONE";
    int i = (int)(Math.random() * size());
    return remove(i);
  }
}

*/

