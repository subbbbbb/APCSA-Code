import java.util.ArrayList;

public class TestResults
{
  private ArrayList<StudentAnswerSheet> sheets;

  public TestResults(ArrayList<StudentAnswerSheet> shs)
  {
    sheets = new ArrayList<StudentAnswerSheet>();
    for (StudentAnswerSheet s : shs)
      sheets.add(s);
  }

  /*** Part (b) ***/

  /** Precondition: sheets.size() > 0;
   *                all answer sheets in sheets have the same number of answers
   * @param key the list of correct answers represented as strings of length one
   *        Precondition: key.size() is equal to the number of answers
   *                      in each of the answer sheets in sheets
   * @return the name of the student with the highest score
   */
  public String highestScoringStudent(ArrayList<String> key)
  {
    StudentAnswerSheet best = sheets.get(0);
    for (StudentAnswerSheet s : sheets)
      if (s.getScore(key) > best.getScore(key))
        best = s;
    return best.getName();
  }

/*
  public String highestScoringStudent(ArrayList<String> key)
  {
    StudentAnswerSheet best = null;
    for (StudentAnswerSheet s : sheets)
      if (best == null || s.getScore(key) > best.getScore(key))
        best = s;
    return best.getName();
  }
*/
}
