package com.pantherhackers.bootcamp.startmenu;

import com.pantherhackers.bootcamp.InputListener;

public class StartMenu {

    public enum MENU_OPTION {
        PLAY("Play"),
        CREDITS("Credits");

        private String text;

        MENU_OPTION(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public void render(final InputListener inputListener, final OnOptionChosenListener optionChosenListener) {
        final MENU_OPTION[] menuOptions = MENU_OPTION.values();

        System.out.println("Welcome! Please choose an option.");
        System.out.println();
        for (int i = 0; i < menuOptions.length; i++) {
            String optionText = menuOptions[i].getText();
            System.out.println("(" + Integer.toString(i + 1) + ") " + optionText);
        }

        inputListener.addListener("1", () -> optionChosenListener.onChooseOption(menuOptions[0]));

        inputListener.addListener("2", () -> optionChosenListener.onChooseOption(menuOptions[1]));
    }

    public interface OnOptionChosenListener {
        void onChooseOption(MENU_OPTION option);
    }
}
