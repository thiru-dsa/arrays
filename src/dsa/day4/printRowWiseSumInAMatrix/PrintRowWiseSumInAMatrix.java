package src.dsa.day4.printRowWiseSumInAMatrix;

// Question :-
// Given matrix N*M, print row wise sum  

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2, 3],
    //   [4, 5, 6],
    //   [7, 8, 9]
    // ]

// Output: 
    // Row 1 sum: 6
    // Row 2 sum: 15
    // Row 3 sum: 24

// Time Complexity  : O(N*M)
// Space Complexity : O(1)

public class PrintRowWiseSumInAMatrix {
    
    public static void main(String[] args) {
        
        int[][] mat = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120}
        };

        printRowWiseSumInAMatrix(mat);
    }

    public static void printRowWiseSumInAMatrix(int[][] mat) {

        int rowSum;
        for(int iterator = 0; iterator < mat.length; iterator++) {
            rowSum = 0;
            for(int jterator = 0; jterator < mat[0].length; jterator++) {
                rowSum += mat[iterator][jterator];
            }
            System.out.println("Row " + (iterator + 1) + "  sum : " + rowSum);
        }
    }
}
