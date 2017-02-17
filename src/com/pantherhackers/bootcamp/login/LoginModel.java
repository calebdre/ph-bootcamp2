package com.pantherhackers.bootcamp.login;

import com.pantherhackers.bootcamp.persistence.DataStore;
import com.pantherhackers.bootcamp.persistence.DatastoreInstance;

public class LoginModel {

    private DataStore dataStore = DatastoreInstance.getInstance();

    public boolean verifyLogin(LoginCredentials credentials) {
        return true;
    }
}
