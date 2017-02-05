package com.pantherhackers.bootcamp.alerts;

import com.pantherhackers.bootcamp.navigation.Navigatable;
import com.pantherhackers.bootcamp.util.Printer;

public class AlertsView implements Navigatable {

    @Override
    public void render() {
        Printer.println("Hello from alerts view");
    }
}
