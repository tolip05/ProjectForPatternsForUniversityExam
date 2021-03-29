package com.engines;

import com.commands.Executable;
import com.interpreters.Interpreter;
import com.io.Reader;
import com.io.Writer;
import com.trainers.Coaching;

import java.io.IOException;

public class Engine implements Runnable {
    private static final String TRAINER_GIVE_COMMAND ="Trainer give the command!";
    private static final String STOP_TRAINING = "Stop training!";
    private Reader reader;
    private Writer writer;
    private Interpreter commandInterpreter;
    private Coaching coaching;

    public Engine(Reader reader, Writer writer,
                  Interpreter commandInterpreter,
                  Coaching coaching) {
        this.reader = reader;
        this.writer = writer;
        this.commandInterpreter = commandInterpreter;
        this.coaching = coaching;
    }

    @Override
    public void run() {
        this.writer.write(TRAINER_GIVE_COMMAND);
        try {
            String line = this.reader.read();
            while (!line.equals(STOP_TRAINING)) {
                Executable command = this.commandInterpreter
                        .interpretCommand(line,this.coaching);
                if (command != null)
                command.execute();
                this.writer.write(TRAINER_GIVE_COMMAND);
                line = this.reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
