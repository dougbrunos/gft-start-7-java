package com.douglas.interfaces;

public class Main {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        Smartphone videoPlayer = new Smartphone();
        runVideo(videoPlayer);
        runMusic(musicPlayer);
    }
    
    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

}
