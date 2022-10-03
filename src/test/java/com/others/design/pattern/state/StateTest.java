package com.others.design.pattern.state;


import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class StateTest  {
    private Player player;

    @Test
    public void init() {
        player = new Player();
        player.getState().onPlay();
        player.getState().onLock();
        player.getState().onNext();
        player.getState().onPrevious();
    }
}