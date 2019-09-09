package x2015all;

public class HiddenWord
{
  private String word;
  
  public HiddenWord(String w)
  {
    word = w;
  }  

  public String getHint(String s)
  {
    String hint = "";
    
    for (int i = 0; i < s.length(); i++)
    {
      String letter = s.substring(i, i+1);
      
      if (letter.equals(word.substring(i, i+1)))
        hint += letter;
      else if (word.indexOf(letter) >= 0)
        hint += "+";
      else
        hint += "*";
    }
    
    return hint;
  }
  
  /******************************************************************************/
  
  public static void main(String[] args)
  {
    HiddenWord puzzle = new HiddenWord("HARPS");
    System.out.println(puzzle.getHint("AAAAA"));
    System.out.println(puzzle.getHint("HELLO"));
    System.out.println(puzzle.getHint("HEART"));
    System.out.println(puzzle.getHint("HARMS"));
    System.out.println(puzzle.getHint("HARPS"));
  }
}
