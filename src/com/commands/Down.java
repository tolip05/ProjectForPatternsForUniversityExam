package com.commands;

import com.trainers.Coaching;

public class Down implements Executable {
    private Coaching coaching;

    public Down(Coaching coaching) {
        this.coaching = coaching;
    }

    @Override
    public void execute() {
        this.coaching.moveDown();
    }
}
