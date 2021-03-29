package com.trainers;

import com.io.Writer;
import com.observers.Subject;

public class CoachingImpl implements Coaching {
    private static final String DOWN ="Coaching is down!";
    private static final String UP ="Coaching is up!";
    private Subject subject;
    private Writer writer;

    public CoachingImpl(Subject subject, Writer writer) {
        this.subject = subject;
        this.writer = writer;
    }

    @Override
    public void moveDown() {
        this.writer.write(DOWN);
        this.subject.setState(true);
    }

    @Override
    public void moveUp() {
        this.writer.write(UP);
        this.subject.setState(false);
    }
}
