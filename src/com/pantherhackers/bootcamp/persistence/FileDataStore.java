package com.pantherhackers.bootcamp.persistence;

import com.google.gson.Gson;
import com.pantherhackers.bootcamp.persistence.entities.Account;
import com.pantherhackers.bootcamp.persistence.entities.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileDataStore implements DataStore {

    private File file;
    private Gson gson;

    public FileDataStore() {
        try {
            initFile();
            gson = new Gson();
        } catch (IOException e) {
            throw new IllegalStateException("Can't init file store: " + e.getMessage());
        }
    }

    private void initFile() throws IOException {
        file = new File(getFilePath());
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void storeAccount(Account accountToStore) {
        try {
            String current = get();
            User user = gson.fromJson(current, User.class);
            List<Account> accounts = user.getAccounts();

            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                if (account.getId() == accountToStore.getId()) {
                    accounts.set(i, accountToStore);
                    user.setAccounts(accounts);

                    store(gson.toJson(user));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAccount(Account account) {
    }

    @Override
    public void storeUser(User user) {
        try {
            store(gson.toJson(user, User.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser() {
        return null;
    }

    private String getFilePath() {
        return FileDataStore.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../src/userdata";
    }

    private void store(String content) throws IOException {
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        fw.write(content);
        fw.close();
    }

    private String get() throws IOException {
        Scanner scanner = new Scanner(file, "UTF-8");
        String content = scanner.useDelimiter("\\A").next();
        scanner.close();

        return content;
    }
}
