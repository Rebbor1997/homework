package com.company.lesson7;

public class Strings {
    public static void main(String[] args) {
        String str = "You know it";
        int index1 = str.indexOf('Y');
        int index2 = str.lastIndexOf('o');
        System.out.println("1 задание:");
        System.out.println(index1);
        System.out.println(index2);
        String substr = str.substring(index1, index2);
        System.out.println(substr);
        System.out.println("2 задание:");
        String str1 = "I followed this recommendation";
        String replStr1 = str1.replace('o', 'I');
        System.out.println(str1);
        System.out.println(replStr1);

    }
}
