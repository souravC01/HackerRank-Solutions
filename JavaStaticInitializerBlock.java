package org.hackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height, breadth;

        breadth = sc.nextInt();
        height = sc.nextInt();

        if ((breadth <= 0) || (height <= 0)){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            sc.close();
        }
        else
            System.out.println(breadth*height);
    }
}
