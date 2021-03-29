package com.interpreters;
import com.commands.Executable;
import com.trainers.Coaching;

import java.lang.reflect.InvocationTargetException;

public interface Interpreter {

    Executable interpretCommand(String line, Coaching coaching);
}
