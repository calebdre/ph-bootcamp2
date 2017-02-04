package com.pantherhackers.bootcamp.game;

import com.pantherhackers.bootcamp.InputListener;
import com.pantherhackers.bootcamp.InputListener.EventAction;

import java.util.HashMap;
import java.util.Map;

public class ListenerOptionsBuilder {
    private HashMap<String, EventAction> options = new HashMap<>();
    private InputListener listener;

    public ListenerOptionsBuilder(InputListener listener) {
        this.listener = listener;
    }

    public void add(String string, EventAction listener) {
        options.put(string, listener);
    }

    public void build() {
        for (Map.Entry<String, EventAction> entry: options.entrySet()) {
            listener.addListener(entry.getKey(), entry.getValue());
        }
    }
}
