package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage window;
    private Scene splash;
    private Scene playScreen;


    //bloop bop
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Media media = new Media(Main.class.getResource("CherryBlossoms.mp3").toString());
        MediaPlayer mp = new MediaPlayer(media);//creates a new thread that plays the mp3
        mp.setCycleCount(MediaPlayer.INDEFINITE);
        mp.play();*/
        Parent root = FXMLLoader.load(getClass().getResource("play.fxml"));
        primaryStage.setTitle("Level 1");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
