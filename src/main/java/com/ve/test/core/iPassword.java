package com.ve.test.core;

/**
 * Created by boma on 01/11/2016.
 */
public interface iPassword {
    public String returnPassWord(String userId);
    public boolean verifyPassword(String userId,String passwordToBeCheck);
    public iAlgorithm algorithmGenerator(String algorithmClassName);
    public boolean passwordExpired(Long timeToCheck,int expiredTime);
}
