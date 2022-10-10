package com.others.design.pattern.state;



public class PlayingState extends State {

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public State onStop() {
        return new StoppedState(player);
    }

    @Override
    public State onPlay() {
        return new ReadyState(player);
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
        return true;
    }
}
