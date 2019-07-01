package com.te;

import static com.google.common.base.StandardSystemProperty.JAVA_HOME;

public class EnvVariable {

    public static void main(String[] arg) {
        System.out.println(System.getenv("HOME"));
    }
}
