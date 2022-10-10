package com.others.design.pattern.state;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<String> playlist = new ArrayList<>();

    private State state;

    private int currentTrack = 0;
    private int currentTimeTrack = 0;

    public Player() {
        this.state = new ReadyState(this);
        
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    void changeState(State state) {
        this.state = state;    
    }

    public State getState() {
        return state;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        state.onNext();
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        state.onPrevious();
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public boolean isPlaying() {
        return this.getState().isPlaying();
    }

    public void resetCurrentTimeTrack() {
        this.currentTimeTrack = 0;
    }
}
