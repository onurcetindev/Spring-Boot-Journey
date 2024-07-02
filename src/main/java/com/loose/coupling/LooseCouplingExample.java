package com.loose.coupling;

import com.tight.coupling.UserManager;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        com.loose.coupling.UserManager userManagerWithDB = new com.loose.coupling.UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        com.loose.coupling.UserManager userManagerWithWS = new com.loose.coupling.UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        com.loose.coupling.UserManager userManagerWithNewDB = new com.loose.coupling.UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());

    }
}
