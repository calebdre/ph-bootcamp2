package com.pantherhackers.bootcamp.game;

import com.pantherhackers.bootcamp.InputListener;
import com.pantherhackers.bootcamp.Printer;

public class SettingsPrompter {

    InputListener listener;

    public SettingsPrompter(InputListener listener) {
        this.listener = listener;
    }

    public GameSettings prompt() {
        Printer.print("How long would you like the game to be?");
        Printer.print("(options: short, long, expansive");
        GameSettings.Builder settingsBuilder = new GameSettings.Builder();


        listener.addListener("short", () -> settingsBuilder.setSize(GameSettings.Size.SHORT));
        listener.addListener("long", () -> settingsBuilder.setSize(GameSettings.Size.LONG));
        listener.addListener("expansive", () -> settingsBuilder.setSize(GameSettings.Size.EXPANSIVE));

        return settingsBuilder.build();
    }
}
