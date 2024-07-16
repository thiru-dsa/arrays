package src.dsa.day4.printColWiseSumInAMatrix;

// Question :-
// Given matrix N*M, print col wise sum  

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2, 3],
    //   [4, 5, 6],
    //   [7, 8, 9]
    // ]

// Output: 
    // Col 1 sum: 12
    // Col 2 sum: 15
    // Col 3 sum: 18

// Time Complexity  : O(N*M)
// Space Complexity : O(1)

public class PrintColWiseSumInAMatrix {

    public static void main(String[] args) {
        
        int[][] mat = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120}
        };

        printColWiseSumInAMatrix(mat);
    }

    public static void printColWiseSumInAMatrix(int[][] mat) {

        int colSum;
        for(int jterator = 0; jterator < mat[0].length; jterator++) {
            colSum = 0;
            for(int iterator = 0; iterator < mat.length; iterator++) {
                colSum += mat[iterator][jterator];
            }
            System.out.println("Row " + (jterator + 1) + "  sum : " + colSum);
        }
    }
}
