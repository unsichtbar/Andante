package sample;

/**
 * Created by Sly on 4/2/2016.
 */
public class Card {

    public Card(String content, int cardType) {
        this.content = content;
        this.cardType = cardType;
    }

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

    private int cardType;
    private String content;






}
