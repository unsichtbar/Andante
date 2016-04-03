package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

    public static int currentLevel;
    private Stage window;
    private Scene startScreen;
    private Scene playScreen;
    private MainMenuController maincontroller;
    public static QuestionDatabase db;
   // public Main main;



    //bloop bop
    @Override
    public void start(Stage primaryStage) throws Exception{

        this.window = primaryStage;
        Main.db = new QuestionDatabase();
        /*Media media = new Media(Main.class.getResource("CherryBlossoms.mp3").toString());
        MediaPlayer mp = new MediaPlayer(media);//creates a new thread that plays the mp3
        mp.setCycleCount(MediaPlayer.INDEFINITE);
        mp.play();*/
        //primaryStage.setResizable(false);
        currentLevel = 0;
        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        //main = this;
        this.window.setTitle("Andante");


        FXMLLoader loader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
        maincontroller = loader.getController();
        //primaryStage.setScene(new Scene(root, 1280, 800));
        Pane page = (FXMLLoader.load(Main.class.getResource("main_menu.fxml")));
        this.playScreen = new Scene(page);
        this.window.setScene(this.playScreen);
        this.window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
