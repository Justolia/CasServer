package com.justolia.encode;


import org.jasig.cas.authentication.handler.PasswordEncoder;

public class MyPasswordEncode implements PasswordEncoder {

    private static String salt = "abc";

    /**
     * 自定义加密算法
     * @param password
     * @return
     */
    @Override
    public String encode(String password) {
        System.out.println("原密码是：" + password);

        String p = StringUtil.MD5Encode(password + salt).toLowerCase();

        System.out.println("加盐MD5后的密码是：" + p);
        return p;
    }
}
