package com.ve.test;


import com.ve.test.core.MD5HashingPasswordAlgorithm;
import com.ve.test.core.PasswordUtility;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by boma on 01/11/2016.
 */
import com.ve.test.core.iPassword;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class CoreTest
{
    @Test
    public void generatePassWordSingleTest()
    {

    }
    @Test
    public void timerTest()
    {

    }
    @Test
    public void passwordAlgorithmsTest()
    {

    }
    @Test
    public void iAlgorithmGeneratingTest()
    {
        iPassword iPassword=new PasswordUtility();
        assertTrue(iPassword.algorithmGenerator("MD5") instanceof MD5HashingPasswordAlgorithm);

    }
}
