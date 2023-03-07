package org.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        String sa=sortString(s1.toLowerCase());
        String sb=sortString(s2.toLowerCase());

        if(sa.equals(sb))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
    public static String sortString(String s){
        char[] temp =s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
