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
import javafx.util.Duration;

import java.net.URL;


public class Main extends Application {

    public static int currentLevel;
    public Stage window;
    public Scene startScreen;
    public Scene playScreen;
    public MainMenuController maincontroller;
    public static QuestionDatabase db;
    public static Music musicPlayer;
   // public Main main;



    //bloop bop
    @Override
    public void start(Stage primaryStage) throws Exception{

        this.window = primaryStage;
        Main.db = new QuestionDatabase();

        currentLevel = 0;
        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        //main = this;
        this.window.setTitle("Andante");
        this.window.setResizable(false);

        musicPlayer = new Music();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
        Pane page = loader.load();
        maincontroller = loader.getController();
        maincontroller.setStage(window);
        primaryStage.setScene(new Scene(root, 1280, 800));
        this.startScreen = new Scene(page);
        this.window.setScene(this.startScreen);
        this.window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
