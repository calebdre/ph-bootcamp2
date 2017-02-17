package com.pantherhackers.bootcamp.util;

import java.util.ArrayList;
import java.util.List;

public class OptionsBuilder<T> {

    private List<String> titles = new ArrayList<>();
    private List<T> options = new ArrayList<>();
    private InputListener listener;

    public OptionsBuilder(InputListener listener) {
        this.listener = listener;
    }

    public void addOption(String title, T option) {
        titles.add(title);
        options.add(option);
    }

    public void build(Action<T> action) {
        for(int i = 0; i < titles.size(); i++) {
            int printerIndex = i + 1;
            Printer.println("[" + printerIndex + "] " + titles.get(i));
        }

        listener.prompt("", (input) -> {
            // dufdf
            action.execute(options.get(Integer.parseInt(input) - 1));
        });
    }
}
