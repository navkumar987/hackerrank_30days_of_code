import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    int result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int result=0;
        for (i=1; i<=10; i++)
        {
            result = n * i;
            System.out.println(n+" x "+i+" = " +result);
        }
        
    }
}
