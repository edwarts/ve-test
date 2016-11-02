package com.ve.test.core;

import java.util.HashMap;

/**
 * Created by boma on 02/11/2016.
 */
public class PasswordUtility implements iPassword {
    static HashMap<String,PasswordEnity> passwordBank=new HashMap<String, PasswordEnity>();
    static iAlgorithm passwordAlgorithm =null;
    static PasswordUtility m_passwordUtility=null;
    public static iPassword getPasswordUtility(String algorithmName)
    {
        if (m_passwordUtility==null)
        {
            m_passwordUtility=new PasswordUtility(algorithmName);
            return m_passwordUtility;
        }
        else
        {
            return m_passwordUtility;
        }
    }
    private PasswordUtility(String algorithmName)
    {
        if (passwordAlgorithm ==null)
        {
            passwordAlgorithm = algorithmGenerator(algorithmName);
        }

    }

    public String returnPassWord(String userId) {
        if(passwordBank.containsKey(userId)==false)
        {
            //new password
            long createdTime=getCurrentTime();
            String password=passwordAlgorithm.getGeneratedPassword(userId+Long.toString(createdTime));
            passwordBank.put(userId,new PasswordEnity(password,createdTime));
            return password;

        }
        else
        {
            // password is still validate
            if(passwordExpired(passwordBank.get(userId).getCreatedTime(),30)==false)
            {
                return passwordBank.get(userId).getPassword();
            }
            // password expired and generate new password
            else
            {
                long createdTime=getCurrentTime();
                String password=passwordAlgorithm.getGeneratedPassword(userId+Long.toString(createdTime));
                passwordBank.put(userId,new PasswordEnity(password,createdTime));
                return password;
            }
        }
    }

    public boolean verifyPassword(String userId,String passwordToBeCheck) {
        if(passwordBank.containsKey(userId)==false)
            return false;
        else
        {
            if(returnPassWord(userId).equals(passwordToBeCheck))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public iAlgorithm algorithmGenerator(String algorithmClassName) {
        if (algorithmClassName.equals("MD5")) {
            return new MD5HashingPasswordAlgorithm();
        } else {
            return null;
        }

    }

    public boolean passwordExpired(Long timeToCheck,int expiredTime) {

        //if the difference between current time and time to check(password created time) is less expiredTime(default is 30)

        if(getCurrentTime()-timeToCheck>=expiredTime*1000L)
            return true;
        else
        return false;
    }
    private long getCurrentTime()
    {
        return System.currentTimeMillis();
    }
}
