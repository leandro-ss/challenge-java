package com.others.design.pattern.state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StateTest  {
    private Player player;

    @Test
    public void testInit() {
        player = new Player();
        player.getState().onPlay();

        assertEquals(ReadyState.class, player.getState().getClass());
    }
}