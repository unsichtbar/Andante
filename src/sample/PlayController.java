package sample;

/**
 * Created by Sly on 4/2/2016.
 */

import javafx.application.Platform; //alternative threading

import javafx.event.EventHandler;
import javafx.scene.Scene; //listeners and drawing
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXML;

public class PlayController {
    private int width;
    private int height;
    private boolean paused;
    private boolean levelComplete;
    public Question currentQuestion;

    @FXML
    private Button questionButton;
    @FXML
    private Button choice1Button;
    @FXML
    private Button choice2Button;
    @FXML
    private Button choice3Button;



    @FXML
    public void initialize(){
        this.width = 1280;
        this.height = 800;
        this.paused = false;
        this.levelComplete = false;
        this.choice1Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                questionButton.setText("you clicked choice 1.");
            }
        });
        this.choice2Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                questionButton.setText("you clicked choice 2.");
            }
        });
        this.choice3Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                questionButton.setText("you clicked choice 3.");
            }
        });
    }


    public void setCurrentQuestion(Question question)
    {
        this.currentQuestion = question;
    }
    public void setQuestionImages()
    {
       Question q =  question;
        String questionText = q.questionCard.getContent();
        String answer1 = q.getAnswers().get(0).getContent();
        BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer1).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        this.choice1Button.setBackground(background);
        String answer2 = q.getAnswers().get(1).getContent();
        String answer3 = q.getAnswers().get(2).getContent();
    }
}
