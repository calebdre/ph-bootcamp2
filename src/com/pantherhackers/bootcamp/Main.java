package com.pantherhackers.bootcamp;

import com.pantherhackers.bootcamp.login.LoginView;
import com.pantherhackers.bootcamp.util.InputListener;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
            banking application
            Banking application:
            user auth
            withdraw
            accounts support
            deposit
            text alerts
            save to a DB
         */

        new LoginView(new InputListener()).render();
    }
}
