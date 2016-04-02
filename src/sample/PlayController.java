package sample;

/**
 * Created by Sly on 4/2/2016.
 */

import javafx.application.Platform; //alternative threading

import javafx.scene.Scene; //listeners and drawing
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXML;

public class PlayController {
    private int width;
    private int height;
    private boolean paused;
    private boolean levelComplete;

    @FXML
    private Pane PreviewPane;
    @FXML
    private Label scoreLabel;

    public PlayController(){

    }

    @FXML
    public void initialize(){
        this.width = 1280;
        this.height = 800;
        this.paused = false;
        this.levelComplete = false;
    }

}
