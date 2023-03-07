package org.hackerRank;

import java.util.Scanner;

import static java.lang.Character.*;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        String temp ="";
        String capital = "";
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        int sumLength = A.length() + B.length();

        System.out.println(sumLength);

        if(A.compareTo(B) > B.compareTo(A)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if (isLowerCase(A.charAt(0))){
            temp = (String.valueOf(A.charAt(0))).toUpperCase();
            capital += A.replace(String.valueOf(A.charAt(0)),temp);
        }
        else
            capital += A;

        temp = "";
        capital += " ";

        if (isLowerCase(B.charAt(0))){
            temp = (String.valueOf(B.charAt(0))).toUpperCase();
            capital += B.replace(String.valueOf(B.charAt(0)),temp);
        }
        else
            capital +=B;

        System.out.println(capital);

    }
}
