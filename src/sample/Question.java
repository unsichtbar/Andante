package sample;

import java.util.ArrayList;

/**
 * Created by Mikayla on 4/2/2016.
 */
public class Question {
    public int id;
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
}


