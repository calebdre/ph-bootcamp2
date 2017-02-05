package com.pantherhackers.bootcamp.withdraw;

import com.pantherhackers.bootcamp.navigation.Navigatable;
import com.pantherhackers.bootcamp.util.Printer;

public class WithdrawView implements Navigatable {

    @Override
    public void render() {
        Printer.println("Hello from withdraw view");
    }
}
