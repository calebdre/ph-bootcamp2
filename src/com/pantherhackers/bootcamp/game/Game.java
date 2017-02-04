package com.pantherhackers.bootcamp.game;

import com.pantherhackers.bootcamp.InputListener;

public class Game {
    private InputListener inputListener;

    public Game(InputListener inputListener) {
        this.inputListener = inputListener;
    }

    public void start() {
        SettingsPrompter settingsPrompterPrompt = new SettingsPrompter(inputListener);
        GameSettings settings = settingsPrompterPrompt.prompt();

        Board board = new Board(settings);

        
    }
}
