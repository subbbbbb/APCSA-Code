import java.util.*;

public class WordList
{
  private ArrayList<String> myList = new ArrayList<String>();

  public WordList() { myList = new ArrayList(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  // A-1, (a)

  public int numWordsOfLength(int len)
  {
    int count = 0;

    for (int i = 0; i < myList.size(); i++)
      if (myList.get(i).length() == len)
        count++;

    return count;
  }

  // A-1, (b)

  public void removeWordsOfLength(int len)
  {
    int i = 0;

    while (i < myList.size())
    {
      if (myList.get(i).length() == len)
        myList.remove(i);
      else
        i++;
    }
  }

/* Or:
  public void removeWordsOfLength(int len)
  {
    Iterator iter = myList.iterator();

    while (iter.hasNext())
    {
      if (((String)iter.next()).length() == len)
        iter.remove();
    }
  }
*/

  public static void main(String[] args)
  {
    System.out.println("******* A-1 *******");
    WordList w = new WordList();
    w.add("cat");
    w.add("mouse");
    w.add("frog");
    w.add("dog");
    w.add("dog");
    System.out.println(w + " " +
           w.numWordsOfLength(4) + " " +
           w.numWordsOfLength(3) + " " +
           w.numWordsOfLength(2));
    w.removeWordsOfLength(4);
    System.out.println(w);
    w.removeWordsOfLength(3);
    System.out.println(w);
    w.removeWordsOfLength(2);
    System.out.println(w);
  }
}
