package com.loose.coupling;

import com.tight.coupling.UserManager;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager();
        System.out.println(userManagerWithDB.getUserInfo());

    }
}
