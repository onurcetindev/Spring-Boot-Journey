package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        //Directly access database here
        return "User Details from DB";
    }
}
