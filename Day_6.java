import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        for (int i=0;i< T;i++){
                String myString = s.nextLine();
                String even = "";
                String odd = "";
                for (int j = 0; j < myString.length(); j++) {
                    if (j % 2 == 0) {
                        even += myString.charAt(j);
                    } else {
                        odd += myString.charAt(j);
                    }
                }

                System.out.println(even + " " + odd);
            }
        }
        
}