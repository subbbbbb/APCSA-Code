import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers;  // the list of the student's answers
    private String name;

    public StudentAnswerSheet(String nm, ArrayList<String> ans) {
        name = nm;
        answers = new ArrayList<String>();
        for (String a : ans)
            answers.add(a);
    }

    /*** Part (a) ***/

    /**
     * @param key the list of correct answers, represented as strings of length one
     *            Precondition: key.size() is equal to the number of answers in this answer sheet
     * @return this student's test score
     */
    public double getScore(ArrayList<String> key) {
        double score = 0.0;

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(key.get(i)))
                score += 1.00;
            else if (!answers.get(i).equals("?"))
                score -= 0.25;
        }

        return score;
    }

    /****************/

    /**
     * @return the name of the student
     */
    public String getName() {
        return name;
    }
}
