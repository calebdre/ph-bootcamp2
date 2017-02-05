package com.pantherhackers.bootcamp.login;

import com.pantherhackers.bootcamp.util.InputListener;
import com.pantherhackers.bootcamp.util.Printer;

public class LoginView {

    InputListener listener;
    LoginPresenter presenter;

    public LoginView(InputListener listener) {
        this.listener = listener;
    }

    public void render() {
        Printer.print("Welcome! You'll first need to login to view your information.");
        Printer.print("If you don't have an account, just enter the card number and pin you want and we'll create one for you.");
        LoginCredentials.Builder credentialsBuilder = new LoginCredentials.Builder();

        listener.prompt("Please enter your card number", credentialsBuilder::setCardNumber);
        listener.prompt("Please enter your pin", credentialsBuilder::setPin);

        LoginCredentials credentials = credentialsBuilder.build();
        presenter.login(credentials);
    }
}
