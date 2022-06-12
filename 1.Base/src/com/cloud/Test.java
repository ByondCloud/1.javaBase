package com.cloud;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i >= 0; i--) {
            String account = scanner.next();
            if ("丁真".equals(account)) {
                String pwd = scanner.next();
                if ("666".equals(pwd)) {
                    System.out.println("登录成功");
                    break;
                } else {
                    System.out.println("密码错误，你还有" + i + "次机会");
                }
                System.out.println("465456");
            } else {
                System.out.println("用户名错误，你还有" + i + "次机会");
            }
        }

    }
}
