package com.observers;

import com.io.Writer;

public class Watcher extends Observer {
    private static int count = 1;
    private static final String DOWN = " is down!";
    private static final String UP = " is up!";
    private Writer writer;
    private Subject subject;

    public Watcher(Writer writer, Subject subject) {
        this.writer = writer;
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(boolean state) {
        if (state) {
            this.writer.write("Watcher" + " " + count + DOWN);
            count++;
            if (count > 2) {
                count = 1;
            }
            return;
        }
        this.writer.write("Watcher" + " " + count + UP);
        count++;
        if (count > 2) {
            count = 1;
        }
    }
}
