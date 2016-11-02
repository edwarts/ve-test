# ve-test
**java test for ve**

Please use mvn package to make a build

Please use java -jar password-test.jar to try the demo

Please use mvn test to run test case

This password is generated based on user id and the time password created 's MD5 hashing

The seudo code for the password generating is

(userId+timeInMillionsecondOfCreatedPassword'String).MD5Hashing

The function to generate the password is returnPassword in PasswordUtility

If you want to change the way you hash your password, just implement the iAlgorithm interface

If you want to change the logic of password system, just implement the iPassword interface