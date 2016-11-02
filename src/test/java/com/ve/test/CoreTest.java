package com.ve.test;


import com.sun.tools.javac.file.SymbolArchive;
import com.sun.tools.javac.util.*;
import com.ve.test.core.MD5HashingPasswordAlgorithm;
import com.ve.test.core.PasswordUtility;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by boma on 01/11/2016.
 */
import com.ve.test.core.iPassword;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class CoreTest
{
    @Test
    public void generatePassWordSingleTest()
    {
        iPassword iPassword=PasswordUtility.getPasswordUtility("MD5");
        System.out.println(iPassword.returnPassWord("user1"));

    }
    @Test
    public void timerTest()
    {
//        iPassword iPassword=PasswordUtility.getPasswordUtility("MD5");
//        String currentPassword=iPassword.returnPassWord("user1");
//        System.out.println(currentPassword);
//        //the password should be equal within 30 seconds
//        assertEquals(currentPassword,iPassword.returnPassWord("user1"));
//        try {
//            // wait for less than 30 seconds
//            Thread.sleep(15*1000L);
//            assertTrue(iPassword.verifyPassword("user1",currentPassword));
//            //wait for more than 30 seconds
//            Thread.sleep(18*1000L);
//            assertFalse(iPassword.verifyPassword("user1",currentPassword));
//            String newPassword=iPassword.returnPassWord("user1");
//            System.out.println(newPassword);
//            assertNotEquals(currentPassword,newPassword);
//            // wait for 30 seconds
//            newPassword=iPassword.returnPassWord("user1");
//            Thread.sleep(30*1000L);
//            assertFalse(iPassword.verifyPassword("user1",newPassword));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
    @Test
    public void passwordAlgorithmsTest()
    {
//        iPassword iPassword=PasswordUtility.getPasswordUtility("MD5");
//        Long currentTime=System.currentTimeMillis();
//        try {
//            Thread.sleep(35*1000L);
//            assertEquals(true,iPassword.passwordExpired(currentTime,30));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
    @Test
    public void passwordExpiredTest()
    {


    }
    @Test
    public void iAlgorithmGeneratingTest()
    {
        iPassword iPassword=PasswordUtility.getPasswordUtility("MD5");
        assertTrue(iPassword.algorithmGenerator("MD5") instanceof MD5HashingPasswordAlgorithm);
        iPassword iPasswordIllegal=PasswordUtility.getPasswordUtility("MD6");
        assertFalse(iPasswordIllegal.algorithmGenerator("MD6") instanceof MD5HashingPasswordAlgorithm);

    }
}
