import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        // US formatter
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        
        // India formatter - Requires creating a new Locale for English language in India
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        
        // China formatter
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        // France formatter
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Format the payment for each currency */
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
