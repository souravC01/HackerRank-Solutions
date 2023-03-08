package org.hackerRank;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if(input.isEmpty()){
            System.out.println("0");
            return;
        }

        String[] newData = input.split("[ ,!?._'@]+");

        System.out.println(newData.length);

        for (int i = 0; i < newData.length; i++ ) {
            System.out.println(newData[i]);
        }

    }
}
