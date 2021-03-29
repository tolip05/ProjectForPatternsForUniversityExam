package com.interpreters;

import com.commands.Down;
import com.commands.Executable;
import com.commands.GetUp;
import com.io.Writer;
import com.trainers.Coaching;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreter implements Interpreter {
    private static final String MOVE_UP ="Move up!";
    private static final String DOWN ="Down!";
    private static final String WRONG_COMMAND ="Wrong command!";
    private Writer writer;

    public CommandInterpreter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public Executable interpretCommand(String line, Coaching coaching) {
        try {
            if (line.equals(MOVE_UP)) {
                return new GetUp(coaching);
            }
            if(line.equals(DOWN)){
                return new Down(coaching);
            }
            this.writer.write(WRONG_COMMAND);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
