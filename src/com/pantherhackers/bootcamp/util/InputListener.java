package com.pantherhackers.bootcamp.util;

import java.util.Scanner;

public class InputListener {

    private Scanner scanner = new Scanner(System.in);

    public void prompt(String prompt, Action<String> action) {
        Printer.print(prompt + ": ");
        String input = scanner.nextLine();
        action.execute(input);
        Printer.println("");
    }
}
