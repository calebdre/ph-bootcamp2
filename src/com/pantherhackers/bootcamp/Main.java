package com.pantherhackers.bootcamp;

import com.pantherhackers.bootcamp.game.Game;
import com.pantherhackers.bootcamp.startmenu.StartMenu;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final InputListener listener = new InputListener();
        listener.addListener("exit", () -> System.exit(0));

        StartMenu sm = new StartMenu();
        sm.render(listener, new StartMenu.OnOptionChosenListener() {
            @Override
            public void onChooseOption(StartMenu.MENU_OPTION option) {
                switch (option) {
                    case CREDITS:
                        Printer.print("Credits go to the awesome PantherHackers bootcamp! w00t");
                        sm.render(listener, this);
                        break;
                    case PLAY:
                        new Game(listener).start();
                        break;
                    default:
                        throw new IllegalArgumentException("Could not identify ");
                }
                System.out.print("Selected" + option.getText());
            }
        });

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // TODO: what if a user types in something that's not expected?
            // we need a way to validate input
            String nextLine = scanner.nextLine();
            listener.executeEvent(nextLine);
        }
    }
}
