package com.commands;

import com.trainers.Coaching;

public class GetUp implements Executable {
    private Coaching coaching;

    public GetUp(Coaching coaching) {
        this.coaching = coaching;
    }

    @Override
    public void execute() {
        this.coaching.moveUp();
    }
}
