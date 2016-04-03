package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Michael on 4/2/2016.
 */
public class QuestionDatabase {

    private HashMap<Integer, ArrayList<Question>> levels;
    private LinkedList<Question> usedQuestions;
    public QuestionDatabase(){
        this.usedQuestions = new LinkedList<Question>();
        this.levels = new HashMap<Integer, ArrayList<Question>>();
        this.populateLevel1();
        this.populateLevel2();
        this.populateLevel3();
        this.populateLevel4();
        this.populateLevel5();
        this.populateLevel6();

    }

    public void populateLevel1(){

        ArrayList<Question> set1 = new ArrayList<Question>();
        set1.add(new Question("Which of these symbols represents a note?",  "note_quarter.png", "sharp.png", "rest_eighth.png", 0));
        set1.add(new Question("Which of these symbols represents a treble clef?",  "treble_clef.png", "bass_clef.png", "rest_eighth.png", 0));
        set1.add(new Question("Which of these symbols represents a flat?",  "flat.png", "rest_whole.png", "sharp.png", 0));
        set1.add(new Question("Which of these symbols represents a sharp?",  "sharp.png", "flat.png", "rest_eighth.png", 0));
        set1.add(new Question("Which of these symbols represents a bass clef?",  "bass_clef.png", "rest_half.png", "treble_clef.png", 0));
        set1.add(new Question("Which of these symbols represents a staff?",  "staff.png", "treble_clef.png", "note_quarter.png", 0));
        this.levels.put( (Integer)1 , set1);

    }
    public void populateLevel2(){
        ArrayList<Question> set2 = new ArrayList<Question>();
        set2.add(new Question("A",  "a_normal.png", "f_normal.png", "b_normal.png", 0));
        set2.add(new Question("Bb",  "b_flat.png", "e2_flat.png", "a_flat.png", 0));
        set2.add(new Question("C",  "c_normal.png", "e_normal.png", "a_normal.png", 0));
        set2.add(new Question("C#",  "c_sharp.png", "a_sharp.png", "f_sharp.png", 0));
        set2.add(new Question("D",  "d_normal.png", "g_normal.png", "b_normal.png", 0));
        this.levels.put( (Integer)2 , set2);
    }
    public void populateLevel3(){
        ArrayList<Question> set3 = new ArrayList<Question>();
        set3.add(new Question("Eighth note",  "note_eighth.png", "note_half.png", "note_quarter.png", 0));
        set3.add(new Question("Quarter note",  "note_quarter.png", "note_whole.png", "note_half.png", 0));
        set3.add(new Question("Half note",  "note_half.png", "note_quarter.png", "note_whole.png", 0));
        set3.add(new Question("Whole note",  "note_whole.png", "note_eighth.png", "note_half.png", 0));
        this.levels.put( (Integer)3 , set3);
    }
    public void populateLevel4(){
        ArrayList<Question> set4 = new ArrayList<Question>();
        set4.add(new Question("Whole rest",  "rest_whole.png", "rest_half.png", "rest_quarter.png", 0));
        set4.add(new Question("Eighth rest",  "rest_eighth.png", "rest_half.png", "rest_quarter.png", 0));
        set4.add(new Question("Quarter rest",  "rest_quarter.png", "rest_whole.png", "rest_eighth.png", 0));
        set4.add(new Question("Half rest",  "rest_half.png", "rest_quarter.png", "rest_whole.png", 0));
        this.levels.put( (Integer)4 , set4);
    }
    public void populateLevel5(){
        ArrayList<Question> set5 = new ArrayList<Question>();
        set5.add(new Question("G",  "key_g_major.png", "key_eflat_major.png", "key_c_major.png", 0));
        set5.add(new Question("F",  "key_f_major.png", "key_aflat_major.png", "key_dflat_major.png", 0));
        set5.add(new Question("A flat",  "key_aflat_major.png", "key_eflat_major.png", "key_g_major.png", 0));
        set5.add(new Question("C",  "key_c_major.png", "key_g_major.png", "key_f_major.png", 0));
        this.levels.put( (Integer)5 , set5);
    }
    public void populateLevel6(){
        ArrayList<Question> set6 = new ArrayList<Question>();
        set6.add(new Question("A",  "key_a_minor.png", "key_c_minor.png", "key_e_minor.png", 0));
        set6.add(new Question("C",  "key_c_minor.png", "key_f_minor.png", "key_g_minor.png", 0));
        set6.add(new Question("G",  "key_g_minor.png", "key_e_minor.png", "key_c_minor.png", 0));
        set6.add(new Question("D",  "key_d_minor.png", "key_f_minor.png", "key_c_minor.png", 0));
        this.levels.put( (Integer)6 , set6);
    }

    /*
    public Question getUnusedQuestion(int level){
        ArrayList<Question> currentQuestions = this.levels.get(level);

    }
*/
}
