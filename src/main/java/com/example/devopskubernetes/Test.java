package com.example.devopskubernetes;

import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;

public class Test {

    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "A";
        System.out.println(str1 == str2);
        System.out.println("String literal: " + (str1 == str2));
        String str3 = new String("B");
        str3.intern();
        String str4 = new String("B");
        System.out.println(str3 == str4);
        System.out.println("String object: " + (str3 == str4));
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());


    }
}
