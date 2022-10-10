package com.others.design.pattern.state;

public abstract class State {
    final Player player;

    State(Player player) {
        this.player = player;
        player.changeState(this);
    }

    public abstract State onStop();
    public abstract State onPlay();
    public abstract State onNext();
    public abstract State onPause();
    public abstract State onPrevious();
    public abstract boolean isPlaying();

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
    
        return true;
    }

}
