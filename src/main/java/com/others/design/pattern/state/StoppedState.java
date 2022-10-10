package com.others.design.pattern.state;



public class StoppedState extends State {

    StoppedState(Player player) {
        super(player);
        player.resetCurrentTimeTrack();
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

    @Override
    public State onPause() {
        // TODO Auto-generated method stub
        return null;
    }
}
