package sample;

import com.sun.jndi.toolkit.url.Uri;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by corey on 4/2/16.
 */
public class MainMenuController {

    @FXML
    Ellipse level_1_note;
    @FXML
    Ellipse level_2_note;
    @FXML
    Ellipse level_3_note;
    @FXML
    Ellipse level_4_note;
    @FXML
    Ellipse level_5_note;
    @FXML
    Ellipse level_6_note;
    @FXML
    Ellipse level_7_note;
    @FXML
    Ellipse level_8_note;



    @FXML
    public void initialize(){

        level_1_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_1_note, 1);
            }
        });

        level_2_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_2_note, 2);
            }
        });

        level_3_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_3_note, 3);
            }
        });

        level_4_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_4_note, 4);
            }
        });

        level_5_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_5_note, 5);
            }
        });

        level_6_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_6_note, 6);
            }
        });

        level_7_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_7_note, 7);
            }
        });

        level_8_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_8_note, 8);
            }
        });

        level_1_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/e.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
        level_2_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/f.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
        level_3_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/g.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
        level_4_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/a.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
        level_5_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/b.mp3");
                Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
        level_6_note.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                URL resource = getClass().getResource("/sounds/c.mp3");
                Media media = new Media(resource.toString());

                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        });
    }

    private void ChangeLevel(Ellipse ellipse, int level)
    {
        Stage stage;
        Parent root;
        PlayController gameController;
        Main.currentLevel = level;

        stage=(Stage)ellipse.getScene().getWindow();
        try{


            //Question question =
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
            //maincontroller = loader.getController();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("play.fxml"));
            root = loader.load();
            gameController =  loader.getController();
            gameController.setCurrentQuestion(new Question("A",  "key_a_minor.png", "key_c_minor.png", "key_e_minor.png", 0));
            gameController.setQuestionImages();
            //root = FXMLLoader.load(getClass().getResource("play.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
