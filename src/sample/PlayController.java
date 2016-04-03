package sample;

/**
 * Created by Sly on 4/2/2016.
 */

import javafx.application.Platform; //alternative threading

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene; //listeners and drawing
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Random;

public class PlayController {
    private int width;
    private int height;
    private boolean paused;
    private boolean levelComplete;

    Stage stage;

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
               // questionButton.setText("you clicked choice 1.");
                if(currentQuestion.getAnswers().get(0).getIsCorrect()){
                    //load next question into controller
                    //if DB Level == null, there aren't any questions left,
                    //take them back to main menu
                    handleQuestions();
                    return;
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Incorrect!");
                    alert.setTitle("Incorrect!");
                    alert.setContentText("Sorry, try again!");
                    alert.showAndWait();
                }
            }
        });
        this.choice2Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //questionButton.setText("you clicked choice 2.");
                if(currentQuestion.getAnswers().get(1).getIsCorrect()){
                    //load next question into this controller
                    //if DB Level == null, there aren't any questions left
                    // take them back to main menu
                    handleQuestions();
                    return;
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Incorrect!");
                    alert.setTitle("Incorrect!");
                    alert.setContentText("Sorry, try again!");
                    alert.showAndWait();
                }
            }
        });
        this.choice3Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               // questionButton.setText("you clicked choice 3.");
                if(currentQuestion.getAnswers().get(2).getIsCorrect()){
                    //load next question into this controller;
                    //if DB Level == null, there aren't any questions left,
                    //take them back to main menu
                    handleQuestions();
                    return;
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Incorrect!");
                    alert.setTitle("Incorrect!");
                    alert.setContentText("Sorry, try again!");
                    alert.showAndWait();
                }
            }
        });

    }

    private void handleQuestions() {
        currentQuestion = (Main.db.getUnusedQuestion(Main.currentLevel));
        setCurrentQuestion(currentQuestion);

        if(currentQuestion != null)
        {
            setQuestionImages();
        }
        else{
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
                Parent root = loader.load();
                MainMenuController gameController =  loader.getController();
                gameController.setStage(this.stage);
                Scene scene = new Scene(root);
                Main.db.usedQuestions.clear();

                URL resource = getClass().getResource("/sounds/harp.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();

                this.stage.setScene(scene);
                this.stage.show();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
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

        long seed = System.nanoTime();
        Collections.shuffle(q.getAnswers(), new Random(seed));
        // question  field
        String questionText = q.questionCard.getContent();
        this.questionButton.setText(questionText);
        // option 1
        String answer1 = q.getAnswers().get(0).getContent();
        backgroundImage1 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer1).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background1 = new Background(backgroundImage1);
        this.choice1Button.setBackground(background1);
        // option 2
        String answer2 = q.getAnswers().get(1).getContent();
        backgroundImage2 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer2).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background2 = new Background(backgroundImage2);
        this.choice2Button.setBackground(background2);
        //option 3
        String answer3 = q.getAnswers().get(2).getContent();
        backgroundImage3 = new BackgroundImage( new Image( getClass().getResource("/pictures/"+answer3).toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background background3 = new Background(backgroundImage3);
        this.choice3Button.setBackground(background3);
    }
}
