package com.pantherhackers.bootcamp.login;

public class LoginPresenter {

    LoginModel model;

    public LoginPresenter() {
        this.model = new LoginModel();
    }

    public boolean login(LoginCredentials credentials) {
        return model.verifyLogin(credentials);
    }
}
