package com.pantherhackers.bootcamp.navigation;

import com.pantherhackers.bootcamp.util.InputListener;
import com.pantherhackers.bootcamp.util.Printer;
import com.pantherhackers.bootcamp.alerts.AlertsView;
import com.pantherhackers.bootcamp.deposit.DepositView;
import com.pantherhackers.bootcamp.withdraw.WithdrawView;

public class NavigationView {

    private InputListener listener;

    public NavigationView(InputListener listener) {
        this.listener = listener;
    }

    public void render(){
        Printer.println("What would you like to do?");

        NavigationBuilder builder = new NavigationBuilder(listener);
        builder.addOption("Withdraw", new WithdrawView());
        builder.addOption("Deposit", new DepositView());
        builder.addOption("View Alerts", new AlertsView());
        builder.build();
    }
}
