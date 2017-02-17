package com.pantherhackers.bootcamp.persistence;

import com.pantherhackers.bootcamp.persistence.entities.Account;
import com.pantherhackers.bootcamp.persistence.entities.User;

public interface DataStore {

    void storeAccount(Account account);

    void updateAccount(Account account);

    void storeUser(User account);

    User getUser();
}
