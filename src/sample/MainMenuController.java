package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.io.IOException;

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
                ChangeLevel(level_1_note);
            }
        });

        level_2_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_2_note);
            }
        });

        level_3_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_3_note);
            }
        });

        level_4_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_4_note);
            }
        });

        level_5_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_5_note);
            }
        });

        level_6_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_6_note);
            }
        });

        level_7_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_7_note);
            }
        });

        level_8_note.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ChangeLevel(level_8_note);
            }
        });
    }

    private void ChangeLevel(Ellipse ellipse)
    {
        Stage stage;
        Parent root;

        stage=(Stage)ellipse.getScene().getWindow();
        try{
            root = FXMLLoader.load(getClass().getResource("play.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
