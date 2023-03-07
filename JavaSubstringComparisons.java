package org.hackerRank;


import java.util.ArrayList;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String temp;
        ArrayList<String> stringReq = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {                                          //get all substring of a string
            for (int j = i + 1; j <= s.length(); j++) {
                temp = s.substring(i, j);
                if (temp.length() == k) {                                               //get substrings that are only k length
//                    System.out.println(temp);
                    stringReq.add(temp);                                                //Add to ArrayList
                }
            }
        }
//        System.out.println("------------------------------------------");

        String lowest = stringReq.get(0);

        for(int i = 0; i < stringReq.size(); i++){
            if(stringReq.get(i).compareTo(lowest) < lowest.compareTo(stringReq.get(i)))
                lowest = stringReq.get(i);
        }

        String heighest = stringReq.get(stringReq.size()-1);
        for(int i = 0; i < stringReq.size(); i++){
            if(stringReq.get(i).compareTo(heighest) > heighest.compareTo(stringReq.get(i)))
                heighest = stringReq.get(i);
        }
        return lowest + "\n" + heighest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
