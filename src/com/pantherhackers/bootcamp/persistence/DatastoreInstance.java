package com.pantherhackers.bootcamp.persistence;

public class DatastoreInstance {

    private static Store currentStoreType;
    private static DataStore currentStore;

    public static DataStore getInstance() {
        if (currentStore != null) {
            return currentStore;
        }

        DataStore store;
        switch (currentStoreType) {
            case FILE:
                store = new FileDataStore();
                break;
            default:
                throw new IllegalStateException("Please call setStoreType before getting and instance of DataStore.");
        }

        currentStore = store;
        return currentStore;
    }

    public static void setStoreType(Store storeType) {
        currentStoreType = storeType;
    }

    public static enum Store {
        FILE
    }
}
