package sample;

import org.bson.BSON;
import org.bson.BsonObjectId;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Mikayla on 4/2/2016.
 */
public class Question {

    public Card questionCard;
    public ArrayList<Card> choices; // there should be 3 cards in this. one True and two False


    public Question( String question, String answer1, String answer2, String answer3, int answerType  ) {
        this.questionCard = new Card(question, 0);
        this.choices = new ArrayList<Card>();
        this.choices.add(new Card(answer1, answerType));
        this.choices.get(0).setIsCorrect(true);
        this.choices.add(new Card(answer2, answerType));
        this.choices.add(new Card(answer3, answerType));
    }

    /**
     *
     * @return
     */
    public ArrayList<Card> getAnswers(){
       return this.choices;
    }

    public Card getCorrectAnswer(){

        return this.choices.get(0);
    }


}// end of Question class
