import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        double tip= ((tip_percent*meal_cost)/100);
        double tax = ((tax_percent*meal_cost)/100);
        double total = meal_cost+tip+tax;
        int total_cost =(int)  Math.round(total);
    System.out.print("The total meal cost is "+total_cost+" dollars.");
    }
        
}