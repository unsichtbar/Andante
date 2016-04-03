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
        //this.setQuestionImages();
        this.choice1Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               // questionButton.setText("you clicked choice 1.");
            }
        });
        this.choice2Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //questionButton.setText("you clicked choice 2.");
            }
        });
        this.choice3Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               // questionButton.setText("you clicked choice 3.");
            }
        });
    }


    public void setCurrentQuestion(Question question)
    {
        this.currentQuestion = question;
    }
    public void setQuestionImages()
    {
        BackgroundImage backgroundImage1;
        BackgroundImage backgroundImage2;
        BackgroundImage backgroundImage3;
        Question q =  this.currentQuestion;

        // question  field
        String questionText = q.questionCard.getContent();
        this.questionButton.setText(questionText);
        // option 1
        String answer1 = q.getAnswers().get(0).getContent();
        backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer1).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background1 = new Background(backgroundImage1);
        this.choice1Button.setBackground(background1);
        // option 2
        String answer2 = q.getAnswers().get(1).getContent();
        backgroundImage2 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer2).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage2);
        this.choice2Button.setBackground(background2);
        //option 3
        String answer3 = q.getAnswers().get(2).getContent();
        backgroundImage3 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer3).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background3 = new Background(backgroundImage3);
        this.choice3Button.setBackground(background3);
    }
}
