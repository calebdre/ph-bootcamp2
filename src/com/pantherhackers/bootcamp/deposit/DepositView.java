package com.pantherhackers.bootcamp.deposit;

import com.pantherhackers.bootcamp.navigation.Navigatable;
import com.pantherhackers.bootcamp.util.Printer;

public class DepositView implements Navigatable {

    @Override
    public void render() {
        Printer.println("Hello from deposit view");
    }
}
