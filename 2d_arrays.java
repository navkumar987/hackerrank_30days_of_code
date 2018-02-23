import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int rowSize = 6;
    int colSize = 6;
    int[][] array = new int[rowSize][colSize];
    for(int row = 0; row < rowSize; row++) {
        for(int col = 0; col < colSize; col++) {
            array[row][col] = read.nextInt();
        }
    }
    read.close();
    int max = Integer.MIN_VALUE;
    for(int row = 0; row < 4; row++) {
        for(int col = 0; col < 4; col++) {
            int sum = calculateHourglassSum(array, row, col);
            if(sum > max) {
                max = sum;
            }
        }
    }
    System.out.println(max);
}

private static int calculateHourglassSum(int[][] array, int rowIndex, int colIndex) {
    int sum = 0;
    for(int row = rowIndex; row < rowIndex + 3; row++) {
        for(int col = colIndex; col < colIndex + 3; col++) {
            if(row == rowIndex + 1 && col != colIndex + 1) {
                continue;
            }
            sum += array[row][col];
        }
    }
    return sum;
}
}
