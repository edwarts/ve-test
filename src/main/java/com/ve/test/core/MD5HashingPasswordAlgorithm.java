package com.ve.test.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by boma on 01/11/2016.
 */
public class MD5HashingPasswordAlgorithm implements iAlgorithm {
    public String getGeneratedPassword(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte b[] = md.digest();
            //Generate the hashcode and build up the password
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }
}
