package sample;

/**
 * Created by Mikayla on 4/2/2016.
 */
public class QAType {

    String questionForUser;
    String questionFeedback;
    String questionTopic;

    int questionNumber;
    int questionLevel;

    public QAType WordAndPicture(String questionForUser, int questionLevel, int questionNumber, String questionFeedback, String questionTopic) {

        this.questionForUser = questionForUser;
        this.questionLevel = questionLevel;
        this.questionNumber = questionNumber;
        this.questionFeedback = questionFeedback;
        this.questionTopic = questionTopic;

        //Not sure what to return?
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
