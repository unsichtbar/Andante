package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Michael on 4/2/2016.
 */
public class QuestionDatabase {

    private HashMap<Integer, ArrayList<Question>> levels;

    public QuestionDatabase(){

        this.levels = new HashMap<Integer, ArrayList<Question>>();

    }

    public void populateLevel1(){

        ArrayList<Question> set1 = new ArrayList<Question>();
        set1.add(new Question("Which of these symbols represents a note",  "note_quarter.png", "sharp.png", "rest_eighth.png", 0));
        this.levels.put( (Integer)1 , set1);
    }
    public void populateLevel2(){

    }
    public void populateLevel3(){

    }
    public void populateLevel4(){

    }




}
