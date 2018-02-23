import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
            int n=in.nextInt();
        String k = Integer.toBinaryString(n);
		int MaxNum = 0;
		int MinNum = 0;
		for (int i = 0; i < k.length(); i++) {
			if (k.charAt(i) == '1') {
				MinNum++;
				MaxNum = Math.max(MaxNum, MinNum);
			} else {
				MinNum = 0;
			}
		}
		System.out.println(MaxNum);

		in.close();
    }
}