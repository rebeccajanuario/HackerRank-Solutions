import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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
        
        // Set the calendar to the given date.
        // Note: The month in the Calendar class is 0-indexed (January is 0, February is 1, etc.).
        // Therefore, we subtract 1 from the input month.
        cal.set(year, month - 1, day);
        
        // Get the day of the week. This returns an integer constant.
        // Calendar.SUNDAY = 1, Calendar.MONDAY = 2, ..., Calendar.SATURDAY = 7
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        // Use an array to map the integer value to the day name string.
        String[] dayNames = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        
        // The array is 0-indexed, so we subtract 1 from the dayOfWeek value.
        return dayNames[dayOfWeek - 1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
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
