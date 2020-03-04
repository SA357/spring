package spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<MusicI> music = new ArrayList<>();

    @Value("${musicPlayer.volume}")
    double volume;

    public MusicPlayer(List<MusicI> music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println(
                music.get(new Random().nextInt(music.size()))   //get random music
                .getSong()
        );
    }

    public double getVolume() {
        return volume;
    }
}
