package javase03.task02;

import java.io.PrintStream;
import java.util.*;

/**
 * Created by Mao Shaco on 10/24/2015.
 */
public class IssueController {

    private List<Issue> issues;

    public IssueController(int amountIssues) {
        this.issues = new ArrayList<Issue>();
        this.setupIssues(3);
    }

    public String[] getQuestions(PrintStream outStream) {
        String[] questions = new String[issues.size()];
        for(int i = 0; i < issues.size(); i++){
            questions[i] = issues.get(i).question;
        }
        return questions;
    }

    public String showAnswer(int questionIndex) {
        return this.issues.get(questionIndex).answer;
    }

    private void setupIssues(int amountExistingIssues) {
        for (int i = 0; i < amountExistingIssues; i++) {
            this.issues.add(new Issue("Question" + i, "Answer" + i));
        }
    }

    private class Issue {
        private String question;
        private String answer;

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }

        private Issue(String question, String answer) {
            this.question = question;
            this.answer = answer;

        }
    }
}
