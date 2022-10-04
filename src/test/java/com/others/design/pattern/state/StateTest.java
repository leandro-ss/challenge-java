package com.others.design.pattern.state;




import org.junit.Test;

public class StateTest  {
    private Player player;

    @Test
    public void testInit() {
        player = new Player();
        player.getState().onPlay();
        player.getState().onLock();
        player.getState().onNext();
        player.getState().onPrevious();
    }
}