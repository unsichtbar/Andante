package sample;

import java.util.ArrayList;

/**
 * Created by Mikayla on 4/2/2016.
 */
public class Question {
    public Card quest;
    public ArrayList<Card> choices;

    public String questionForUser;
    public String questionFeedback;
    public String questionTopic;

    public int questionNumber;
    public int questionLevel;

    public Question(String questionForUser, int questionLevel, int questionNumber, String questionFeedback, String questionTopic) {

        this.questionForUser = questionForUser;
        this.questionLevel = questionLevel;
        this.questionNumber = questionNumber;
        this.questionFeedback = questionFeedback;
        this.questionTopic = questionTopic;

    }

    public String getQuestionForUser() {
        return questionForUser;
    }

    public void setQuestionForUser(String questionForUser) {
        this.questionForUser = questionForUser;
    }

    public int getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(int questionLevel) {
        this.questionLevel = questionLevel;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionTopic() {
        return questionTopic;
    }

    public void setQuestionTopic(String questionTopic) {
        this.questionTopic = questionTopic;
    }

    public String getQuestionFeedback() {
        return questionFeedback;
    }

    public void setQuestionFeedback(String questionFeedback) {
        this.questionFeedback = questionFeedback;
    }


}
