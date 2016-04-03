package sample;

/**
 * Created by Sly on 4/2/2016.
 */
public class Card {

    private int cardType; // 0 is image, 1 is answer text
    private String content;
    private boolean isCorrect;
    public Card(String content, int cardType) {
        this.content = content;
        this.cardType = cardType;
        this.isCorrect = false;
    }


    /**
     *
     * @return ZERO for image or ONE for answer text
     */
    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getIsCorrect(){
        return this.isCorrect;
    }

    /**
     * used to set the first card in the arraylist to true
     * @param tf
     */
    public void setIsCorrect(boolean tf){
        this.isCorrect = tf;
    }







}
