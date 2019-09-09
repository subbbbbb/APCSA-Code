import java.util.List;
import java.util.ArrayList;

public class StringFormatter
{
  /* Part (a) */

  public static int totalLetters(List<String> wordList)
  {
    int count = 0;

    for (String word : wordList)
      count += word.length();

    return count;
  }

  /* Part (b) */

  public static int basicGapWidth(List<String> wordList,
                                  int formattedLen)
  {
    return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
  }
  /***********/

  public static int leftoverSpaces(List<String> wordList,
                                                int formattedLen)
  {
    return formattedLen - totalLetters(wordList) -
                 basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
  }

  /* Part (c) */

  public static String format(List<String> wordList, int formattedLen)
  {
    int gapWidth = basicGapWidth(wordList, formattedLen);
    String gap = "";
    for (int count = 0; count < gapWidth; count++)
      gap += " ";

    int extraSpaces = leftoverSpaces(wordList, formattedLen);

    String formattedStr = "";

    for (int i = 0; i < wordList.size() - 1; i++)
    {
      formattedStr += wordList.get(i) + gap;
      if (extraSpaces > 0)
      {
        formattedStr += " ";
        extraSpaces--;
      }
    }
    formattedStr += wordList.get(wordList.size() - 1);

    return formattedStr;
  }
}
