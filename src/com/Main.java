package com;

import com.engines.Engine;
import com.interpreters.CommandInterpreter;
import com.interpreters.Interpreter;
import com.io.ConsoleReader;
import com.io.ConsoleWriter;
import com.io.Reader;
import com.io.Writer;
import com.observers.Observer;
import com.observers.Subject;
import com.observers.Watcher;
import com.trainers.Coaching;
import com.trainers.CoachingImpl;

public class Main {

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        Reader reader = new ConsoleReader();
        Subject subject = new Subject();
        Interpreter interpreter = new CommandInterpreter(writer);
        Observer watcherFirst = new Watcher(writer,subject);
        Observer watcherSecond = new Watcher(writer,subject);
        Coaching coaching = new CoachingImpl(subject,writer);
        Runnable engine = new Engine(reader,writer,interpreter,coaching);
        engine.run();
    }
}
