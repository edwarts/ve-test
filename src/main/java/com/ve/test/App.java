package com.ve.test;

import com.apple.eawt.AppEvent;
import com.ve.test.core.PasswordUtility;
import com.ve.test.core.iPassword;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        iPassword passwordSys= PasswordUtility.getPasswordUtility("MD5");
        while(true)
        {
            System.out.println( "Please input your user name" );
            String userName=System.console().readLine();
            System.out.println("Your new one off password for 30 seconds is "+passwordSys.returnPassWord(userName));
            System.out.println("Please try your password");
            Long currentTime=System.currentTimeMillis();
            String password="";
            do {
               password = System.console().readLine();
            }while(password=="");
            if(passwordSys.verifyPassword(userName,password)==true)
            {
                System.out.println("Password is correct !");
            }
            else
            {
                System.out.println("Password is not correct !");
            }
            Long newTime=System.currentTimeMillis();
            if(newTime-30*1000L>currentTime)
            {
                System.out.println("Your new one off password for 30 seconds is "+passwordSys.returnPassWord(userName));
            }
        }

    }
}
