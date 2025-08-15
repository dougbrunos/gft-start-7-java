package com.douglas.interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("Reproduzindo vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando vídeo");
    }

}
