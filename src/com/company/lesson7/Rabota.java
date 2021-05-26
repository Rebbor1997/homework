package com.company.lesson7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rabota {

    public static void main(String args[]) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("File1");
            fileOut = new FileWriter("copied_File1");
//            fileOut = new FileWriter("copied_file.txt", true);

            int a;
//            String str = "";
            while ((a = fileIn.read()) != -1) {
//                str += (char) a;
                System.out.println(a);
                fileOut.write(a);
            }
            StringBuffer buffer = new StringBuffer();
            buffer.reverse();
            String data = buffer.toString();
            if(fileOut.equals(data)){
                System.out.println("Given String is palindrome");
            }else{
                System.out.println("Given String is not palindrome");
            }

//            fileOut.write(str);
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }


    }
    }




