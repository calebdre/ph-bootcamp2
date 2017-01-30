package com.pantherhackers.bootcamp;

import com.pantherhackers.bootcamp.startmenu.StartMenu;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final InputListener listener = new InputListener();
        listener.addListener("exit", () -> System.exit(0));

        StartMenu sm = new StartMenu();
        sm.render(listener, option -> System.out.print("Selected" + option.getText()));

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String nextLine = scanner.nextLine();
            listener.executeEvent(nextLine);
        }
    }
}
