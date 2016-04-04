package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.net.URL;

/**
 * Created by Sly on 4/3/2016.
 */
public class Music {
    private MediaPlayer mediaPlayer;
    public Music(){
        URL resource = getClass().getResource("/res/sounds/Nocturne.mp3");
        Media media = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setStartTime(Duration.seconds(2.12d));
        mediaPlayer.setVolume(2d);
        mediaPlayer.play();
    }

    public void playNocturne(){
        mediaPlayer.stop();
        URL resource = getClass().getResource("/res/sounds/Nocturne.mp3");
        Media media = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setStartTime(Duration.seconds(2.12d));
        mediaPlayer.setVolume(2d);
        mediaPlayer.play();
    }

    public void playKissTheRain(){
        mediaPlayer.stop();
        URL resource = getClass().getResource("/res/sounds/KissTheRain.mp3");
        Media media = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(1d);
        mediaPlayer.play();
    }

    public void playFurElise(){
        mediaPlayer.stop();
        URL resource = getClass().getResource("/res/sounds/FurEliese.mp3");
        Media media = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(5d);
        mediaPlayer.play();
    }
}
