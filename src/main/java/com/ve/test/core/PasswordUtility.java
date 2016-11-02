package com.ve.test.core;

import java.util.HashMap;

/**
 * Created by boma on 02/11/2016.
 */
public class PasswordUtility implements iPassword {
    HashMap<String,String> passwordBank=new HashMap<String, String>();

    public String returnPassWord(String userId) {
        return null;
    }

    public boolean verifyPassword(String passwordToBeCheck) {
        return false;
    }

    public iAlgorithm algorithmGenerator(String algorithmClassName) {
        if (algorithmClassName.equals("MD5")) {
            return new MD5HashingPasswordAlgorithm();
        } else {
            return null;
        }

    }

    public boolean passwordExpired(int expiredTime) {
        return false;
    }
}
