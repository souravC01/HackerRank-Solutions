package org.hackerRank;

import java.io.*;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year,(month-1), day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String weekDay = "";

        switch (dayOfWeek){
            case 1: weekDay = "SUNDAY"; break;
            case 2: weekDay = "MONDAY"; break;
            case 3: weekDay = "TUESDAY"; break;
            case 4: weekDay = "WEDNESDAY"; break;
            case 5: weekDay = "THURSDAY"; break;
            case 6: weekDay = "FRIDAY"; break;
            case 7: weekDay = "SATURDAY"; break;
        }
        return weekDay;
    }

}
public class JavaDateandTime {


        public static void main (String[]args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Result.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

