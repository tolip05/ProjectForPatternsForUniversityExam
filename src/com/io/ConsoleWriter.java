package com.io;

public class ConsoleWriter implements Writer {

    @Override
    public void write(String text) {
        System.out.println(text);
    }

    @Override
    public void write(String down, String simpleName) {
        System.out.println(down + simpleName);
    }
}
