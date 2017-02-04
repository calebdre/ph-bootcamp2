package com.pantherhackers.bootcamp.game;

public class GameSettings {

    public enum Size {
        SHORT,
        LONG,
        EXPANSIVE
    }

    private Size size;

    private GameSettings(Size size) {
        this.size = size;
    }

    public static class Builder {
        private Size size;

        public void setSize(Size size) {
            this.size = size;
        }

        public GameSettings build(){
            return new GameSettings(size);
        }
    }
}
