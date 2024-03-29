package com.others.design.pattern.state;


public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public State onStop() {    
        return new StoppedState(player);
    }

    @Override
    public State onPlay() {
        return new PlayingState(player);
    }

    @Override
    public State onPause() {
        return new PausedState(player);
    }

    @Override
    public State onNext() {
        return player.getState();
    }

    @Override
    public State onPrevious() {
        return player.getState();
    }

    @Override
    public boolean isPlaying() {
        return false;
    }
}
